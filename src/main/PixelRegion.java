package main;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

public class PixelRegion {
    private ArrayList<Pixel> pixels;

    public PixelRegion() {
        pixels = new ArrayList<>();
    }

    public void addPixel(Pixel pixel) {
        pixels.add(pixel);
    }

    public Pixel[][] setColors(Pixel[][] imageData, Color color) {
        for (Pixel next : pixels) {
            next.setColor(color);
            imageData[next.getX()][next.getY()].setColor(color);
        }
        return imageData;
    }
}
