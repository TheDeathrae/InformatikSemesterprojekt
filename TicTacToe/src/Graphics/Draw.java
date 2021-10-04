package Graphics;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseListener;

import javax.swing.*;

import Components.*;

public class Draw extends JPanel{
	
	Circle c1;
	Cross cr1;
	Circle c2;
	Cross cr2;
	Circle c3;
	Cross cr3;
	Circle c4;
	Cross cr4;
	Circle c5;
	Cross cr5;
	
	private static int boardSize = 801; //  durch 3 teilbar legt Höhe und Breite in Pixeln fest
	private static int positionBoardX = 600; //obere linke Ecke
	private static int positionBoardY = 100;
	
	public static int getBoardSize() {
		return boardSize;
	}
	public static int getPositionBoardX() {
		return positionBoardX;
	}
	public static int getPositionBoardY() {
		return positionBoardY;
	}
	
	public Draw(Circle c, Cross cr, Circle c2, Cross cr2, Circle c3, Cross cr3, Circle c4, Cross cr4, Circle c5, Cross cr5) {
		
			this.c1 = c;
			this.cr1 = cr;
			this.c2 = c2;
			this.cr2 = cr2;
			this.c3 = c3;
			this.cr3 = cr3;
			this.c4 = c4;
			this.cr4 = cr4;
			this.c5 = c5;
			this.cr5 = cr5;
			
			
	}
	

	@Override
	protected void paintComponent( Graphics g ) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		
		g2.drawImage(Images.a1, positionBoardX, positionBoardY, boardSize/3, boardSize/3, this);
		g2.drawImage(Images.a2, positionBoardX + boardSize/3, positionBoardY, boardSize/3, boardSize/3, this);
		g2.drawImage(Images.a3, positionBoardX + boardSize/3*2, positionBoardY, boardSize/3, boardSize/3, this);
		g2.drawImage(Images.b1, positionBoardX, positionBoardY + boardSize/3, boardSize/3, boardSize/3, this);
		g2.drawImage(Images.b2, positionBoardX + boardSize/3, positionBoardY + boardSize/3, boardSize/3, boardSize/3, this);
		g2.drawImage(Images.b3, positionBoardX + boardSize/3*2, positionBoardY + boardSize/3, boardSize/3, boardSize/3, this);
		g2.drawImage(Images.c1, positionBoardX, positionBoardY + boardSize/3*2, boardSize/3, boardSize/3, this);
		g2.drawImage(Images.c2, positionBoardX + boardSize/3, positionBoardY + boardSize/3*2, boardSize/3, boardSize/3, this);
		g2.drawImage(Images.c3, positionBoardX + boardSize/3*2, positionBoardY + boardSize/3*2, boardSize/3, boardSize/3, this);
		
		int f = (int)(boardSize/3*0.6); //passt Größe des Bildes an Feld an
		
		if (Frame.counter == 1) {
			g2.drawImage(Images.cross, cr1.get_x(), cr1.get_y(),f ,f , this);
			}
		if (Frame.counter == 2) {
			g2.drawImage(Images.cross, cr1.get_x(), cr1.get_y(),f ,f , this);
			g2.drawImage(Images.circle, c1.get_x(), c1.get_y(), f, f, this);
			}
		if (Frame.counter == 3) {
			g2.drawImage(Images.cross, cr1.get_x(), cr1.get_y(),f ,f , this);
			g2.drawImage(Images.circle, c1.get_x(), c1.get_y(), f, f, this);
			g2.drawImage(Images.cross, cr2.get_x(), cr2.get_y(), f, f, this);
			}
		if (Frame.counter == 4) {
			g2.drawImage(Images.cross, cr1.get_x(), cr1.get_y(),f ,f , this);
			g2.drawImage(Images.circle, c1.get_x(), c1.get_y(), f, f, this);
			g2.drawImage(Images.cross, cr2.get_x(), cr2.get_y(), f, f, this);
			g2.drawImage(Images.circle, c2.get_x(), c2.get_y(), f, f, this);
			}
		if (Frame.counter == 5) {
			g2.drawImage(Images.cross, cr1.get_x(), cr1.get_y(),f ,f , this);
			g2.drawImage(Images.circle, c1.get_x(), c1.get_y(), f, f, this);
			g2.drawImage(Images.cross, cr2.get_x(), cr2.get_y(), f, f, this);
			g2.drawImage(Images.circle, c2.get_x(), c2.get_y(), f, f, this);
			g2.drawImage(Images.cross, cr3.get_x(), cr3.get_y(), f, f, this);
			}
		if (Frame.counter == 6) {
			g2.drawImage(Images.cross, cr1.get_x(), cr1.get_y(),f ,f , this);
			g2.drawImage(Images.circle, c1.get_x(), c1.get_y(), f, f, this);
			g2.drawImage(Images.cross, cr2.get_x(), cr2.get_y(), f, f, this);
			g2.drawImage(Images.circle, c2.get_x(), c2.get_y(), f, f, this);
			g2.drawImage(Images.cross, cr3.get_x(), cr3.get_y(), f, f, this);
			g2.drawImage(Images.circle, c3.get_x(), c3.get_y(), f, f, this);
			}
		if (Frame.counter == 7) {
			g2.drawImage(Images.cross, cr1.get_x(), cr1.get_y(),f ,f , this);
			g2.drawImage(Images.circle, c1.get_x(), c1.get_y(), f, f, this);
			g2.drawImage(Images.cross, cr2.get_x(), cr2.get_y(), f, f, this);
			g2.drawImage(Images.circle, c2.get_x(), c2.get_y(), f, f, this);
			g2.drawImage(Images.cross, cr3.get_x(), cr3.get_y(), f, f, this);
			g2.drawImage(Images.circle, c3.get_x(), c3.get_y(), f, f, this);
			g2.drawImage(Images.cross, cr4.get_x(), cr4.get_y(), f, f, this);
			}
		if (Frame.counter == 8) {
			g2.drawImage(Images.cross, cr1.get_x(), cr1.get_y(),f ,f , this);
			g2.drawImage(Images.circle, c1.get_x(), c1.get_y(), f, f, this);
			g2.drawImage(Images.cross, cr2.get_x(), cr2.get_y(), f, f, this);
			g2.drawImage(Images.circle, c2.get_x(), c2.get_y(), f, f, this);
			g2.drawImage(Images.cross, cr3.get_x(), cr3.get_y(), f, f, this);
			g2.drawImage(Images.circle, c3.get_x(), c3.get_y(), f, f, this);
			g2.drawImage(Images.cross, cr4.get_x(), cr4.get_y(), f, f, this);
			g2.drawImage(Images.circle, c4.get_x(), c4.get_y(), f, f, this);
			}
		if (Frame.counter == 9) {
			g2.drawImage(Images.cross, cr1.get_x(), cr1.get_y(),f ,f , this);
			g2.drawImage(Images.circle, c1.get_x(), c1.get_y(), f, f, this);
			g2.drawImage(Images.cross, cr2.get_x(), cr2.get_y(), f, f, this);
			g2.drawImage(Images.circle, c2.get_x(), c2.get_y(), f, f, this);
			g2.drawImage(Images.cross, cr3.get_x(), cr3.get_y(), f, f, this);
			g2.drawImage(Images.circle, c3.get_x(), c3.get_y(), f, f, this);
			g2.drawImage(Images.cross, cr4.get_x(), cr4.get_y(), f, f, this);
			g2.drawImage(Images.circle, c4.get_x(), c4.get_y(), f, f, this);
			g2.drawImage(Images.cross, cr5.get_x(), cr5.get_y(), f, f, this);
			}
	}
	
}
