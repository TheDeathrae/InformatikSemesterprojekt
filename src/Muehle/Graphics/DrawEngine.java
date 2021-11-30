package Muehle.Graphics;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.*;
import javax.swing.tree.AbstractLayoutCache;

import Muehle.Spielzustand;
import Muehle.Components.*;
import Muehle.Components.bluePieces;
import Muehle.Components.whitePieces;

public class DrawEngine extends JPanel {
    private final Spielzustand spielzustand = new Spielzustand();
    private static final Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    public static int boardSize = 801;
    public static int boardCornerWidth = screenSize.width / 2 - boardSize / 2;
    public static int boardCornerHeight = screenSize.height / 2 - boardSize / 2;
    public static int buttonSize = 84;
    private JButton zug0 = new JButton("0");
    private JButton zug1 = new JButton("1");
    private JButton zug2 = new JButton("2");
    private JButton zug3 = new JButton("3");
    private JButton zug4 = new JButton("4");
    private JButton zug5 = new JButton("5");
    private JButton zug6 = new JButton("6");
    private JButton zug7 = new JButton("7");
    private JButton zug8 = new JButton("8");
    private JButton zug9 = new JButton("9");
    private JButton zug10 = new JButton("10");
    private JButton zug11 = new JButton("11");
    private JButton zug12 = new JButton("12");
    private JButton zug13 = new JButton("13");
    private JButton zug14 = new JButton("14");
    private JButton zug15 = new JButton("15");
    private JButton zug16 = new JButton("16");
    private JButton zug17 = new JButton("17");
    private JButton zug18 = new JButton("18");
    private JButton zug19 = new JButton("19");
    private JButton zug20 = new JButton("20");
    private JButton zug21 = new JButton("21");
    private JButton zug22 = new JButton("22");
    private JButton zug23 = new JButton("23");

    private final List<Drawable> drawables = new ArrayList<Drawable>();

    void toDraw(Drawable newDrawable) {
        drawables.add(newDrawable);
    }

    void reset() {
        drawables.clear();
    }

    @Override
    protected void paintComponent(Graphics g) {
        add(zug0);
        add(zug1);
        add(zug2);
        add(zug3);
        add(zug4);
        add(zug5);
        add(zug6);
        add(zug7);
        add(zug8);
        add(zug9);
        add(zug10);
        add(zug11);
        add(zug12);
        add(zug13);
        add(zug14);
        add(zug15);
        add(zug16);
        add(zug17);
        add(zug18);
        add(zug19);
        add(zug20);
        add(zug21);
        add(zug22);
        add(zug23);
        zug0.setBounds(boardCornerWidth, boardCornerHeight, buttonSize, buttonSize);
        zug0.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (spielzustand.get_spielerAmZug() == 1) {
                    toDraw(new whitePieces(zug0.getWidth(), zug0.getHeight()));
                } else {
                    toDraw(new bluePieces(zug0.getWidth(), zug0.getHeight()));
                }
                repaint();
            }
        });
        setVisible(true);
        zug1.setBounds(boardCornerWidth + boardSize / 2 - buttonSize / 2, boardCornerHeight, buttonSize, buttonSize);
        zug1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

            }
        });
        setVisible(true);
        zug2.setBounds(boardCornerWidth + boardSize - buttonSize, boardCornerHeight, buttonSize, buttonSize);
        zug2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (spielzustand.get_spielerAmZug() == 1) {
                    toDraw(new whitePieces(zug0.getWidth(), zug0.getHeight()));
                } else {
                    toDraw(new bluePieces(zug0.getWidth(), zug0.getHeight()));
                }
                repaint();
            }
        });
        setVisible(true);
        zug3.setBounds(boardCornerWidth + (boardSize / 5) - buttonSize / 2, boardCornerHeight + boardSize / 5 - buttonSize/2, buttonSize, buttonSize);
        zug3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (spielzustand.get_spielerAmZug() == 1) {
                    toDraw(new whitePieces(zug0.getWidth(), zug0.getHeight()));
                } else {
                    toDraw(new bluePieces(zug0.getWidth(), zug0.getHeight()));
                }
                repaint();
            }
        });
        setVisible(true);
        zug4.setBounds(boardCornerWidth + (boardSize / 2) - buttonSize / 2, boardCornerHeight + boardSize / 5 - buttonSize/2, buttonSize, buttonSize);
        zug4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (spielzustand.get_spielerAmZug() == 1) {
                    toDraw(new whitePieces(zug0.getWidth(), zug0.getHeight()));
                } else {
                    toDraw(new bluePieces(zug0.getWidth(), zug0.getHeight()));
                }
                repaint();
            }
        });
        setVisible(true);
        zug5.setBounds(boardCornerWidth + (boardSize / 5) * 4 - buttonSize / 2, boardCornerHeight + boardSize / 5 - buttonSize/2, buttonSize, buttonSize);
        zug5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (spielzustand.get_spielerAmZug() == 1) {
                    toDraw(new whitePieces(zug0.getWidth(), zug0.getHeight()));
                } else {
                    toDraw(new bluePieces(zug0.getWidth(), zug0.getHeight()));
                }
                repaint();
            }
        });
        setVisible(true);
        zug6.setBounds(boardCornerWidth + (boardSize / 3) - buttonSize / 2, boardCornerHeight + boardSize / 3 - buttonSize/2, buttonSize, buttonSize);
        zug6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (spielzustand.get_spielerAmZug() == 1) {
                    toDraw(new whitePieces(zug0.getWidth(), zug0.getHeight()));
                } else {
                    toDraw(new bluePieces(zug0.getWidth(), zug0.getHeight()));
                }
                repaint();
            }
        });
        setVisible(true);
        zug7.setBounds(boardCornerWidth + (boardSize / 2) - buttonSize / 2, boardCornerHeight + boardSize / 3 - buttonSize/2, buttonSize, buttonSize);
        zug7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (spielzustand.get_spielerAmZug() == 1) {
                    toDraw(new whitePieces(zug0.getWidth(), zug0.getHeight()));
                } else {
                    toDraw(new bluePieces(zug0.getWidth(), zug0.getHeight()));
                }
                repaint();
            }
        });
        setVisible(true);
        zug8.setBounds(boardCornerWidth + (boardSize / 3) * 2 - buttonSize / 2, boardCornerHeight + boardSize / 3 - buttonSize/2, buttonSize, buttonSize);
        zug8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (spielzustand.get_spielerAmZug() == 1) {
                    toDraw(new whitePieces(zug0.getWidth(), zug0.getHeight()));
                } else {
                    toDraw(new bluePieces(zug0.getWidth(), zug0.getHeight()));
                }
                repaint();
            }
        });
        setVisible(true);
        zug9.setBounds(boardCornerWidth, boardCornerHeight + boardSize/2 - buttonSize/2, buttonSize, buttonSize);
        zug9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (spielzustand.get_spielerAmZug() == 1) {
                    toDraw(new whitePieces(zug0.getWidth(), zug0.getHeight()));
                } else {
                    toDraw(new bluePieces(zug0.getWidth(), zug0.getHeight()));
                }
                repaint();
            }
        });
        setVisible(true);
        zug10.setBounds(boardCornerWidth + (boardSize / 5) - buttonSize / 2, boardCornerHeight + boardSize/2 - buttonSize/2, buttonSize, buttonSize);
        zug10.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (spielzustand.get_spielerAmZug() == 1) {
                    toDraw(new whitePieces(zug0.getWidth(), zug0.getHeight()));
                } else {
                    toDraw(new bluePieces(zug0.getWidth(), zug0.getHeight()));
                }
                repaint();
            }
        });
        setVisible(true);
        zug11.setBounds(boardCornerWidth + (boardSize / 3) - buttonSize / 2, boardCornerHeight + boardSize/2 - buttonSize/2, buttonSize, buttonSize);
        zug11.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (spielzustand.get_spielerAmZug() == 1) {
                    toDraw(new whitePieces(zug0.getWidth(), zug0.getHeight()));
                } else {
                    toDraw(new bluePieces(zug0.getWidth(), zug0.getHeight()));
                }
                repaint();
            }
        });
        setVisible(true);
        zug12.setBounds(boardCornerWidth + (boardSize / 3) * 2 - buttonSize / 2, boardCornerHeight + boardSize / 2 - buttonSize/2, buttonSize, buttonSize);
        zug12.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (spielzustand.get_spielerAmZug() == 1) {
                    toDraw(new whitePieces(zug0.getWidth(), zug0.getHeight()));
                } else {
                    toDraw(new bluePieces(zug0.getWidth(), zug0.getHeight()));
                }
                repaint();
            }
        });
        setVisible(true);
        zug13.setBounds(boardCornerWidth + (boardSize / 5) * 4 - buttonSize / 2, boardCornerHeight + boardSize / 2 - buttonSize/2, buttonSize, buttonSize);
        zug13.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (spielzustand.get_spielerAmZug() == 1) {
                    toDraw(new whitePieces(zug0.getWidth(), zug0.getHeight()));
                } else {
                    toDraw(new bluePieces(zug0.getWidth(), zug0.getHeight()));
                }
                repaint();
            }
        });
        setVisible(true);
        zug14.setBounds(boardCornerWidth + boardSize - buttonSize, boardCornerHeight + boardSize / 2 - buttonSize/2, buttonSize, buttonSize);
        zug14.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (spielzustand.get_spielerAmZug() == 1) {
                    toDraw(new whitePieces(zug0.getWidth(), zug0.getHeight()));
                } else {
                    toDraw(new bluePieces(zug0.getWidth(), zug0.getHeight()));
                }
                repaint();
            }
        });
        setVisible(true);
        zug15.setBounds(boardCornerWidth + (boardSize / 3)- buttonSize / 2, boardCornerHeight + boardSize / 3 *2 - buttonSize/2, buttonSize, buttonSize);
        zug15.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (spielzustand.get_spielerAmZug() == 1) {
                    toDraw(new whitePieces(zug0.getWidth(), zug0.getHeight()));
                } else {
                    toDraw(new bluePieces(zug0.getWidth(), zug0.getHeight()));
                }
                repaint();
            }
        });
        setVisible(true);
        zug16.setBounds(boardCornerWidth + (boardSize / 2) - buttonSize / 2, boardCornerHeight + boardSize / 3 *2 - buttonSize/2, buttonSize, buttonSize);
        zug16.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (spielzustand.get_spielerAmZug() == 1) {
                    toDraw(new whitePieces(zug0.getWidth(), zug0.getHeight()));
                } else {
                    toDraw(new bluePieces(zug0.getWidth(), zug0.getHeight()));
                }
                repaint();
            }
        });
        setVisible(true);
        zug17.setBounds(boardCornerWidth + (boardSize / 3) * 2 - buttonSize / 2, boardCornerHeight + boardSize / 3 *2 - buttonSize/2, buttonSize, buttonSize);
        zug17.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (spielzustand.get_spielerAmZug() == 1) {
                    toDraw(new whitePieces(zug0.getWidth(), zug0.getHeight()));
                } else {
                    toDraw(new bluePieces(zug0.getWidth(), zug0.getHeight()));
                }
                repaint();
            }
        });
        setVisible(true);
        zug18.setBounds(boardCornerWidth + (boardSize / 5) - buttonSize / 2, boardCornerHeight + boardSize / 5 * 4 - buttonSize/2, buttonSize, buttonSize);
        zug18.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (spielzustand.get_spielerAmZug() == 1) {
                    toDraw(new whitePieces(zug0.getWidth(), zug0.getHeight()));
                } else {
                    toDraw(new bluePieces(zug0.getWidth(), zug0.getHeight()));
                }
                repaint();
            }
        });
        setVisible(true);
        zug19.setBounds(boardCornerWidth + (boardSize / 2) - buttonSize / 2, boardCornerHeight + boardSize / 5 * 4 - buttonSize/2, buttonSize, buttonSize);
        zug19.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (spielzustand.get_spielerAmZug() == 1) {
                    toDraw(new whitePieces(zug0.getWidth(), zug0.getHeight()));
                } else {
                    toDraw(new bluePieces(zug0.getWidth(), zug0.getHeight()));
                }
                repaint();
            }
        });
        setVisible(true);
        zug20.setBounds(boardCornerWidth + (boardSize / 5) * 4 - buttonSize / 2, boardCornerHeight + boardSize / 5 * 4 - buttonSize/2, buttonSize, buttonSize);
        zug20.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (spielzustand.get_spielerAmZug() == 1) {
                    toDraw(new whitePieces(zug0.getWidth(), zug0.getHeight()));
                } else {
                    toDraw(new bluePieces(zug0.getWidth(), zug0.getHeight()));
                }
                repaint();
            }
        });
        setVisible(true);
        zug21.setBounds(boardCornerWidth, boardCornerHeight + boardSize - buttonSize, buttonSize, buttonSize);
        zug21.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (spielzustand.get_spielerAmZug() == 1) {
                    toDraw(new whitePieces(zug0.getWidth(), zug0.getHeight()));
                } else {
                    toDraw(new bluePieces(zug0.getWidth(), zug0.getHeight()));
                }
                repaint();
            }
        });
        setVisible(true);
        zug22.setBounds(boardCornerWidth + boardSize / 2 - buttonSize / 2, boardCornerHeight + boardSize - buttonSize, buttonSize, buttonSize);
        zug22.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (spielzustand.get_spielerAmZug() == 1) {
                    toDraw(new whitePieces(zug0.getWidth(), zug0.getHeight()));
                } else {
                    toDraw(new bluePieces(zug0.getWidth(), zug0.getHeight()));
                }
                repaint();
            }
        });
        setVisible(true);
        zug23.setBounds(boardCornerWidth + boardSize - buttonSize, boardCornerHeight + boardSize - buttonSize, buttonSize, buttonSize);
        zug23.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (spielzustand.get_spielerAmZug() == 1) {
                    toDraw(new whitePieces(zug0.getWidth(), zug0.getHeight()));
                } else {
                    toDraw(new bluePieces(zug0.getWidth(), zug0.getHeight()));
                }
                repaint();
            }
        });
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;

        Images a = new Images();

        g2.drawImage(a.brett, screenSize.width / 2 - boardSize / 2, screenSize.height / 2 - boardSize / 2, boardSize, boardSize, this);
        g2.drawImage(a.hintergrund, 0, 0, screenSize.width, screenSize.height, this);

        for (Drawable drawable : drawables) {
            g2.drawImage(drawable.image, drawable.get_x(), drawable.get_y(), screenSize.width, screenSize.height, this);
        }
    }
}