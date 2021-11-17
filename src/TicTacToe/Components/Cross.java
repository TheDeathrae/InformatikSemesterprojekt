package TicTacToe.Components;

import TicTacToe.Graphics.Images;

public class Cross extends Drawable {
    public Cross(int x, int y) {
        super(x, y);

        Images a = new Images();

        image = a.cross;
    }
}