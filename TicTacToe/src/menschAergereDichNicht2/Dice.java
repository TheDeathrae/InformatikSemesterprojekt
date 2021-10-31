package menschAergereDichNicht2;

public class Dice {
	
	int numberRolled;
	
	int getNumberRolled() {
		return this.numberRolled;
	}
	void roll() {
		this.numberRolled = (int) (Math.random()*5 + 1);
	}

}
