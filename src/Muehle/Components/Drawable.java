package Muehle.Components;

import java.awt.image.BufferedImage;

public class Drawable {
    private int xKoordinate;
    private int yKoordinate;
    public BufferedImage image;

    public Drawable(int x, int y) {
        this.xKoordinate = x;
        this.yKoordinate = y;
    }

    public int get_x() {
        return this.xKoordinate;
    }

    public int get_y() {
        return this.yKoordinate;
    }
}
