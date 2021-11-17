package Muehle.Graphics;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Images {
    public final static String imageCircle = "src/Images/TikTakToe/cricle.png";
    public final static String imageCross = "src/Images/TikTakToe/Cross.png";
    public final static String imageWinScreen = "src/Images/TikTakToe/winSymbol.png";
    public final static String imageHintergrund = "src/Images/Muehle/BrettUndHintergrund.png";


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
