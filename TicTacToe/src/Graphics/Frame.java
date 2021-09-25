package Graphics;

import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;

import Components.*;

public class Frame extends JFrame{

	Circle c1 = new Circle(0,0);
	Cross cr1 = new Cross(100,100);
	Circle c2 = new Circle(200,200);
	Cross cr2 = new Cross(300,300);
	int counter = 0;
	
	
	public Frame() {
		
		setResizable(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Tic Tac Toe ");
		setBounds(0, 0, Toolkit.getDefaultToolkit().getScreenSize().width , (Toolkit.getDefaultToolkit().getScreenSize().height - 30));
		add(new Draw(c1, cr1, 0));
		add(new Draw(c2, cr2, 1));
		setVisible(true);
		
		addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent arg0) {
				if (counter == 0) {
					
					c2.set_x(arg0.getX());
					c2.set_y(arg0.getY());
					counter++;
				}
				else {
					cr2.set_x(arg0.getX());
					cr2.set_y(arg0.getY());
					counter = 0;
				} 
				repaint();
			}

			@Override
			public void mouseEntered(MouseEvent arg0) {
				// erstmal unn�tig
				
			}

			@Override
			public void mouseExited(MouseEvent arg0) {
				// erstmal unn�tig
				
			}

			@Override
			public void mousePressed(MouseEvent arg0) {
				// erstmal unn�tig
				
			}

			@Override
			public void mouseReleased(MouseEvent arg0) {
				// erstmal unn�tig
				
			}
			
		});
	}
	 
	
}
