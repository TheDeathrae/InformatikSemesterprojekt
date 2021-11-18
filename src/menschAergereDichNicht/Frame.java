package menschAergereDichNicht;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.BorderFactory;
import javax.swing.JButton;

public class Frame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		new Frame();
	}

	public Frame() {
	    
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    setTitle("Tic Tac Toe");
	    setBounds(0, 0, 1800, 900);
		setResizable(true);	
		contentPane.setBounds(0, 0, 1900, 800);
		contentPane.setVisible(true);
		JButton test = new JButton("Test");
		test.setBounds(500,500,34,34);
	    add(new Draw()); 
	    
	    setVisible(true);		
	}

}
