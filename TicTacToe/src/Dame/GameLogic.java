package Dame;

import java.util.ArrayList;

public class GameLogic {
	
	//Arraylist aller figuren kann umgewandelt werden wenn eine Figur geschlagen werden kann oder eine Dame entsteht
	public ArrayList<Figures> figureList = new ArrayList<Figures>();
	
	//Arraylist füllen methode
	public void fillList() {
		for (int i = 0; i < 24; i++) {
			if (i % 2 == 0) {
				figureList.add(new Figures(false, (i%8), (i/8)));
			}
			else {
				figureList.add(new Figures(true, (i%8),  7 - (i/8)));
			}
		}
	}
	
	public void changeQueen() {
		for (int i = 0; i < figureList.size(); i++) {
			if (figureList.get(i).getY() == 7 || figureList.get(i).getY() == 0) {
				figureList.add(i,new Queen(figureList.get(i).getColor(), figureList.get(i).getX(), figureList.get(i).getY()));
				figureList.remove(i+1);
				break;
			}
		}
	}
	
	public boolean chooseFigure(int x, int y) {
		for (int i = 0; i < figureList.size(); i++) {
			if(figureList.get(i).getX() == x && figureList.get(i).getY() == y) {
				if(figureList.get(i).getSelected()) {
					figureList.get(i).setSelected(false);
				}
				else{
					figureList.get(i).setSelected(true);
				}
				return false;
			}
		}
		return true;
	}
	
	public boolean proofMove(int x, int y) {
		for (int i = 0; i < figureList.size(); i++) {
			if (figureList.get(i).getSelected()) {
				return figureList.get(i).movePossible(x, y);
			}
		}
		System.err.println("Fehler im System");
		return false;
	}
	
	public void makeMove(int x, int y) {
		for (int i = 0; i < figureList.size(); i++) {
			if (figureList.get(i).getSelected()) {
				figureList.get(i).setX(x);
				figureList.get(i).setY(y);
				figureList.get(i).setSelected(false);
				break;
			}
		} 
	}
}