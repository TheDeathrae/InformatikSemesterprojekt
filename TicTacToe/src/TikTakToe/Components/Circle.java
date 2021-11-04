package Components;

import Graphics.Draw;

public class Circle {
	
	private int xKoordinate;
	private int yKoordinate;
	private int reihe;
	private int spalte;
	
	public Circle(int x, int y) {
		this.xKoordinate = x;
		this.yKoordinate = y;
	}
	
	public int get_x() {
		return this.xKoordinate;
	}
	public int get_y() {
		return this.yKoordinate;
	}
	public void set_x(int x) {
		this.xKoordinate = x;
	}
	public void set_y(int y) {
		this.yKoordinate = y;
	}
	public int getReihe() {
		return this.reihe;
	}
	public int getSpalte() {
		return this.spalte;
	}
	public void setReihe(int y) {
		this.reihe = y;
	}
	public void setSpalte(int y) {
		this.spalte = y;
	}
	static public void spalteToKoordinate(Circle c) {
		if(c.spalte == 1) {
			c.set_x(((int)(Draw.getPositionBoardX() + Draw.getBoardSize()*0.2/3)));
		} else if (c.spalte == 2) {
			c.set_x(((int)(Draw.getPositionBoardX() + Draw.getBoardSize()/3 + Draw.getBoardSize()*0.2/3)));
		} else {
			c.set_x(((int)(Draw.getPositionBoardX() + 2*Draw.getBoardSize()/3 + Draw.getBoardSize()*0.2/3)));
		}
	}
	static public void reiheToKoordinate(Circle c) {
		if(c.reihe == 1) {
			c.set_y(((int)(Draw.getPositionBoardY() + Draw.getBoardSize()*0.2/3)));
		} else if (c.reihe == 2) {
			c.set_y(((int)(Draw.getPositionBoardY() + Draw.getBoardSize()/3 + Draw.getBoardSize()/3*0.2)));
		} else {
			c.set_y(((int)(Draw.getPositionBoardY() + 2*Draw.getBoardSize()/3 + Draw.getBoardSize()/3*0.2)));
		}
	}
	
}
