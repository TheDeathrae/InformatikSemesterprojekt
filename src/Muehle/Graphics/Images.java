package Muehle.Graphics;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;

public class Images {
    public final static String imageBluePiece = "src/Images/Muehle/SpielsteinBlau.png";
    public final static String imageWhitePiece = "src/Images/Muehle/SpielsteinWeiß.png";
    public final static String imageWinScreen = "src/Images/TikTakToe/winSymbol.png";
    public final static String imageHintergrund = "src/Images/Muehle/Hintergrund.png";
    public final static String imageBrett = "src/Images/Muehle/Brett.png";

    public static void main(String[] args) {
        JFrame frame = new JFrame();

        JButton b = new JButton("Click Me");//creating instance of JButton
        b.setBounds(140, 100, 120, 40);//x axis, y axis, width, height

        frame.add(b);//adding button in JFrame

        frame.setSize(400, 500);//400 width and 500 height
        frame.setLayout(null);//using no layout managers
        frame.setVisible(true);//making the frame visible
    }

    public BufferedImage BluePiece;
    public BufferedImage WhitePiece;
    public BufferedImage winScreen;
    public BufferedImage hintergrund;
    public BufferedImage brett;


    public Images() {
        try {
            BluePiece = ImageIO.read(new File(imageBluePiece));
            WhitePiece = ImageIO.read(new File(imageWhitePiece));
            winScreen = ImageIO.read(new File(imageWinScreen));
            hintergrund = ImageIO.read(new File(imageHintergrund));
            brett = ImageIO.read(new File(imageBrett));

        } catch (IOException ex) {
            System.err.print("Bild nicht vorhanden");
        }
    }
}