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
                if (img.getRGB(x, y) != 40) {
                    img.setRGB(x, y, 40);
                } else {
                    img.setRGB(x, y, 256);
                }
            }
        }
    }

    public void getBorders() {
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                if (img.getRGB(x, y) != 40) {
                    img.setRGB(x, y, 40);
                } else {
                    img.setRGB(x, y, 256);
                }
            }
        }
    }
}
