package Graphics;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseListener;

import javax.swing.*;

import Components.*;

public class Draw extends JPanel{
	
	Circle c1;
	Cross cr1;
	
	public Draw(Circle c, Cross cr) {
		this.c1 = c;
		this.cr1 = cr;
	}
	
	
	
	
	@Override
	protected void paintComponent( Graphics g ) {
		super.paintComponent(g);
		
		Graphics2D g2 = (Graphics2D) g;
		
		g2.drawImage(Images.circle, c1.get_x(), c1.get_y(), this);
		g2.drawImage(Images.cross, cr1.get_x(), cr1.get_y(), this);
	}
}
