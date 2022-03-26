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
        } else {
            PixelRegion pixelRegion = new PixelRegion();
            pixelRegion.addPixel(pixel);
            allPixels.put(region, pixelRegion);
        }
    }

    public Pixel[][] setAllColors(Pixel[][] imageData, int region, Color color) {
        PixelRegion changeRegion = allPixels.get(region);

        if (changeRegion != null) {
            return changeRegion.setColors(imageData, color);
        }
        return imageData;
    }

    public HashMap<Integer, PixelRegion> getAllPixels() {
        return allPixels;
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
//
//  public void setRegionToSection(x y regionNumber image) {
//      propagateRegion(x y "b" image regionNumber);
//  }
//
//  //have 2d array of all regions setup and available as regions[x][y]
//  public void propagateRegion(x y direction image regionNumber) {
//      if (regionNumber != regions[x][y] && regions[x][y] != 0 && x and y in o <= xy < WIDTH/HEIGHT) {
//          set region to be of regionNumber and add to pixelGroup
//          if (!direction.stringEquals("n")) {
//              propagateRegion(x, y+1, "s");
//          }
//          if (!direction.stringEquals("e")) {
//              propagateRegion(x-1, y, "w");
//          }
//          if (!direction.stringEquals("s")) {
//              propagateRegion(x, y-1, "n");
//          }
//          if (!direction.stringEquals("w")) {
//              propagateRegion(x+1, y, "e");
//          }
//
//
//
//
//
//
//
//
//
//  }
//
//

}
