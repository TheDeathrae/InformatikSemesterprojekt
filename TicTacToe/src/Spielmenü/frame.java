package Spielmenü;

import javax.swing.*;
import javax.swing.*;

public class frame extends JFrame { // wir können auf JFrame zugreifen 

		private JButton sTicTacToe; 
		private JButton eMühle;
		private JButton iDame;
		private JButton ende; 
	
	public static void main(String[] args) {
		
		frame frame = new frame("Menü");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize (400,400); 
		
		
		frame.setLayout(null); 
		frame.setVisible(true); 
	}
	
	public frame(String title) {
		super(title);
		
		sTicTacToe = new JButton("TicTacToe starten");
		sTicTacToe.setBounds(120,40,160,40); // erste beiden Postion x,y die letzten beiden aktuelle Größe Breite und höhe 
		add(sTicTacToe);
		
		eMühle = new JButton("Mühle starten");
		eMühle.setBounds(120,40,160,40); // erste beiden Postion x,y die letzten beiden aktuelle Größe Breite und höhe 
		add(eMühle);
		
		iDame = new JButton("Dame starten");
		iDame.setBounds(120,40,160,40); // erste beiden Postion x,y die letzten beiden aktuelle Größe Breite und höhe 
		add(iDame);
		
		ende = new JButton("Menü schließen");
		ende.setBounds(120,40,160,40); // erste beiden Postion x,y die letzten beiden aktuelle Größe Breite und höhe 
		add(ende);
				
		
	}
}
