package menschAergereDichNicht;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;

public class ImagesM {
    public final static String imageBoard = "Images/MenschAergereDichNicht/MFeld.png";
    public final static String imageBoard2 = "Images/MenschAergereDichNicht/Spielfeld_Versuch.png";
    public final static String imageYellow = "Images/MenschAergereDichNicht/yellow.png";
    public final static String imageRed = "Images/MenschAergereDichNicht/red.png";
    public final static String imageBlue = "Images/MenschAergereDichNicht/blue.png";
    public final static String imageGreen = "Images/MenschAergereDichNicht/green.png";


    public BufferedImage board;
    public BufferedImage board2;
    public BufferedImage yellow;
    public BufferedImage red;
    public BufferedImage blue;
    public BufferedImage green;


    public ImagesM() {
        try {
            board = ImageIO.read(new File(imageBoard));
            board2 = ImageIO.read(new File(imageBoard2));
            yellow = ImageIO.read(new File(imageYellow));
            red = ImageIO.read(new File(imageRed));
            green = ImageIO.read(new File(imageGreen));
            blue = ImageIO.read(new File(imageBlue));

        } catch (IOException ex) {
            System.err.print("Bild nicht vorhanden");
        }
    }
}
