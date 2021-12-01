package menschAergereDichNicht;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ImagesM {
    
    public final static String imageBoard2 = "src/Images/MenschAergereDichNicht/SpielfeldVersuch.png";
    public final static String imageYellow = "src/Images/MenschAergereDichNicht/yellow.png";
    public final static String imageRed = "src/Images/MenschAergereDichNicht/red.png";
    public final static String imageBlue = "src/Images/MenschAergereDichNicht/blue.png";
    public final static String imageGreen = "src/Images/MenschAergereDichNicht/green.png";
    public final static String image1 = "src/Images/MenschAergereDichNicht/1.png";
    public final static String image2 = "src/Images/MenschAergereDichNicht/2.png";
    public final static String image3 = "src/Images/MenschAergereDichNicht/3.png";
    public final static String image4 = "src/Images/MenschAergereDichNicht/4.png";
    public final static String image5 = "src/Images/MenschAergereDichNicht/5.png";
    public final static String image6 = "src/Images/MenschAergereDichNicht/6.png";
    public final static String imageBewegen = "src/Images/MenschAergereDichNicht/bewegen.png";
    public final static String imageYM = "src/Images/MenschAergereDichNicht/ampelYM.png";
    public final static String imageYR = "src/Images/MenschAergereDichNicht/ampelYR.png";
    public final static String imageRM = "src/Images/MenschAergereDichNicht/ampelRM.png";
    public final static String imageRR = "src/Images/MenschAergereDichNicht/ampelRR.png";
    public final static String imageGM = "src/Images/MenschAergereDichNicht/ampelGM.png";
    public final static String imageGR = "src/Images/MenschAergereDichNicht/ampelGR.png";
    public final static String imageBM = "src/Images/MenschAergereDichNicht/ampelBM.png";
    public final static String imageBR = "src/Images/MenschAergereDichNicht/ampelBR.png";




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
    public BufferedImage bewegen;
    public BufferedImage ampelYM;
    public BufferedImage ampelYR;
    public BufferedImage ampelRM;
    public BufferedImage ampelRR;
    public BufferedImage ampelGM;
    public BufferedImage ampelGR;
    public BufferedImage ampelBM;
    public BufferedImage ampelBR;
 
    


    public ImagesM() {
        try {
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
            bewegen = ImageIO.read(new File(imageBewegen));
            ampelYM = ImageIO.read(new File(imageYM));
            ampelYR = ImageIO.read(new File(imageYR));
            ampelRM = ImageIO.read(new File(imageRM));
            ampelRR = ImageIO.read(new File(imageRR));
            ampelGM = ImageIO.read(new File(imageGM));
            ampelGR = ImageIO.read(new File(imageGR));
            ampelBM = ImageIO.read(new File(imageBM));
            ampelBR = ImageIO.read(new File(imageBR));
         

        } catch (IOException ex) {
            System.err.print("Bild nicht vorhanden");
        }
    }
}
