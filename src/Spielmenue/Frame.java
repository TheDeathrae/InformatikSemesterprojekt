package Spielmenue;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;

import javax.swing.*;


public class Frame extends JFrame implements ActionListener { // wir k�nnen auf JFrame zugreifen
    private final JButton TicTacToe;
    private final JButton Muehle;
    private final JButton Dame;
    private final JButton ende;
    private final static Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    private final static int backgoundWidth = 1053;
    private final static int backgoundHeight = 597;

    public static void main(String[] args) {

        Frame frame = new Frame("Menue");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(backgoundWidth, backgoundHeight);

        frame.setLayout(null);
        frame.setVisible(true);
    }

    public Frame(String title) { // Buttons werden erstellt
        super(title);

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        setBounds(screenSize.width / 2 - backgoundWidth / 2, (screenSize.height - 30) / 2 - backgoundHeight / 2, screenSize.width, (screenSize.height - 30));

        JLabel background;                                //Label um Hintergrundbild einzufügen
        setSize(1053, 597);
        setLayout(null);

        ImageIcon img = new ImageIcon("src/Images/Spielmenue/ChfY8Bq_3x.png");

        background = new JLabel("", img, JLabel.CENTER);
        background.setBounds(0, 0, 1053, 597);
        add(background);
        setVisible(true);

        TicTacToe = new JButton("TicTacToe starten");
        TicTacToe.setBounds(400, 60, 160, 40); // erste beiden Postion x,y die letzten beiden aktuelle Größe Breite und höhe
        TicTacToe.addActionListener(this);
        add(TicTacToe);

        Muehle = new JButton(new ImageIcon("src/Images/TikTakToe/Cross.png"));   //fügt Bild auf Button ein, fehlerhaft
        Muehle.setBounds(120, 120, 160, 40); // erste beiden Postion x,y die letzten beiden aktuelle Größe Breite und höhe
        Muehle.addActionListener(this);
        add(Muehle);

        Dame = new JButton("Dame starten");
        Dame.setBounds(120, 180, 160, 40); // erste beiden Postion x,y die letzten beiden aktuelle Größe Breite und höhe
        Dame.addActionListener(this);
        add(Dame);

        ende = new JButton("Menue schliessen");
        ende.setBounds(695, 388, 250, 110); // erste beiden Postion x,y die letzten beiden aktuelle Größe Breite und höhe
        ende.setContentAreaFilled(false); //macht button unsichtbar
        ende.addActionListener(this);
        add(ende);


    }


    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == TicTacToe) {
            TicTacToe.Graphics.Frame test;
            test = new TicTacToe.Graphics.Frame();
        }

        if (e.getSource() == Muehle) {
            Muehle.Graphics.Frame temp;
            temp = new Muehle.Graphics.Frame();

        }

        if (e.getSource() == Dame) {

        }

        if (e.getSource() == ende) {
            System.exit(0);
        }
    }
}