package Muehle.Graphics;

import Muehle.Spielzustand;
import TicTacToe.Components.Circle;
import TicTacToe.Components.Cross;
import TicTacToe.Components.Drawable;
import TicTacToe.Components.WinScreen;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;


public class Frame extends JFrame {
    private final Spielzustand zustand = new Spielzustand();
    private final Muehle.Graphics.DrawEngine draw_engine = new Muehle.Graphics.DrawEngine();
    private final static JButton zug0 = new JButton();
    private final static JButton zug1 = new JButton();
    private final static JButton zug2 = new JButton();
    private final static JButton zug3 = new JButton();
    private final static JButton zug4 = new JButton();
    private final static JButton zug5 = new JButton();
    private final static JButton zug6 = new JButton();
    private final static JButton zug7 = new JButton();
    private final static JButton zug8 = new JButton();
    private final static JButton zug9 = new JButton();
    private final static JButton zug10 = new JButton();
    private final static JButton zug11 = new JButton();
    private final static JButton zug12 = new JButton();
    private final static JButton zug13 = new JButton();
    private final static JButton zug14 = new JButton();
    private final static JButton zug15 = new JButton();
    private final static JButton zug16 = new JButton();
    private final static JButton zug17 = new JButton();
    private final static JButton zug18 = new JButton();
    private final static JButton zug19 = new JButton();
    private final static JButton zug20 = new JButton();
    private final static JButton zug21 = new JButton();
    private final static JButton zug22 = new JButton();
    private final static JButton zug23 = new JButton();

    public Frame() {
        Muehle.Graphics.Images a = new Images();

        setResizable(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Muehle");
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        setBounds(0, 0, screenSize.width, (screenSize.height - 30));
        add(draw_engine);
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
        List<JButton> JButtons = new ArrayList<JButton>();
        JButtons.add(zug0);
        JButtons.add(zug1);
        JButtons.add(zug2);
        JButtons.add(zug3);
        JButtons.add(zug4);
        JButtons.add(zug5);
        JButtons.add(zug6);
        JButtons.add(zug7);
        JButtons.add(zug8);
        JButtons.add(zug9);
        JButtons.add(zug10);
        JButtons.add(zug11);
        JButtons.add(zug12);
        JButtons.add(zug13);
        JButtons.add(zug14);
        JButtons.add(zug15);
        JButtons.add(zug16);
        JButtons.add(zug17);
        JButtons.add(zug18);
        JButtons.add(zug19);
        JButtons.add(zug20);
        JButtons.add(zug21);
        JButtons.add(zug22);
        JButtons.add(zug23);
        for(int i = 0; i<24; i++){
            JButtons.get(i).setBounds(200, 200, 100, 100);
            JButtons.get(i).addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {

                }
            });
            setVisible(true);
        }
    }
}

