package menschAergereDichNicht;

import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;

public class Frame extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
	  


	    final JFrame frame = new JFrame ("Main Menu");
	    JButton start = new JButton ("");
	    JButton exit = new JButton ("Exit");
	    frame.setVisible(true);
	    frame.setSize(1000,750);
	    frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
	    frame.setLocationRelativeTo(null);
	    frame.setLayout(null);
	    frame.setBackground(null);
	    frame.add(exit);
	    frame.add(start);

	    
	    start.setBounds(300, 300, 200, 150);
	    start.setForeground(null);
	    exit.setBackground(null);
	    start.setIcon(new ImageIcon("C:/Users/henri.polak/git/InformatikSemesterprojekt/TicTacToe/src/Images/Cross.png")); 
	    start.setContentAreaFilled(false);
	    start.setBorder(null);
	    start.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent e) {
	            exit.setText("Ok Button is clicked here");
	         }
	    	});
	    

	   
	    exit.setBounds(550, 300, 150, 75);
	    exit.setBackground(Color.BLACK);
	    exit.setForeground(Color.GREEN);
	    exit.setVisible(true);
	    exit.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent e) {
	            exit.setText("Other Button Clicked");
	         }
	    	});
	
	
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
