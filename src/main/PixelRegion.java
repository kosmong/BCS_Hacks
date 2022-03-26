package main;

import java.util.ArrayList;

public class PixelRegion {
    private ArrayList<Pixel> pixels;

    public PixelRegion() {
        pixels = new ArrayList<>();
    }

    public void addPixel(Pixel pixel) {
        pixels.add(pixel);
    }
}
