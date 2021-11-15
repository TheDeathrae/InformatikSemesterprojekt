package Dame;

import java.util.ArrayList;

public class GameLogic {
	
	//Arraylist aller figuren kann umgewandelt werden wenn eine Figur geschlagen werden kann oder eine Dame entsteht
	public ArrayList<Figures> figureList = new ArrayList<Figures>();

	//Variable für Farbe, die am Zug ist 
	public boolean amZug = false;
	
	//Arraylist füllen methode
	public void fillList() {
		for (int i = 0; i < 24; i++) {
			if(7 < i && i < 16) {
				if (i % 2 == 0) {
					figureList.add(new Figures(false, (i%8), (i/8)));
				}
				else {
					figureList.add(new Figures(true, (i%8), 7 - (i/8)));
				}
			}
			else {
				if (i % 2 == 0) {
					figureList.add(new Figures(true, (i%8), 7 - (i/8)));
				}
				else {
					figureList.add(new Figures(false, (i%8), (i/8)));
				}
			}
			
		}
	}
	
	//Damenerstellung bei erreichen der Grundlinie
	public void changeQueen() {
		for (int i = 0; i < figureList.size(); i++) {
			if (figureList.get(i).getY() == 7 || figureList.get(i).getY() == 0) {
				figureList.add(i,new Queen(figureList.get(i).getColor(), figureList.get(i).getX(), figureList.get(i).getY()));
				figureList.remove(i+1);
				break;
			}
		}
	}
	
	
	//Spielstein selecten, wenn er nicht selected ist und der Spielstein am Zug ist
	public boolean chooseFigure(int x, int y) {
		for (int i = 0; i < figureList.size(); i++) {
			if(figureList.get(i).getX() == x && figureList.get(i).getY() == y && figureList.get(i).getColor() == amZug) {
				if(figureList.get(i).getSelected()) {
					figureList.get(i).setSelected(false);
				}
				else{
					for (int j = 0; j < figureList.size(); j++) {
						figureList.get(j).setSelected(false);
					}
					System.out.println("erreicht");
					System.out.println(figureList.get(i).getX());
					System.out.println(figureList.get(i).getY());
					System.out.println(figureList.get(i).getColor());
					figureList.get(i).setSelected(true);
				}
				return false;
			}
		}
		System.out.println("soll nicht sein");
		return true;
	}
	
	//Gucken ob das Feld, dass man gewählt hat besezt ist 
	public boolean proofOccupied(int x, int y) {
		for (int i = 0; i < figureList.size(); i++) {
			if(figureList.get(i).getX() == x && figureList.get(i).getY() == y) {
				return true;
			}
		}
		return false;
	}
	
	//überprüfen ob figur jemanden Schlagen kann
	public boolean figureBeatPossible(Figures fig) {
		for (int i = 0; i < figureList.size(); i++) {
			//schlagen nur möglich, wenn der spielstein von der anderen Farbe ist
			if(fig.getColor() != figureList.get(i).getColor()) {
				//wenn eine Figur dort ist, wo die selectete hinaufen kann
				if (fig.movePossible(figureList.get(i).getX(), figureList.get(i).getY())) {
					System.out.println("Figur erreichbar");
					System.out.println(fig.getX());
					System.out.println(fig.getY());
					System.out.println(fig.getColor());
					System.out.println("----------------------");
					System.out.println(figureList.get(i).getX());
					System.out.println(figureList.get(i).getY());
					System.out.println(figureList.get(i).getColor());
					//Figuren kommen aus vier möglichen Richtungen wo sie Schlagen können
					if (fig.getY() < figureList.get(i).getY() && fig.getX() < figureList.get(i).getX()) {
						if (!proofOccupied(figureList.get(i).getX() + 1, figureList.get(i).getY() + 1)) {
							System.out.println("Schlagen möglich");
							return true;
						}
					}
					if (fig.getY() < figureList.get(i).getY() && fig.getX() > figureList.get(i).getX()) {
						if (!proofOccupied(figureList.get(i).getX() + 1, figureList.get(i).getY() - 1)) {
							System.out.println("Schlagen möglich");
							return true;
						}
					}
					if (fig.getY() > figureList.get(i).getY() && fig.getX() < figureList.get(i).getX()) {
						if (!proofOccupied(figureList.get(i).getX() - 1, figureList.get(i).getY() + 1)) {
							System.out.println("Schlagen möglich");
							return true;
						}
					}
					if (fig.getY() > figureList.get(i).getY() && fig.getX() > figureList.get(i).getX()) {
						if (!proofOccupied(figureList.get(i).getX() - 1, figureList.get(i).getY() - 1)) {
							System.out.println("Schlagen möglich");
							return true;
						}
					}
				}
			}
		}
		return false;
	}
	
	//schlagen von zugfarbe möglich PROOF
	public boolean beatPossible() {
		for (int i = 0; i < figureList.size(); i++) {
			if (figureList.get(i).getColor() == amZug) {
				if (figureBeatPossible(figureList.get(i))) {
					return true;
				}
			}
		}
		return false;
	}
	
	//überprüfen, ob bei ausgewähltem feld geschlagen wird
	public boolean figureBeatPossible(int x, int y, Figures fig) {
		for (int i = 0; i < figureList.size(); i++) {
			//schlagen nur möglich, wenn der spielstein von der anderen Farbe ist
			if(fig.getColor() != figureList.get(i).getColor()) {
				//wenn eine Figur dort ist, wo die selectete hinaufen kann
				if (fig.movePossible(figureList.get(i).getX(), figureList.get(i).getY())) {
					
					//Figuren kommen aus vier möglichen Richtungen wo sie Schlagen können
					if (fig.getY() < figureList.get(i).getY() && fig.getX() < figureList.get(i).getX()) {
						if (!proofOccupied(figureList.get(i).getX() + 1, figureList.get(i).getY() + 1)) {
							//überprüfen ob das möbgliche x oder y auch dem ausgewählten entspricht
							if ((figureList.get(i).getX() + 1) == x && (figureList.get(i).getY() + 1) == y) {
								figureList.get(i).setBeaten(true);
								return true;
							}
						}
					}
					if (fig.getY() < figureList.get(i).getY() && fig.getX() > figureList.get(i).getX()) {
						if (!proofOccupied(figureList.get(i).getX() + 1, figureList.get(i).getY() - 1)) {
							if ((figureList.get(i).getX() + 1) == x && (figureList.get(i).getY() - 1) == y) {
								figureList.get(i).setBeaten(true);
								return true;
							}
						}
					}
					if (fig.getY() > figureList.get(i).getY() && fig.getX() < figureList.get(i).getX()) {
						if (!proofOccupied(figureList.get(i).getX() - 1, figureList.get(i).getY() + 1)) {
							if ((figureList.get(i).getX() - 1) == x && (figureList.get(i).getY() + 1) == y) {
								figureList.get(i).setBeaten(true);
								return true;
							}
						}
					}
					if (fig.getY() > figureList.get(i).getY() && fig.getX() > figureList.get(i).getX()) {
						if (!proofOccupied(figureList.get(i).getX() - 1, figureList.get(i).getY() - 1)) {
							if ((figureList.get(i).getX() - 1) == x && (figureList.get(i).getY() - 1) == y) {
								figureList.get(i).setBeaten(true);
								return true;
							}
						}
					}
				}
			}
		}
		return false;
	}
	
	//wenn eine Figur geschlagen ist
	public void beaten() {
		for (int i = 0; i < figureList.size(); i++) {
			if (figureList.get(i).getBeaten()) {
				figureList.remove(i);
			}
		}
	}
	
	//Schauen, ob der Zug legal ist sobald Feldausgewählt ist
	public boolean proofMove(int x, int y) {
		System.out.println("in Proof move");
		if(!proofOccupied(x,y)) {
			System.out.println("Feld nicht besetzt");
			for (int i = 0; i < figureList.size(); i++) {
				if (figureList.get(i).getSelected()) {
					System.out.println("selectete Figur gefunden");
					if(figureList.get(i).movePossible(x, y) && !beatPossible()) {
						System.out.println("Schlagen nicht möglich und feld erreichbar");
						return true;
					}
					else if(figureBeatPossible(x, y, figureList.get(i))) {
						System.out.println("Figur Schlägt");
						beaten();
						return true;
					}
				}
			}
		}	
		System.err.println("Keine Figur ausgewählt oder Falsches feld ausgewählt");
		return false;
	}
	
	public void makeMove(int x, int y) {
		for (int i = 0; i < figureList.size(); i++) {
			if (figureList.get(i).getSelected()) {
				figureList.get(i).setX(x);
				figureList.get(i).setY(y);
				System.out.println(figureList.get(i).getX());
				System.out.println(figureList.get(i).getY());
				if(!figureBeatPossible(figureList.get(i))) {
					amZug = !amZug;
				}
				figureList.get(i).setSelected(false);
				System.out.println(amZug);
				break;
			}
		} 
	}
}