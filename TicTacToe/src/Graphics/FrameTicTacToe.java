package Graphics;

import java.awt.Toolkit;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

import Components.*;
import Game.initalisierung;
import Game.zug;

public class FrameTicTacToe extends JFrame{

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

	zug zug = new zug();

	boolean inFrameX(int i) {
		if (i >= Draw.getPositionBoardX() && i < (Draw.getPositionBoardX() + Draw.getBoardSize())){
			return true;
		} else {
			return false;
		}
	}
	boolean inFrameY(int i) {
		if (i >= Draw.getPositionBoardY() && i < (Draw.getPositionBoardY() + Draw.getBoardSize()*1.05)){
			return true;
		} else {
			return false;
		}
	}
	void setzeSpalteKreuz(int i, Cross cr) {
		if(i < (Draw.getPositionBoardX() + Draw.getBoardSize()/3)) {
			cr.setSpalte(1);
		}
		else if (i < (Draw.getPositionBoardX() + (Draw.getBoardSize()/3)*2)) {
			cr.setSpalte(2);
		} else {
			cr.setSpalte(3);
		}
	}
	void setzeSpalteKreis(int i, Circle c) {
		if(i < (Draw.getPositionBoardX() + Draw.getBoardSize()/3)) {
			c.setSpalte(1);
		}
		else if (i < (Draw.getPositionBoardX() + (Draw.getBoardSize()/3)*2)) {
			c.setSpalte(2);
		} else {
			c.setSpalte(3);
		}
	}
	void setzeReiheKreuz(int i, Cross cr) {
		if(i < (Draw.getPositionBoardY() + (Draw.getBoardSize()*1.05)/3)) {
			cr.setReihe(1);
		}
		else if (i < (Draw.getPositionBoardY() + ((Draw.getBoardSize()*1.05)/3)*2)) {
			cr.setReihe(2);
		} else {
			cr.setReihe(3);
		}
	}
	void setzeReiheKreis(int i, Circle c) {
		if(i < (Draw.getPositionBoardY() + (Draw.getBoardSize()*1.05)/3)) {
			c.setReihe(1);
		}
		else if (i < (Draw.getPositionBoardY() + ((Draw.getBoardSize()*1.05)/3)*2)) {
			c.setReihe(2);
		} else {
			c.setReihe(3);
		}
	}
	
	public FrameTicTacToe() {
		
		setResizable(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Tic Tac Toe ");
		setBounds(0, 0, Toolkit.getDefaultToolkit().getScreenSize().width , (Toolkit.getDefaultToolkit().getScreenSize().height - 30));
		add(new Draw(c1,cr1,c2,cr2,c3,cr3,c4,cr4,c5,cr5));
		
		setVisible(true);
	
		
		addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				int x = arg0.getX();
				int y = arg0.getY();
				
				if (inFrameX(arg0.getX()) && inFrameY(arg0.getY())) {
					if (counter == 0) {
						if(zug.setzen(initalisierung.feld, (counter % 2) + 1,((cr1.getReihe()-1)*3 + cr1.getSpalte())-1)) {
							setzeSpalteKreuz(x, cr1);
							setzeReiheKreuz(y, cr1);
							Cross.spalteToKoordinate(cr1);
							Cross.reiheToKoordinate(cr1);
							
							counter++; 
						}
					}
					else if (counter == 1){
						if(zug.setzen(initalisierung.feld, (counter % 2) + 1,((c1.getReihe()-1)*3 + c1.getSpalte())-1)) {
							setzeSpalteKreis(x, c1);
							setzeReiheKreis(y, c1);
							Circle.spalteToKoordinate(c1);
							Circle.reiheToKoordinate(c1);
							
							counter++; 
						}
					}
					else if (counter == 2){
						if(zug.setzen(initalisierung.feld, (counter % 2) + 1,((cr2.getReihe()-1)*3 + cr2.getSpalte())-1)) {
							setzeSpalteKreuz(x, cr2);
							setzeReiheKreuz(y, cr2);
							Cross.spalteToKoordinate(cr2);
							Cross.reiheToKoordinate(cr2);
							
							counter++; 
						}
					}
					else if (counter == 3){
						if(zug.setzen(initalisierung.feld, (counter % 2) + 1,((c2.getReihe()-1)*3 + c2.getSpalte())-1)) {
							setzeSpalteKreis(x, c2);
							setzeReiheKreis(y, c2);
							Circle.spalteToKoordinate(c2);
							Circle.reiheToKoordinate(c2);
							
							counter++; 
						}
					}
					else if (counter == 4){
						if(zug.setzen(initalisierung.feld, (counter % 2) + 1,((cr3.getReihe()-1)*3 + cr3.getSpalte())-1)) {
							setzeSpalteKreuz(x, cr3);
							setzeReiheKreuz(y, cr3);
							Cross.spalteToKoordinate(cr3);
							Cross.reiheToKoordinate(cr3);
							
							counter++; 
						}
					}
					else if (counter == 5){
						if(zug.setzen(initalisierung.feld, (counter % 2) + 1,((c3.getReihe()-1)*3 + c3.getSpalte())-1)) {
							setzeSpalteKreis(x, c3);
							setzeReiheKreis(y, c3);
							Circle.spalteToKoordinate(c3);
							Circle.reiheToKoordinate(c3);
							
							counter++; 
						}
					}
					else if (counter == 6){
						if(zug.setzen(initalisierung.feld, (counter % 2) + 1,((cr4.getReihe()-1)*3 + cr4.getSpalte())-1)) {
							setzeSpalteKreuz(x, cr4);
							setzeReiheKreuz(y, cr4);
							Cross.spalteToKoordinate(cr4);
							Cross.reiheToKoordinate(cr4);
							
							counter++; 
						}
					}
					else if (counter == 7){
						if(zug.setzen(initalisierung.feld, (counter % 2) + 1,((c4.getReihe()-1)*3 + c4.getSpalte())-1)) {
							setzeSpalteKreis(x, c4);
							setzeReiheKreis(y, c4);
							Circle.spalteToKoordinate(c4);
							Circle.reiheToKoordinate(c4);
							
							counter++; 
						}
					}
					else if (counter == 8){ 
						if(zug.setzen(initalisierung.feld, (counter % 2) + 1,((cr5.getReihe()-1)*3 + cr5.getSpalte())-1)) {
							setzeSpalteKreuz(x, cr5);
							setzeReiheKreuz(y, cr5);
							Cross.spalteToKoordinate(cr5);
							Cross.reiheToKoordinate(cr5);
							
							counter++; 
						}
					}
					repaint();
				}
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
