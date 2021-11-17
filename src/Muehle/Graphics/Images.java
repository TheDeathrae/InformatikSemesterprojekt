package Muehle.Graphics;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;

public class Images {
    public final static String imageCircle = "src/Images/TikTakToe/cricle.png";
    public final static String imageCross = "src/Images/TikTakToe/Cross.png";
    public final static String imageWinScreen = "src/Images/TikTakToe/winSymbol.png";
    public final static String imageHintergrund = "src/Images/Muehle/BrettUndHintergrund.png";

    public static void main(String[] args) {
        JFrame frame = new JFrame();

        JButton b = new JButton("Click Me");//creating instance of JButton
        b.setBounds(140, 100, 120, 40);//x axis, y axis, width, height

        frame.add(b);//adding button in JFrame

        frame.setSize(400, 500);//400 width and 500 height
        frame.setLayout(null);//using no layout managers
        frame.setVisible(true);//making the frame visible
    }

    public BufferedImage circle;
    public BufferedImage cross;
    public BufferedImage winScreen;
    public BufferedImage hintergrund;


    public Images() {
        try {
            circle = ImageIO.read(new File(imageCircle));
            cross = ImageIO.read(new File(imageCross));
            winScreen = ImageIO.read(new File(imageWinScreen));
            hintergrund = ImageIO.read(new File(imageHintergrund));

        } catch (IOException ex) {
            System.err.print("Bild nicht vorhanden");
        }
    }
}