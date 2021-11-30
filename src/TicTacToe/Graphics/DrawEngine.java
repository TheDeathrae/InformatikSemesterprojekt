package TicTacToe.Graphics;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

import javax.swing.*;

import TicTacToe.Components.*;

public class DrawEngine extends JPanel {
    private final List<Drawable> drawables = new ArrayList<Drawable>();
    public static int boardSize = 801; //  durch 3 teilbar legt Höhe und Breite in Pixeln fest
    private static final Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    private static final int positionBoardX = screenSize.width / 2 - boardSize / 2; //obere linke Ecke
    private static final int positionBoardY = screenSize.height / 2 - boardSize / 2;

    public static int getBoardSize() {
        return boardSize;
    }

    public static int getPositionBoardX() {
        return positionBoardX;
    }

    public static int getPositionBoardY() {
        return positionBoardY;
    }

    public DrawEngine() {

    }

    void toDraw(Drawable newDrawable) {
        drawables.add(newDrawable);
    }

    void reset() {
        drawables.clear();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;

        Images a = new Images();

        g2.drawImage(a.hintergrund, 0, 0, screenSize.width, screenSize.height, this);
        g2.drawImage(a.a1, positionBoardX, positionBoardY, boardSize / 3, boardSize / 3, this);
        g2.drawImage(a.a2, positionBoardX + boardSize / 3, positionBoardY, boardSize / 3, boardSize / 3, this);
        g2.drawImage(a.a3, positionBoardX + boardSize / 3 * 2, positionBoardY, boardSize / 3, boardSize / 3, this);
        g2.drawImage(a.b1, positionBoardX, positionBoardY + boardSize / 3, boardSize / 3, boardSize / 3, this);
        g2.drawImage(a.b2, positionBoardX + boardSize / 3, positionBoardY + boardSize / 3, boardSize / 3, boardSize / 3, this);
        g2.drawImage(a.b3, positionBoardX + boardSize / 3 * 2, positionBoardY + boardSize / 3, boardSize / 3, boardSize / 3, this);
        g2.drawImage(a.c1, positionBoardX, positionBoardY + boardSize / 3 * 2, boardSize / 3, boardSize / 3, this);
        g2.drawImage(a.c2, positionBoardX + boardSize / 3, positionBoardY + boardSize / 3 * 2, boardSize / 3, boardSize / 3, this);
        g2.drawImage(a.c3, positionBoardX + boardSize / 3 * 2, positionBoardY + boardSize / 3 * 2, boardSize / 3, boardSize / 3, this);
        g2.drawImage(a.rahmen, positionBoardX - 35, positionBoardY - 35, boardSize + 70, boardSize + 70, this);

        int f = (int) (boardSize / 3 * 0.6); //passt Größe des Bildes an Feld an

        for (Drawable drawable : drawables) {
            g2.drawImage(drawable.image, drawable.get_x(), drawable.get_y(), f, f, this);
        }
    }
}