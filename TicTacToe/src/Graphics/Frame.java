package Graphics;

import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;

import Components.*;

public class Frame extends JFrame{

	Circle c1 = new Circle(0,0);
	Cross cr1 = new Cross(0,0);
	Circle c2 = new Circle(0,0);
	Cross cr2 = new Cross(0,0);
	Circle c3 = new Circle(0,0);
	Cross cr3 = new Cross(0,0);
	Circle c4 = new Circle(0,0);
	Cross cr4 = new Cross(0,0);
	Circle c5 = new Circle(0,0);
	Cross cr5 = new Cross(0,0);
	public static int counter = 0;
	
	
	public Frame() {
		
		setResizable(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Tic Tac Toe ");
		setBounds(0, 0, Toolkit.getDefaultToolkit().getScreenSize().width , (Toolkit.getDefaultToolkit().getScreenSize().height - 30));
		add(new Draw(c1,cr1,c2,cr2,c3,cr3,c4,cr4,c5,cr5));
		
		setVisible(true);
	
		
		addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent arg0) {
				if (counter == 0) {
					cr1.set_x(arg0.getX());
					cr1.set_y(arg0.getY());
					counter++; 
				}
				else if (counter == 1){
					c1.set_x(arg0.getX());
					c1.set_y(arg0.getY());
					counter++; 
				}
				else if (counter == 2){
					cr2.set_x(arg0.getX());
					cr2.set_y(arg0.getY());
					counter++; 
				}
				else if (counter == 3){
					c2.set_x(arg0.getX());
					c2.set_y(arg0.getY());
					counter++; 
				}
				else if (counter == 4){
					cr3.set_x(arg0.getX());
					cr3.set_y(arg0.getY());
					counter++; 
				}
				else if (counter == 5){
					c3.set_x(arg0.getX());
					c3.set_y(arg0.getY());
					counter++; 
				}
				else if (counter == 6){
					cr4.set_x(arg0.getX());
					cr4.set_y(arg0.getY());
					counter++; 
				}
				else if (counter == 7){
					c4.set_x(arg0.getX());
					c4.set_y(arg0.getY());
					counter++; 
				}
				else if (counter == 8){
					cr5.set_x(arg0.getX());
					cr5.set_y(arg0.getY());
					counter++; 
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
