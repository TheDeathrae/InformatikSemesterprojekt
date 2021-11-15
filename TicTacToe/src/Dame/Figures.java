package Dame;

public class Figures {
	
	//Schwarz ist false und weiß true
	protected boolean color; 
	protected int x; 
	protected int y; 
	protected boolean selected = false;
	protected boolean beaten = false;
	//Konstruktor für jedes objekt einer Spielfigur
	public Figures(boolean color, int x, int y) {
		this.color = color; 
		this.x = x;
		this.y = y;
	}
	//Getter- und Settermethoden für die Attribute des Objekts
	public boolean getColor() {
		return this.color;
	}
	public int getX() {
		return this.x;
	}
	public int getY() {
		return this.y;
	}
	public boolean getSelected() {
		return this.selected;
	}
	public boolean getBeaten() {
		return this.beaten;
	}
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
	public void setSelected(boolean selected) {
		this.selected = selected;
	}
	public void setBeaten(boolean beaten) {
		this.beaten = beaten; 
	}
	//keine Settermehtode für color, da diese sich nicht ändert.
	
	//Methoden um zu überprüfen ob züge möglich sind
	public boolean movePossible(int x, int y) {
		if (this.color == true) {
			if ((x == this.x + 1 || x == this.x - 1) && y ==this.y - 1) {
				return true;
			}
			else {
				return false;
			}
		}
		else {
			if ((x == this.x + 1 || x == this.x - 1) && y == this.y + 1) {
				return true;
			}
			else {
				return false;
			}
		}
	}
}
