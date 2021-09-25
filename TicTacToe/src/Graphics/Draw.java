package Graphics;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseListener;

import javax.swing.*;

import Components.*;

public class Draw extends JPanel{
	
	Circle c1;
	Cross cr1;
	Circle c2;
	Cross cr2;
	
	
	public Draw(Circle c, Cross cr, int counter) {
		
			this.c1 = c;
			this.cr1 = cr;
	}
	
	// Die Idee hier war, dass durch den Counter verschiedene Kreise und Kreuze gezeichnet werden k�nnen
	// Hat aber nicht funktioniert, da PaintComponent sich nur auf ein Objekt bezieht
	// Eine andere Idee w�re, dass Kreise und Kreuze in ihrem Konstruktor gezeichnet werden, aber wenn man
	// paintComponent r�berkopiert und Circle von JPanel erben l�sst ergeben sich immer noch Fehler
	
	
	@Override
	protected void paintComponent( Graphics g ) {
		super.paintComponent(g);
		
		Graphics2D g2 = (Graphics2D) g;
		g2.drawImage(Images.circle, c1.get_x(), c1.get_y(), 120, 120, this);
		g2.drawImage(Images.cross, cr1.get_x(), cr1.get_y(), this);
	}
}
