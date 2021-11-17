package TicTacToe.Graphics;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Images {
    public final static String imageCircle = "src/Images/TikTakToe/cricle.png";
    public final static String imageCross = "src/Images/TikTakToe/Cross.png";
    public final static String imagetempcross = "src/Images/TikTakToe/tempcross.png";
    public final static String imageWinScreen = "src/Images/TikTakToe/winScreen.png";
    private final static String imageA1 = "src/Images/TikTakToe/A1.png";;
    private final static String imageA2 = "src/Images/TikTakToe/A2.png";;
    private final static String imageA3 = "src/Images/TikTakToe/A3.png";;
    private final static String imageB1 = "src/Images/TikTakToe/B1.png";;
    private final static String imageB2 = "src/Images/TikTakToe/B2.png";;
    private final static String imageB3 = "src/Images/TikTakToe/B3.png";;
    private final static String imageC1 = "src/Images/TikTakToe/C1.png";;
    private final static String imageC2 = "src/Images/TikTakToe/C2.png";;
    private final static String imageC3 = "src/Images/TikTakToe/C3.png";;


    public BufferedImage circle;
    public BufferedImage cross;
    public BufferedImage tempcross;
    public BufferedImage winScreen;
    public BufferedImage a1;
    public BufferedImage a2;
    public BufferedImage a3;
    public BufferedImage b1;
    public BufferedImage b2;
    public BufferedImage b3;
    public BufferedImage c1;
    public BufferedImage c2;
    public BufferedImage c3;


    public Images() {
        try {
            circle = ImageIO.read(new File(imageCircle));
            cross = ImageIO.read(new File(imageCross));
            tempcross = ImageIO.read(new File(imagetempcross));
            winScreen = ImageIO.read(new File(imageWinScreen));
            a1 = ImageIO.read(new File(imageA1));
            a2 = ImageIO.read(new File(imageA2));
            a3 = ImageIO.read(new File(imageA3));
            b1 = ImageIO.read(new File(imageB1));
            b2 = ImageIO.read(new File(imageB2));
            b3 = ImageIO.read(new File(imageB3));
            c1 = ImageIO.read(new File(imageC1));
            c2 = ImageIO.read(new File(imageC2));
            c3 = ImageIO.read(new File(imageC3));


        } catch (IOException ex) {
            System.err.print("Bild nicht vorhanden");
        }

    }

}
