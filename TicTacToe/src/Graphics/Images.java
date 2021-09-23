package Graphics;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;

public class Images {
	private static String imageCircle;
	private static String imageCross;
	private static ArrayList<String> imagesField;
	
	public static BufferedImage circle; 
	public static BufferedImage cross; 
	
	public Images() {
		
		imageCircle = "src/Images/cricle.png"; 
		imageCross = "src/Images/Cross.png";
		
		try {
			circle = ImageIO.read(new File(imageCircle));
			cross = ImageIO.read(new File(imageCross));
			
		}
			catch (IOException ex) {
				System.err.print("Bild nicht vorhanden");
			}
		
	}
}
