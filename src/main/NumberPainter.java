package main;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class NumberPainter {
    private BufferedImage img;
    private PixelOrganizer organizer;
    private int width = img.getWidth();
    private int height = img.getHeight();
    private final static int BLACK = Color.BLACK.getRGB();
    private final static int WHITE = Color.WHITE.getRGB();
    private final static int TOLERANCE = Color.GRAY.getRGB();

    public NumberPainter(String imgLocation) {
        try {
            img = ImageIO.read(new File(imgLocation));
            organizer = new PixelOrganizer();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void imageCleanUp() {
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                if (img.getRGB(x, y) <= TOLERANCE) {
                    img.setRGB(x, y, WHITE);
                } else {
                    img.setRGB(x, y, BLACK);
                }
            }
        }
    }

    public void getBorders() {
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                if (img.getRGB(x, y) == BLACK) {
                    Pixel p = new Pixel(x, y, Color.BLACK);
                    organizer.addPixel(0, p);
                }
            }
        }
    }
}
