package Spielmenue;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.awt.*;

import javax.imageio.ImageIO;
import javax.swing.*;



public class Frame extends JFrame implements ActionListener { // wir k�nnen auf JFrame zugreifen 
		private JButton TicTacToe; 
		private JButton Muehle;
		private JButton Dame;
		private JButton ende; 
		

	
	
	public static void main(String[] args) {
		
		Frame frame = new Frame("Men�");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize (1053,597); 
		
		
		frame.setLayout(null); 
		frame.setVisible(true); 
	}
	
	public Frame(String title) { // Buttons werden erstellt 
		super(title);
		
		JLabel background; 								//Label um Hintergrundbild einzuf�gen
        setSize (1053, 597); 
        setLayout(null); 
     
        ImageIcon img = new ImageIcon("src/Images/Spielmen�/ChfY8Bq_3x.png");

        background = new JLabel("",img,JLabel.CENTER); 
        background.setBounds(0,0,1053,597);
        add(background);
        setVisible (true);
        
		TicTacToe = new JButton("TicTacToe starten");
		TicTacToe.setBounds(400,60,160,40); // erste beiden Postion x,y die letzten beiden aktuelle Gr��e Breite und h�he 
		TicTacToe.addActionListener(this);
		add(TicTacToe);
		
		Muehle = new JButton (new ImageIcon("src/Images/Cross.png"));   //f�gt Bild auf Button ein, fehlerhaft
		Muehle.setBounds(120,120,160,40); // erste beiden Postion x,y die letzten beiden aktuelle Gr��e Breite und h�he
		Muehle.addActionListener(this);
		add(Muehle);
		
		Dame = new JButton("Dame starten");
		Dame.setBounds(120,180,160,40); // erste beiden Postion x,y die letzten beiden aktuelle Gr��e Breite und h�he
		Dame.addActionListener(this);
		add(Dame);
		
		ende = new JButton("Men� schlie�en");
		ende.setBounds(695,388,250,110); // erste beiden Postion x,y die letzten beiden aktuelle Gr��e Breite und h�he 
		ende.setContentAreaFilled(false); //macht button unsichtbar
		ende.addActionListener(this);
		add(ende);
				
		
	}
	

	public void actionPerformed(ActionEvent e) {
			
		if (e.getSource()== TicTacToe ) {
				Tfenster();
		}
		
		if (e.getSource()== Muehle ) {
			Mfenster(); 
		}
		
		if (e.getSource()== Dame ) {
			Dfenster(); 
		}
		
		if (e.getSource()== ende ) {
			System.exit(0); 
		}
		
//�ndern 2.0
	}
	
	public static void Tfenster() {
		
	}
	
	public static void Mfenster() {
		
	}
	
	public static void Dfenster() {
		
	}
}
