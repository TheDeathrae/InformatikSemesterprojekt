package TicTacToe.Graphics;

import java.awt.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;

import Dame.MusicPlayer;
import Spielmenue.FrameSpielmenue;
import TicTacToe.Components.Circle;
import TicTacToe.Components.Cross;
import TicTacToe.Components.WinScreen;
import TicTacToe.Game.Zustand;


public class Frame extends JFrame {
    private final Zustand zustand = new Zustand();
    private final DrawEngine draw_engine = new DrawEngine();
    JButton zurueckZumMenue = new JButton();

    boolean inFrameX(int i) {
        return i >= DrawEngine.getPositionBoardX() && i < (DrawEngine.getPositionBoardX() + DrawEngine.getBoardSize());
    }

    boolean inFrameY(int i) {
        return i >= DrawEngine.getPositionBoardY() && i < (DrawEngine.getPositionBoardY() + DrawEngine.getBoardSize());
    }

    public Frame() {
        // so startet man allgemein die Musik muss am anfang jedes spezifischen frames geschehen
        MusicPlayer m = new MusicPlayer();
        // man muss vorher einen Track auswäheln: 1 ist wald 2 ist tic... 3 ist mühle 4 ist ludo und 5 dame
        m.setTrack(2);
        Thread thread = m.playerThread;
        thread.start();
        Images a = new Images();
        zurueckZumMenue.setBounds(8, 8, 115, 120); // erste beiden Postion x,y die letzten beiden aktuelle GrÃ¶ÃŸe Breite													// und hÃ¶he
        zurueckZumMenue.setContentAreaFilled(false);
        zurueckZumMenue.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                dispose();
                m.setMusicOn(false);
                FrameSpielmenue f = new FrameSpielmenue("Startmenü");
            }
        });
        add(zurueckZumMenue);
        setResizable(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Tic Tac Toe ");
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        setBounds(0, 0, screenSize.width, (screenSize.height - 30));
        add(draw_engine);

        setVisible(true);

        addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent arg0) {

                int x = arg0.getX();
                int y = arg0.getY();
                int feld_x;

                if (inFrameX(arg0.getX()-10) && inFrameY(arg0.getY()-10)) {
                    // Zustand ändern
                    if(screenSize.width == 2560){
                        feld_x = Math.floorDiv(x, (DrawEngine.boardSize / 3)) - 3;
                        System.out.println("test");
                    }
                    else{
                        System.out.println("test1");
                        feld_x = Math.floorDiv(x, (DrawEngine.boardSize / 3)) - 2;
                    }
                    //wenn zu weit rechts geclickt, kann feld_x = 3 werden, darf aber nicht sein, sonst außerhalb
                    if (feld_x > 2){
                        feld_x--;
                    }
                    int feld_y = Math.floorDiv(y, (DrawEngine.boardSize / 3)) - 1;
                    if (!zustand.setzen(feld_x + feld_y * 3)){
                        System.out.println("Fehler");
                    }
                    else{
                        // Zustand zeichnen
                        if (zustand.get_spielerAmZug() == 1) {
                            draw_engine.toDraw(new Cross((feld_x * (DrawEngine.boardSize / 3) + screenSize.width / 2 - DrawEngine.boardSize / 2) + 53, (feld_y * (DrawEngine.boardSize / 3) + screenSize.height / 2 - DrawEngine.boardSize / 2) + 53));
                        } else {
                            draw_engine.toDraw(new Circle((feld_x * (DrawEngine.boardSize / 3) + screenSize.width / 2 - DrawEngine.boardSize / 2) + 53, (feld_y * (DrawEngine.boardSize / 3) + screenSize.height / 2 - DrawEngine.boardSize / 2) + 53));
                        }
                        if (zustand.gewinnPruefen() != 0) {
                            if (zustand.gewinnPruefen() == 1) {
                                //draw_engine.reset();
                                //zustand.reset();
                                draw_engine.toDraw(new WinScreen(screenSize.width / 2, screenSize.height / 2));
                            } else {
                                System.out.println("patt");
                            }
                        }
                        repaint();
                    }
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
