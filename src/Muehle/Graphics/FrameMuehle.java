package Muehle.Graphics;

import Dame.MusicPlayer;
import Spielmenue.FrameSpielmenue;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class FrameMuehle extends JFrame {
    private Muehle.Graphics.DrawEngine draw_engine = new Muehle.Graphics.DrawEngine();
    JButton zurueckZumMenue = new JButton();


    public FrameMuehle() {
        // so startet man allgemein die Musik muss am anfang jedes spezifischen frames geschehen
        MusicPlayer m = new MusicPlayer();
        // man muss vorher einen Track auswäheln: 1 ist wald 2 ist tic... 3 ist mühle 4 ist ludo und 5 dame
        m.setTrack(3);
        Thread thread = m.playerThread;
        thread.start();
        Muehle.Graphics.Images a = new Images();
        setResizable(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Muehle");
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        setBounds(0, 0, screenSize.width, (screenSize.height - 30));
        add(draw_engine);
        setVisible(true);
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
    }
}