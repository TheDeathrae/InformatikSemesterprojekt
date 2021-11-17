package menschAergereDichNicht;

public class Dice {
	
	private int numberRolled;
	
	int getNumberRolled() {
		return this.numberRolled;
	}
	void roll() {
		this.numberRolled = (int) (Math.random()*6 + 1);
	}

}
