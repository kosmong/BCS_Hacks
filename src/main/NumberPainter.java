package main;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import static java.awt.image.BufferedImage.TYPE_INT_ARGB;

public class NumberPainter {
    private BufferedImage inputImg;
    private BufferedImage outputImg;
    private PixelOrganizer organizer;
    private Pixel[][] imageData;
    private int width;
    private int height;
    private final static int BLACK = Color.BLACK.getRGB();
    private final static int WHITE = Color.WHITE.getRGB();
    private final static int TOLERANCE = Color.GRAY.getRGB();
    private final static String DIRECTORY = "src/imagesAltered";

    public NumberPainter(String imgLocation) {
        try {
            inputImg = ImageIO.read(new File(imgLocation));
            organizer = new PixelOrganizer();
            width = inputImg.getWidth();
            height = inputImg.getHeight();
            imageData = new Pixel[width][height];
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void imageCleanUp() {
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                if (inputImg.getRGB(x, y) > TOLERANCE) {
                    try {
                        imageData[x][y] = new Pixel(x, y, Color.WHITE);
                    } catch (NullPointerException n) {
                        System.out.println(x + " <- x | y -> " + y);
                        throw new RuntimeException();
                    }
                    inputImg.setRGB(x, y, WHITE);
                } else {
                    imageData[x][y] = new Pixel(x, y, Color.BLACK);
                    imageData[x][y].setAsBorder();
                    organizer.addPixel(0, imageData[x][y]);
                    inputImg.setRGB(x, y, BLACK);
                }
            }
        }
    }

    public void getStencil() {
        getBorders();
        getRegion();
    }

    public void getBorders() {
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                if (inputImg.getRGB(x, y) == BLACK) {
                    Pixel p = new Pixel(x, y, Color.BLACK);
                    p.setAsBorder();;
                    organizer.addPixel(0, p);
                }
            }
        }
    }

    public void getRegion() {
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                if (inputImg.getRGB(x, y) == WHITE) {
                    Pixel p = new Pixel(x, y, Color.WHITE);
                    organizer.addPixel(1, p);
                }
            }
        }
    }

    public void propagateColor(int x, int y, Color color) {
        boolean inBounds = x >= 0 && y >= 0 && x < width && y < height;
        if (inBounds) {
            Pixel target = imageData[x][y];
            boolean diffColor = color.getRGB() != target.getColourARBG();
            boolean notBorder = !target.pixelInBorder();
            if (diffColor && notBorder) {
                target.setColor(color);
                propagateColor(x++, y, color);
                propagateColor(x--, y, color);
                propagateColor(x, y++, color);
                propagateColor(x, y--, color);
            }
        }
    }

    public void renderImage(String fileName) {
        File outPut = new File(DIRECTORY, fileName);
        try {

            BufferedImage tempImage = new BufferedImage(width, height, inputImg.getType());
            for (int x = 0; x < width; x++) {
                for (int y = 0; y < height; y++) {
                    tempImage.setRGB(x, y, imageData[x][y].getColourARBG());
                }
            }
            ImageIO.write(tempImage, "jpeg", outPut);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void changeRegionColor(int region, Color color) {
        imageData = organizer.setAllColors(imageData, region, color);
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}
