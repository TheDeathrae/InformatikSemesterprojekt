package Muehle.Graphics;

import Muehle.Spielzustand;
import TicTacToe.Components.Circle;
import TicTacToe.Components.Cross;
import TicTacToe.Components.WinScreen;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


public class Frame extends JFrame {
    private final Spielzustand zustand = new Spielzustand();
    private final Muehle.Graphics.DrawEngine draw_engine = new Muehle.Graphics.DrawEngine();

    boolean inFrameX(int i) {
        return i >= TicTacToe.Graphics.DrawEngine.getPositionBoardX() && i < (TicTacToe.Graphics.DrawEngine.getPositionBoardX() + TicTacToe.Graphics.DrawEngine.getBoardSize());
    }

    boolean inFrameY(int i) {
        return i >= TicTacToe.Graphics.DrawEngine.getPositionBoardY() && i < (TicTacToe.Graphics.DrawEngine.getPositionBoardY() + TicTacToe.Graphics.DrawEngine.getBoardSize());
    }

    public Frame() {
        Muehle.Graphics.Images a = new Images();

        setResizable(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Muehle");
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        setBounds(0, 0, screenSize.width, (screenSize.height - 30));
        add(draw_engine);

        setVisible(true);

        addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent arg0) {

                int x = arg0.getX();
                int y = arg0.getY();

                if (inFrameX(arg0.getX()) && inFrameY(arg0.getY())) {
                    // Zustand ändern
                    int feld_x = Math.floorDiv(x, (TicTacToe.Graphics.DrawEngine.boardSize / 3)) - 3;
                    int feld_y = Math.floorDiv(y, (TicTacToe.Graphics.DrawEngine.boardSize / 3)) - 1;
                    zustand.setzen(feld_x + feld_y * 3);
                    // Zustand zeichnen
                    if (zustand.get_spielerAmZug() == 1) {
                        draw_engine.toDraw(new Cross(feld_x * (TicTacToe.Graphics.DrawEngine.boardSize / 3) + screenSize.width / 2 - TicTacToe.Graphics.DrawEngine.boardSize / 2, feld_y * (TicTacToe.Graphics.DrawEngine.boardSize / 3) + screenSize.height / 2 - TicTacToe.Graphics.DrawEngine.boardSize / 2));
                    } else {
                        draw_engine.toDraw(new Circle(feld_x * (TicTacToe.Graphics.DrawEngine.boardSize / 3) + screenSize.width / 2 - TicTacToe.Graphics.DrawEngine.boardSize / 2, feld_y * (TicTacToe.Graphics.DrawEngine.boardSize / 3) + screenSize.height / 2 - DrawEngine.boardSize / 2));
                    }
                    if (Spielzustand.gewinnPruefen() != 0) {
                        if (Spielzustand.gewinnPruefen() == 1) {
                            draw_engine.toDraw(new WinScreen(screenSize.width / 2, screenSize.height / 2));
                            //draw_engine.reset();
                            //zustand.reset();
                        } else {
                            System.out.println("patt");
                        }
                    }
                    repaint();
                }
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
    }
}

