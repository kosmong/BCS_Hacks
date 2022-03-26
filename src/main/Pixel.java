package main;

import java.awt.*;

public class Pixel {
    private int x;
    private int y;
    private Color color;
    private boolean isBorder = false;

    public Pixel(int x, int y, Color color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setAsBorder() {
        this.isBorder = true;
    }

    public int getX() {
        return x;
    }

    public int getColourARBG() {
        return color.getRGB();
    }

    public int getY() {
        return y;
    }

    public boolean pixelInBorder() {
        return isBorder;
    }
    public Color getColor() {
        return color;

    }
}
