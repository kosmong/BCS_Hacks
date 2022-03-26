package main;

import java.awt.*;
import java.awt.image.BufferedImage;
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
    // Iterate through the img array, and put it in the map.
    // right now, it will simply assign all pixels to one region (region 1) if it's not a border
    // width height pixel TBD
//    public void assignAllPixels(){
//        for (int x = 0; x < width; x++) {
//            for (int y = 0; y < height; y++) {
//                int section = getSectionForThisPixel(pixel);
//                allPixels.put(section, pixel);
//            }
//        }
//    }
//
//    public int getSectionForThisPixel(pixel){
//        if (pixel == black){
//            return 0;
//        } else {
//            return 1;
//        }
//    }

}
