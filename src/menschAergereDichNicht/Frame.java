package menschAergereDichNicht;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import javax.swing.border.EmptyBorder;

import org.eclipse.wb.swt.SWTResourceManager;

import TicTacToe.Components.Circle;
import TicTacToe.Components.Cross;
import TicTacToe.Components.WinScreen;
import TicTacToe.Graphics.DrawEngine;

import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
//import java.util.logging.Level;
//import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JPanel;
public class Frame extends JFrame {

	private JPanel contentPane;
    ImagesM i = new ImagesM();
    
    
    
	public static void main(String[] args) {
		new Frame();
	}
	
	

	public Frame() {
		int y = Toolkit.getDefaultToolkit().getScreenSize().height;
		int x = Toolkit.getDefaultToolkit().getScreenSize().width;
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    setTitle("Tic Tac Toe");
	    setBounds(0, 0, x, y);
		setResizable(true);
		setVisible(true);
		contentPane = new Draw();
		contentPane.setBounds(0, 0, 200, 100);
		contentPane.setVisible(true);
		contentPane.setLayout(null);
		
		contentPane.setVisible(true);
		
		JButton test = new JButton();
		test.setBounds(500,500,34,34);
		test.addActionListener(new ActionListener() { 
			  public void actionPerformed(ActionEvent e) { 
				  test.setIcon(null);
			  } 
			} );
		test.setIcon(new ImageIcon(i.yellow));
		test.setBorder(BorderFactory.createEmptyBorder());
		test.setContentAreaFilled(false);
		contentPane.add(test);
		
		
		
        add(contentPane);
        
        addMouseListener(new MouseListener() {
        @Override
        public void mouseClicked(MouseEvent arg0) {

            int x = arg0.getX();
            int y = arg0.getY();
            System.out.println(x);
            System.out.println(y);
        }

        @Override
        public void mousePressed(MouseEvent e) {

        }

        @Override
        public void mouseReleased(MouseEvent e) {

        }

        @Override
        public void mouseEntered(MouseEvent e) {

        }

        @Override
        public void mouseExited(MouseEvent e) {

        }
    });
        
	}
        // Start Logik
        /* 
        Board board = new Board();
    	Dice dice = new Dice();
    	
    	boolean hatGewuerfelt = false;
    	
    	
    	void draw() {
    		
    		int[] vorlage = board.getPositionen();
    		
    		for(int i=0; i <=71; i++) {
    			if( vorlage[i] == 0) {
    				positionButtons[i].setImage(SWTResourceManager.getImage(Mensch.class, "/Images/white.png"));			
    			} else if(vorlage[i] == 1) {				
    				positionButtons[i].setImage(SWTResourceManager.getImage(Mensch.class, "/Images/yellow.png"));	
    			} else if(vorlage[i] == 2) {				
    				positionButtons[i].setImage(SWTResourceManager.getImage(Mensch.class, "/Images/red.png"));		
    			} else if(vorlage[i] == 3) {
    				positionButtons[i].setImage(SWTResourceManager.getImage(Mensch.class, "/Images/blue.png"));	
    			}else if(vorlage[i] == 4) {
    				positionButtons[i].setImage(SWTResourceManager.getImage(Mensch.class, "/Images/green.png"));	
    			}
    		}	
    	}
    	
    	boolean playerIsSelected = false;
    	void playerSelectAction(int spieleranzahl) {
    		if (!playerIsSelected) {
    			board.setSpielerAnzahl(spieleranzahl);
    			board.initialisieren();
    			board.setAnDerReihe(1);
    			displayActivePlayer();
    			draw();
    			playerIsSelected = true;
    		}
    	}
    	int counter = 0;
    	void moveAction() {
    		int[] vorlage = board.getPositionen();
    		if (vorlage[positionSelected] == board.getAnDerReihe() && hatGewuerfelt) {
    			board.move(positionSelected, board.getAnDerReihe(), dice.getNumberRolled());
    			checkWinning();
    			if(board.isZugDurchgefuehrt()) {
    				hatGewuerfelt = false;
    				board.setZugDurchgefuehrt(false);
    				draw();
    				displayActionRequired();
    				if(dice.getNumberRolled() != 6) {
    					counter = 0;
    					nextPlayer();
    				}			
    			} else if(board.isInBase(board.getAnDerReihe())) {
    				hatGewuerfelt = false;
    				counter ++; 
    				displayActionRequired();
    				if(counter == 3) {
    					counter = 0;
    					nextPlayer();
    				}
    			} 
    		}
    	}
    		
    	void wuerfelnAction(){
    		if(!hatGewuerfelt) {
    			dice.roll();
    			int wurf = dice.getNumberRolled();
    			System.out.println(String.valueOf(wurf));
    			labels[2].setText(zahlZuWort(wurf));
    			hatGewuerfelt = true;
    			displayActionRequired();
    		}
    	}
    	
    	void nextPlayer() {
    		int anDerReihe = board.getAnDerReihe();
    		System.out.println(anDerReihe);
    		if(anDerReihe!= board.getSpielerAnzahl()) {
    			board.setAnDerReihe((anDerReihe+1));
    			System.out.println(board.getAnDerReihe());
    		} else {
    			board.setAnDerReihe(1);
    		}
    		displayActivePlayer();
    	}
    	
    	void displayActivePlayer(){
    		String spieler;
    		if (board.getAnDerReihe() == 1) {
    			spieler = "gelb";
    		} else if (board.getAnDerReihe() == 2) {
    			spieler = "rot";
    		} else if (board.getAnDerReihe() == 3) {
    			spieler = "blau";
    		} else {
    			spieler = "gr�n";
    		}
    			
    		labels[0].setText("aktiv: " + spieler);
    	}
    	
    	String zahlZuWort(int zahl) {
    		if(zahl == 1) {
    			return "eins";
    		} else if(zahl == 2) {
    			return "zwei";
    		} else if(zahl == 3) {
    			return "drei";
    		} else if(zahl == 4) {
    			return "vier";
    		} else if(zahl == 5) {
    			return "f�nf";
    		} else if(zahl == 6) {
    			return "sechs";
    		} else
    			return "fehlerhafte Eingabe";
    	}
    	
    	void displayActionRequired() {
    		if(hatGewuerfelt) {
    			labels[3].setText("bewegen");
    		} else {
    			labels[3].setText("w�rfeln");
    		}
    	}

    	void checkWinning() {
    		if(board.gewinnen()) {
    			if(board.getSpielerGewonnen() == 1) {
    				labels[1].setText("GELB HAT GEWONNEN");
    			} else if(board.getSpielerGewonnen() == 1) {
    				labels[1].setText("ROT HAT GEWONNEN");
    			} else if(board.getSpielerGewonnen() == 1) {
    				labels[1].setText("BLAU HAT GEWONNEN");
    			} else {
    				labels[1].setText("GR�N HAT GEWONNEN");
    			}
    			
    		}
    	}	
	} */
}
