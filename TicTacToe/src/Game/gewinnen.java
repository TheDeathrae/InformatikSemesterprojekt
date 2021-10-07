package Game;

public class gewinnen extends initalisierung {
    
	static boolean gewinnPruefen(int feld[], int spieler) {
        for (int i = 0; i < 7; i += 3) { //horizontal gewonnen
            if (feld[i] == feld[i + 1] && feld[i + 1] == feld[i + 2] && feld[i] == spieler && spieler != 0) {
                gewonnen = true;
                return gewonnen;
            }
        }
        for (int i = 0; i < 4; i++) { //vertikal gewonnen
            if (feld[i] == feld[i + 3] && feld[i + 3] == feld[i + 6] && feld[i] == spieler && spieler != 0) {
                gewonnen = true;
                return gewonnen;
            }
        }
        if (feld[0] == feld[4] && feld[4] == feld[8] && feld[0] == spieler && spieler != 0) { //diagonal gewinnen
            gewonnen = true;
            return gewonnen;
        } else {
            if (feld[2] == feld[4] && feld[4] == feld[6] && feld[0] == spieler && spieler != 0) {
                gewonnen = true;
            }
            for (int i = 0; i < 7; i ++){
                if (i != 0){
                    //patt
                }
            }
            return gewonnen;
        }
    }
}