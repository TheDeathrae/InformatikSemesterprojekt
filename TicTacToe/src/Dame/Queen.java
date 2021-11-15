package Dame;

public class Queen extends Figures{

	public Queen(boolean color, int x, int y) {
		super(color, x, y);
	}
	
	//Methoden um zu überprüfen ob züge möglich sind
	@Override
	public boolean movePossible(int x, int y) {
			if ((this.x - x) == (this.y - y) || (this.x + x) == (this.y - y)) {
				return true;
			}
			else {
				return false;
			}
	}
}
