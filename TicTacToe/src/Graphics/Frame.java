package Graphics;

import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;

import Components.*;

public class Frame extends JFrame{

	Circle c = new Circle(0,0);
	Cross cr = new Cross(100,100);
	int counter = 0;
	
	public Frame() {
		
		setResizable(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Tic Tac Toe ");
		setBounds(0, 0, Toolkit.getDefaultToolkit().getScreenSize().width , (Toolkit.getDefaultToolkit().getScreenSize().height - 30));
		add(new Draw(c, cr));
		setVisible(true);
		
		addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent arg0) {
				if (counter == 0) {
					c.set_x(arg0.getX());
					c.set_y(arg0.getY());
					counter = 1;
				}
				else {
					cr.set_x(arg0.getX());
					cr.set_y(arg0.getY());
					counter = 0;
				}
				repaint();
			}

			@Override
			public void mouseEntered(MouseEvent arg0) {
				// erstmal unnötig
				
			}

			@Override
			public void mouseExited(MouseEvent arg0) {
				// erstmal unnötig
				
			}

			@Override
			public void mousePressed(MouseEvent arg0) {
				// erstmal unnötig
				
			}

			@Override
			public void mouseReleased(MouseEvent arg0) {
				// erstmal unnötig
				
			}
			
		});
	}
	 
	
}
