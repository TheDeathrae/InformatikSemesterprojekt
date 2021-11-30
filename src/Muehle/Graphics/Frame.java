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

    public Frame() {
        Muehle.Graphics.Images a = new Images();
        setResizable(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Muehle");
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        setBounds(0, 0, screenSize.width, (screenSize.height - 30));
        add(draw_engine);
        setVisible(true);
    }
}

