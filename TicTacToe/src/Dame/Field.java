package Dame;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseListener;

import javax.swing.*;

public class Field extends JPanel{
		
	
	
	private static int boardSize = 801; //  durch 3 teilbar legt Höhe und Breite in Pixeln fest
	private static int positionBoardX = 600; //obere linke Ecke
	private static int positionBoardY = 100;
		
	public int getBoardSize() {
		return boardSize;
	}
	public int getPositionBoardX() {
		return positionBoardX;
	}
	public int getPositionBoardY() {
		return positionBoardY;
	}
		
	@Override
	protected void paintComponent( Graphics g ) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
	}
}
