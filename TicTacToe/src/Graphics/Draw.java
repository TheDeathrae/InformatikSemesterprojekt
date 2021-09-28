package Graphics;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseListener;

import javax.swing.*;

import Components.*;

public class Draw extends JPanel{
	
	Circle c1;
	Cross cr1;
	int choose;
	
	
	
	public Draw(Circle c, Cross cr, int counter) {
		
			this.c1 = c;
			this.cr1 = cr;
			this.choose = counter;
	}
	
	// Die Idee hier war, dass durch den Counter verschiedene Kreise und Kreuze gezeichnet werden können
	// Hat aber nicht funktioniert, da PaintComponent sich nur auf ein Objekt bezieht
	// Eine andere Idee wäre, dass Kreise und Kreuze in ihrem Konstruktor gezeichnet werden, aber wenn man
	// paintComponent rüberkopiert und Circle von JPanel erben lässt ergeben sich immer noch Fehler
	
	
	@Override
	protected void paintComponent( Graphics g ) {
		super.paintComponent(g);
		
		Graphics2D g2 = (Graphics2D) g;
		if (choose % 2 == 0) {
			g2.drawImage(Images.cross, cr1.get_x(), cr1.get_y(),120, 120, this);
			}
		if (choose % 2 == 1) {
			g2.drawImage(Images.circle, c1.get_x(), c1.get_y(), 120, 120, this);
			}
	}
}
