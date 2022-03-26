package main;

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
}
