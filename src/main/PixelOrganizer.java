package main;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.HashMap;

public class PixelOrganizer {
    private HashMap<Integer, PixelRegion> allPixels;

    public PixelOrganizer() {
        allPixels = new HashMap<>();
        PixelRegion border = new PixelRegion();
        allPixels.put(0, border);
    }

    public void addPixel(int region, Pixel pixel) {
        if (allPixels.containsKey(region)) {
            allPixels.get(region).addPixel(pixel);
        }
    }

    public void setAllColors(BufferedImage img, int region, Color color) {
        PixelRegion changeRegion = allPixels.get(region);

        if (changeRegion != null) {
            changeRegion.setColors(img, color);
        }
    }
}
