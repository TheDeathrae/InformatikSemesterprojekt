package menschAergereDichNicht;

import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

import java.awt.Toolkit;
public class Draw extends JPanel{
	
	
	
	int y = Toolkit.getDefaultToolkit().getScreenSize().height;
	int x = Toolkit.getDefaultToolkit().getScreenSize().width;
	@Override
	protected void paintComponent(Graphics g) {
		
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;

        ImagesM a = new ImagesM();
        
        g2.drawImage(a.board2, 0, 0,1920,1080, this);
    }
}
	
