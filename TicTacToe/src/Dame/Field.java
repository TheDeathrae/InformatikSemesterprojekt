package Dame;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseListener;

import javax.swing.*;

import Dame.ImagesDame;
import Graphics.Images;

public class Field extends JPanel{
	
	private int width;
	private int height;
	private GameLogic gl;
	
	public Field(int width, int height, GameLogic gl) {
		this.width = width;
		this.height = height;
		this.gl = gl;
	}
	
	
	private static int boardSizeX = 878;
	private static int boardSizeY = 837;
	private static int positionBoardX = 528; //obere linke Ecke
	private static int positionBoardY = 137;
		
	public int getBoardSizeX() {
		return boardSizeX;
	}
	public int getBoardSizeY() {
		return boardSizeY;
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
		ImagesDame dame = new ImagesDame();
		//Spielhintergrund mit spielfeld
		g2.drawImage(dame.dame, 0, 0, width, height, this);
		//einzelne Spielsteine
		for (int i = 0; i < gl.figureList.size(); i++) {
			g2.drawImage(dame.stein, positionBoardX + (gl.figureList.get(i).getX() * (boardSizeX / 8)), positionBoardY + (gl.figureList.get(i).getY() * (boardSizeY / 8)) - 27,
					boardSizeX / 8, boardSizeY / 8, this);
		}
		
	
	}
}
