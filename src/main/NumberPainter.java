package main;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class NumberPainter {
    private BufferedImage inputImg;
    //private BufferedImage outputImg;
    private PixelOrganizer organizer;
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

            //outputImg = new BufferedImage(width, height, WHITE);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void imageCleanUp() {
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                if (inputImg.getRGB(x, y) > TOLERANCE) {
                    inputImg.setRGB(x, y, WHITE);
                } else {
                    inputImg.setRGB(x, y, BLACK);
                }
            }
        }
    }

    //changed to non border
    public void getBorders() {
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                if (inputImg.getRGB(x, y) == BLACK) {
                    Pixel p = new Pixel(x, y, Color.BLACK);
                    organizer.addPixel(0, p);
                }
            }
        }
    }

    public void renderImage(String fileName) {
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {

            }
        }

        File outPut = new File(DIRECTORY, fileName);
        try {
            ImageIO.write(inputImg, "jpeg", outPut);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void changeRegionColor(int region, Color color) {
        organizer.setAllColors(inputImg, region, color);
    }
}
