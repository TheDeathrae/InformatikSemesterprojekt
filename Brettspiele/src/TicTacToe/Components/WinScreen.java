package TicTacToe.Components;

import TicTacToe.Graphics.Images;

public class WinScreen extends Drawable {
    public WinScreen(int x, int y) {
        super(x, y);

        Images a = new Images();

        image = a.winScreen;
    }
}
