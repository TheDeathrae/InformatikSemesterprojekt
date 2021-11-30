package menschAergereDichNicht;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
import java.awt.GridLayout;

public class auswahlFrame extends JFrame {

	private JPanel contentPane;
	Board board = new Board();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					auswahlFrame frame = new auswahlFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public auswahlFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(800, 400, 400, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(1, 0, 0, 0));
		
		JButton btnNewButton = new JButton("ein");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {				
				System.exit(0);
				new Frame(1);
			}
		});
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_2 = new JButton("zwei");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Frame(2);
			}
		});
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("drei");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Frame(3);		
			}
		});
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_1 = new JButton("vier");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Frame(4);
			}
		});
		contentPane.add(btnNewButton_1);
	}
}
