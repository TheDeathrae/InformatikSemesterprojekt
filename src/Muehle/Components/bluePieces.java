package Muehle.Components;
import Muehle.Graphics.Images;

public class bluePieces extends Drawable {
    public bluePieces(int x, int y) {
        super(x, y);

        Images a = new Images();

        image = a.BluePiece;
    }
}