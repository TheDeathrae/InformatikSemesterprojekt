package Muehle.Graphics;

import javax.swing.*;
import java.awt.*;


public class Frame extends JFrame {
    private Muehle.Graphics.DrawEngine draw_engine = new Muehle.Graphics.DrawEngine();

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