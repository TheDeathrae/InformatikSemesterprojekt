package Spielmen�;

import javax.swing.*;
import javax.swing.*;

public class frame extends JFrame { // wir k�nnen auf JFrame zugreifen 

		private JButton sTicTacToe; 
		private JButton eM�hle;
		private JButton iDame;
		private JButton ende; 
	
	public static void main(String[] args) {
		
		frame frame = new frame("Men�");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize (400,400); 
		
		
		frame.setLayout(null); 
		frame.setVisible(true); 
	}
	
	public frame(String title) {
		super(title);
		
		sTicTacToe = new JButton("TicTacToe starten");
		sTicTacToe.setBounds(120,40,160,40); // erste beiden Postion x,y die letzten beiden aktuelle Gr��e Breite und h�he 
		add(sTicTacToe);
		
		eM�hle = new JButton("M�hle starten");
		eM�hle.setBounds(120,40,160,40); // erste beiden Postion x,y die letzten beiden aktuelle Gr��e Breite und h�he 
		add(eM�hle);
		
		iDame = new JButton("Dame starten");
		iDame.setBounds(120,40,160,40); // erste beiden Postion x,y die letzten beiden aktuelle Gr��e Breite und h�he 
		add(iDame);
		
		ende = new JButton("Men� schlie�en");
		ende.setBounds(120,40,160,40); // erste beiden Postion x,y die letzten beiden aktuelle Gr��e Breite und h�he 
		add(ende);
				
		
	}
}
