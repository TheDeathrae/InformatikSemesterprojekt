package Spielmen�;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

import Graphics.FrameTicTacToe;
import Graphics.Images;

public class frame extends JFrame implements ActionListener { // wir k�nnen auf JFrame zugreifen 

		private JButton TicTacToe; 
		private JButton M�hle;
		private JButton Dame;
		private JButton ende; 
	
	public static void main(String[] args) {
		
		frame frame = new frame("Men�");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize (400,400); 
		
		
		frame.setLayout(null); 
		frame.setVisible(true); 
	}
	
	public frame(String title) { // Buttons werden erstellt 
		super(title);
		
		TicTacToe = new JButton("TicTacToe starten");
		TicTacToe.setBounds(120,60,160,40); // erste beiden Postion x,y die letzten beiden aktuelle Gr��e Breite und h�he 
		TicTacToe.addActionListener(this);
		add(TicTacToe);
		
		M�hle = new JButton("M�hle starten");
		M�hle.setBounds(120,120,160,40); // erste beiden Postion x,y die letzten beiden aktuelle Gr��e Breite und h�he 
		M�hle.addActionListener(this);
		add(M�hle);
		
		Dame = new JButton("Dame starten");
		Dame.setBounds(120,180,160,40); // erste beiden Postion x,y die letzten beiden aktuelle Gr��e Breite und h�he
		Dame.addActionListener(this);
		add(Dame);
		
		ende = new JButton("Men� schlie�en");
		ende.setBounds(120,240,160,40); // erste beiden Postion x,y die letzten beiden aktuelle Gr��e Breite und h�he 
		ende.addActionListener(this);
		add(ende);
				
		
	}
	

	public void actionPerformed(ActionEvent e) {
			
		if (e.getSource()== TicTacToe ) {
				Tfenster();
		}
		
		if (e.getSource()== M�hle ) {
			Mfenster(); 
		}
		
		if (e.getSource()== Dame ) {
			Dfenster(); 
		}
		
		if (e.getSource()== ende ) {
			System.exit(0); 
		}
		
//�ndern 
	}
	
	public static void Tfenster() {
		
		new Images();
		new FrameTicTacToe();
		
	}
	
	public static void Mfenster() {
		
	}
	
	public static void Dfenster() {
		
	}
}