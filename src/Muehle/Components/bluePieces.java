package Muehle.Components;
import Muehle.Graphics.Images;

import java.awt.*;
import java.awt.image.BufferedImage;

public class bluePieces extends Drawable {
    public bluePieces(int x, int y) {
        super(x, y);

        Images a = new Images();

        image = a.BluePiece;
    }
}