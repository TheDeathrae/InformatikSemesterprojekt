package menschAergereDichNicht;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;

public class ImagesM {
    public final static String imageBoard = "Images/MenschAergereDichNicht/MFeld.png";
    


    public BufferedImage board;



    public ImagesM() {
        try {
            board = ImageIO.read(new File(imageBoard));
          

        } catch (IOException ex) {
            System.err.print("Bild nicht vorhanden");
        }
    }
}
