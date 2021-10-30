package Graphics;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;

public class Images {
	private static String imageCircle;
	private static String imageCross;
	private static String imageA1;
	private static String imageA2;
	private static String imageA3;
	private static String imageB1;
	private static String imageB2;
	private static String imageB3;
	private static String imageC1;
	private static String imageC2;
	private static String imageC3;
	
	
	public static BufferedImage circle; 
	public static BufferedImage cross;
	public static BufferedImage a1;
	public static BufferedImage a2;
	public static BufferedImage a3;
	public static BufferedImage b1;
	public static BufferedImage b2;
	public static BufferedImage b3;
	public static BufferedImage c1;
	public static BufferedImage c2;
	public static BufferedImage c3;
	
	
	

	
	public Images() {
		
		imageCircle = "src/Images/cricle.png"; 
		imageCross = "src/Images/Cross.png";
		imageA1 = "src/Images/A1.png";
		imageA2 = "src/Images/A2.png";
		imageA3 = "src/Images/A3.png";
		imageB1 = "src/Images/B1.png";
		imageB2 = "src/Images/B2.png";
		imageB3 = "src/Images/B3.png";
		imageC1 = "src/Images/C1.png";
		imageC2 = "src/Images/C2.png";
		imageC3 = "src/Images/C3.png";
		
		
		try {
			circle = ImageIO.read(new File(imageCircle));
			cross = ImageIO.read(new File(imageCross));
			a1 = ImageIO.read(new File(imageA1));
			a2 = ImageIO.read(new File(imageA2));
			a3 = ImageIO.read(new File(imageA3));
			b1 = ImageIO.read(new File(imageB1));
			b2 = ImageIO.read(new File(imageB2));
			b3 = ImageIO.read(new File(imageB3));
			c1 = ImageIO.read(new File(imageC1));
			c2 = ImageIO.read(new File(imageC2));
			c3 = ImageIO.read(new File(imageC3));
			
			
			
			
		}
			catch (IOException ex) {
				System.err.print("Bild nicht vorhanden");
			}
		
	}
	
}
