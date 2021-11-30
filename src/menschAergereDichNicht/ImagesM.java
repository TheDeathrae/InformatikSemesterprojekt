package menschAergereDichNicht;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;

public class ImagesM {
    public final static String imageBoard = "Images/MenschAergereDichNicht/MFeld.png";
    public final static String imageBoard2 = "Images/MenschAergereDichNicht/Spielfeld Versuch.png";
    public final static String imageYellow = "Images/MenschAergereDichNicht/yellow.png";
    public final static String imageRed = "Images/MenschAergereDichNicht/red.png";
    public final static String imageBlue = "Images/MenschAergereDichNicht/blue.png";
    public final static String imageGreen = "Images/MenschAergereDichNicht/green.png";
    public final static String image1 = "Images/MenschAergereDichNicht/1.png";
    public final static String image2 = "Images/MenschAergereDichNicht/2.png";
    public final static String image3 = "Images/MenschAergereDichNicht/3.png";
    public final static String image4 = "Images/MenschAergereDichNicht/4.png";
    public final static String image5 = "Images/MenschAergereDichNicht/5.png";
    public final static String image6 = "Images/MenschAergereDichNicht/6.png";


    public BufferedImage board;
    public BufferedImage board2;
    public BufferedImage yellow;
    public BufferedImage red;
    public BufferedImage blue;
    public BufferedImage green;
    public BufferedImage eins;
    public BufferedImage zwei;
    public BufferedImage drei;
    public BufferedImage vier;
    public BufferedImage fuenf;
    public BufferedImage sechs;
    


    public ImagesM() {
        try {
            board = ImageIO.read(new File(imageBoard));
            board2 = ImageIO.read(new File(imageBoard2));
            yellow = ImageIO.read(new File(imageYellow));
            red = ImageIO.read(new File(imageRed));
            green = ImageIO.read(new File(imageGreen));
            blue = ImageIO.read(new File(imageBlue));
            eins = ImageIO.read(new File(image1));
            zwei = ImageIO.read(new File(image2));
            drei = ImageIO.read(new File(image3));
            vier = ImageIO.read(new File(image4));
            fuenf = ImageIO.read(new File(image5));
            sechs = ImageIO.read(new File(image6));

        } catch (IOException ex) {
            System.err.print("Bild nicht vorhanden");
        }
    }
}
