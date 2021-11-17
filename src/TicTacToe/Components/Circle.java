package TicTacToe.Components;

import TicTacToe.Graphics.Images;

public class Circle extends Drawable {
    public Circle(int x, int y) {
        super(x, y);

        Images a = new Images();

        image = a.circle;
    }
}