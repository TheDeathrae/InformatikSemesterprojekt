package Muehle.Components;
import Muehle.Graphics.Images;

public class whitePieces extends Drawable {
    public whitePieces(int x, int y) {
        super(x, y);

        Images a = new Images();

        image = a.WhitePiece;
    }
}
