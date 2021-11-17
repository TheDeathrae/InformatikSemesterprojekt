package TicTacToe.Components;

import TicTacToe.Graphics.Images;

public class Hintergrund extends Drawable {
    public Hintergrund(int x, int y) {
        super(x, y);

        Images a = new Images();

        image = a.winScreen;
    }
}