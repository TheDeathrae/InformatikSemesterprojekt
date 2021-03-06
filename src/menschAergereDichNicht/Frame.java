package menschAergereDichNicht;

import Spielmenue.FrameSpielmenue;
import menschAergereDichNicht.Dice;


import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import Dame.MusicPlayer;


public class Frame extends JFrame {

	private JPanel contentPane;
	JButton[] buttons = new JButton[73];
	JButton[] actionButtons = new JButton[4];
	JLabel[] labels = new JLabel[2];
    int positionSelected;
    ImagesM im = new ImagesM();
    Dice dice = new Dice();
    Board board = new Board();
	MusicPlayer m = new MusicPlayer();

    
	public static void main(String[] args) {
		new Frame(2);
	}
	
	

		public Frame(int spieler) {

			
		// so startet man allgemein die Musik muss am anfang jedes spezifischen frames geschehen

	    // man muss vorher einen Track ausw?heln: 1 ist wald 2 ist tic... 3 ist m?hle 4 ist ludo und 5 dame
	    m.setTrack(4);
	    Thread thread = m.playerThread;
	    thread.start(); 
	    
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    setTitle("Tic Tac Toe");
	    setBounds(0, 0, 1920, 1080);
		setResizable(false);
		setVisible(true);
		contentPane = new Draw();
		contentPane.setBounds(0, 0, 1920, 1080);
		contentPane.setVisible(true);
		contentPane.setLayout(null);	
		contentPane.setVisible(true);

		
		createLabels();
		createButtons();
		playerSelectAction(spieler);
		setButtonPositions();
		
		
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
	
	void createButtons() {
		for (int i = 0; i <= 72; i++) {
			int zahl = i;
			buttons[i] = new JButton();
			buttons[i].setBorder(BorderFactory.createEmptyBorder());
			buttons[i].setContentAreaFilled(false);
			buttons[i].addActionListener(new ActionListener() { 
				  public void actionPerformed(ActionEvent e) { 
					  positionSelected = zahl;
					  
				  } 
				} );
			contentPane.add(buttons[i]);
		}
		actionButtons[0] = new JButton(new ImageIcon(im.eins));
		actionButtons[0].addActionListener(new ActionListener() { 
			  public void actionPerformed(ActionEvent e) { 
				 wuerfelnAction();
			  } 
			} );
		actionButtons[0].setBounds(1560,472, 192, 192);
		actionButtons[0].setBorder(BorderFactory.createEmptyBorder());
		contentPane.add(actionButtons[0]);
		
		actionButtons[1] = new JButton(new ImageIcon(im.bewegen));
		actionButtons[1].addActionListener(new ActionListener() { 
			  public void actionPerformed(ActionEvent e) { 
				 moveAction();
			  } 
			} );
		actionButtons[1].setBounds(1560,704, 192, 136);
		actionButtons[1].setBorder(BorderFactory.createEmptyBorder());
		contentPane.add(actionButtons[1]);
		
		// JButton um zur?ck zu kehren
        actionButtons[2] = new JButton("");
        actionButtons[2].setBounds(8, 8, 115, 120); // erste beiden Postion x,y die letzten beiden aktuelle Größe Breite                                                    // und höhe
        actionButtons[2].setContentAreaFilled(false);
        actionButtons[2].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
				dispose();
				m.setMusicOn(false);
				FrameSpielmenue f = new FrameSpielmenue("Startmen?");
            }
        });
        add(actionButtons[2]);
	}
	void createLabels() {
		
		labels[0] = new JLabel(new ImageIcon(im.ampelYR));
		labels[0].setBounds(1560, 240 , 192, 192);
		labels[0].setVisible(true);
		contentPane.add(labels[0]);
	}
	void setButtonPositions() {
		
		for(int i= 0; i <= 71;i++ ) {
			int spalte = 0;
			int reihe = 0;
			
			
			if( i==0 || i==39 || i==38 || i==69 || i== 68 || i==56 || i==57)
				reihe = 10;
			if( i==1|| i==40 || i==37 || i== 71 || i== 70 || i==58 || i==59)
				reihe = 9;
			if( i==2 || i==41 || i==36)
				reihe = 8;
			if( i==3 || i==42 || i==35)
				reihe = 7;
			if( i==43 || (i>3 && i<9) || (i>29 && i<35))
				reihe = 6;
			if( i==9 || i==29 || (i>43 && i<48) || (i>51 && i<56))
				reihe = 5;
			if( i==51 || (i>9 && i<15 || (i>23 && i<29)))
				reihe = 4;
			if( i==15 || i==50 || i==23)
				reihe = 3;
			if( i==16 || i==49 || i==22)
				reihe = 2;
			if( i==61 || i==60 || i==17 || i==48 || i== 21 || i==65 || i==64)
				reihe = 1;
			if( i==62 || i==63 || i==18 || i==19 || i== 20 || i==67 || i==66)
				reihe = 0;
			
			

			if( i==64 || i==66 || i==28 || i==29 || i== 30 || i==70 || i==68)
				spalte = 10;
			if( i==67 || i==65 || i==27 || i== 52 || i== 31 || i==71 || i==69)
				spalte = 9;
			if( i==26 || i==53 || i==32)
				spalte = 8;
			if( i==25 || i==54 || i==33)
				spalte = 7;
			if( i==55 || (i>19 && i<25) || (i>33 && i<39))
				spalte = 6;
			if( i==19 || i==39 || (i>47 && i<52) || (i>39 && i<44))
				spalte = 5;
			if( i==47 || (i>13 && i<19) || i<5)
				spalte = 4;
			if( i==13 || i==46 || i==5)
				spalte = 3;
			if( i==12 || i==45 || i==6)
				spalte = 2;
			if( i==11 || i==44 || i==7 || i==63 || i== 60 || i==58 || i==56)
				spalte = 1;
			if( i==62 || i==61 || i==10 || i==9 || i== 8 || i==59 || i==57)
				spalte = 0;
			
			
			buttons[i].setBounds(spalte(spalte),reihe(reihe),34,34);
		}
	}
	int spalte(int x) {
		
		int xAbstand = 6;
		int xAbstandMitte = 15;
		int groesseKaestchen = 62;
		int xAnfang = 583;
		int xZentrierung = 14;
		if(x < 5)		
			return (xAnfang + x*(xAbstand + groesseKaestchen) + xZentrierung + 1);
		else if(x == 5)
			return (xAnfang + 4*(xAbstand + groesseKaestchen) + xZentrierung + xAbstandMitte + groesseKaestchen + 1);
		else
			return (xAnfang + (x-2)*(xAbstand + groesseKaestchen) + xZentrierung + 2*(xAbstandMitte + groesseKaestchen) + 1);
	}
	int reihe(int y) {
		
		int yAbstand = 7;
		int yAbstandMitte = 13;
		int groesseKaestchen = 62;
		int yAnfang = 158;
		int yZentrierung = 13;
		
		if(y < 5)		
			return (yAnfang + y*(yAbstand + groesseKaestchen) + yZentrierung - 3);
		else if(y == 5)
			return (yAnfang + 4*(yAbstand + groesseKaestchen) + yZentrierung + yAbstandMitte + groesseKaestchen - 3);
		else
			return (yAnfang + (y-2)*(yAbstand + groesseKaestchen) + yZentrierung + 2*(yAbstandMitte + groesseKaestchen)- 3);
	}
        // Start Logik
        
    	
    	boolean hatGewuerfelt = false;
    	
    	
    	void draw() {
    		
    		int[] vorlage = board.getPositionen();
    		
    		for(int i=0; i <=71; i++) {
    			if( vorlage[i] == 0) {
    				buttons[i].setIcon(null);		
    			} else if(vorlage[i] == 1) {				
    				buttons[i].setIcon(new ImageIcon(im.yellow));
    			} else if(vorlage[i] == 2) {				
    				buttons[i].setIcon(new ImageIcon(im.red));		
    			} else if(vorlage[i] == 3) {
    				buttons[i].setIcon(new ImageIcon(im.blue));
    			}else if(vorlage[i] == 4) {
    				buttons[i].setIcon(new ImageIcon(im.green));	
    			}
    		}	
    	}
    	
    	boolean playerIsSelected = false;
    	void playerSelectAction(int spieleranzahl) {
    		if (!playerIsSelected) {
    			board.setSpielerAnzahl(spieleranzahl);
    			board.initialisieren();
    			board.setAnDerReihe(1);
    			displayActionRequired();
    			draw();
    			playerIsSelected = true;
    		}
    	}
    	int counter = 0;
    	void moveAction() {
    		int[] vorlage = board.getPositionen();
    		if (vorlage[positionSelected] == board.getAnDerReihe() && hatGewuerfelt) {
    			board.move(positionSelected, board.getAnDerReihe(), dice.getNumberRolled());
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
    			actionButtons[0].setIcon(new ImageIcon(wurfZuBild(wurf)));
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
    		displayActionRequired();
    	}
    	
    	void displayActionRequired(){
    		if (board.getAnDerReihe() == 1) {
    			if(hatGewuerfelt) {
        			labels[0].setIcon(new ImageIcon(im.ampelYM));
        		} else {
        			labels[0].setIcon(new ImageIcon(im.ampelYR));
        		}
    		} else if (board.getAnDerReihe() == 2) {
    			if(hatGewuerfelt) {
        			labels[0].setIcon(new ImageIcon(im.ampelRM));
        		} else {
        			labels[0].setIcon(new ImageIcon(im.ampelRR));
        		}
    		} else if (board.getAnDerReihe() == 3) {
    			if(hatGewuerfelt) {
        			labels[0].setIcon(new ImageIcon(im.ampelBM));
        		} else {
        			labels[0].setIcon(new ImageIcon(im.ampelBR));
        		}
    		} else {
    			if(hatGewuerfelt) {
        			labels[0].setIcon(new ImageIcon(im.ampelGM));
        		} else {
        			labels[0].setIcon(new ImageIcon(im.ampelGR));
        		}
    		}
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
    			return "f?nf";
    		} else if(zahl == 6) {
    			return "sechs";
    		} else
    			return "fehlerhafte Eingabe";
    	}
    	

    	BufferedImage wurfZuBild(int wurf) {
    		if (wurf == 1) {
    			return im.eins;
    		} else if (wurf == 2) {
    			return im.zwei;
    		} else if (wurf == 3) {
    			return im.drei;
    		} else if (wurf == 4) {
    			return im.vier;
    		} else if (wurf == 5) {
    			return im.fuenf;
    		} else {
    			return im.sechs;
    		}
    	}
	} 

