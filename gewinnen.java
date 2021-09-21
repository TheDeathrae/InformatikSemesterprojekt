public class gewinnen {
	int spieler1 = 1;
	int spieler2 = 2;
	final int[] feld = new int[8];
	int[] feldBesetzt = new int[8];
	int gewinnen;
	void initalisierung() {
		for (int i = 0; i>8; i++) {
			feldBesetzt[i] = 0;
		}
	}
	void zug(int feldZug) {
		if (feldBesetzt[feldZug] != 0) {
			System.out.println("Bereits besetzt");
		}
	}
	void gewinnPruefen() {
	
	}
}