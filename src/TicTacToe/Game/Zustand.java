package TicTacToe.Game;

/**
 * 0 1 2
 * 3 4 5
 * 6 7 8
 * Feld: 0-Leer; 1-Spieler1; 2-Spieler2
 */
public class Zustand {
    int[] feld = new int[9];
    int spielerAmZug = 1;

    public int get_spielerAmZug() {
        return this.spielerAmZug;
    }

    boolean feldFrei(int zug) {
        return this.feld[zug] == 0;
    }

    /**
     * @param zug Int zw. 1-9
     * @return
     */
    public boolean setzen(int zug) {
        if (!feldFrei(zug)) {
            return false;
        }
        feld[zug] = spielerAmZug;
        this.spielerAmZug = this.spielerAmZug == 1 ? 2 : 1;
        return true;
    }

    public int gewinnPruefen() {
        for (int i = 0; i <9; i++){
            System.out.println("Stelle " + i + ":" + feld[i]);
        }
        //horizontal gewonnen
        for (int i = 0; i < 7; i= i + 3) {
            if (feld[i] == feld[i + 1] && feld[i + 1] == feld[i + 2] && feld[i] != 0) {
                System.out.println("1");
                return 1;
            }
        }
        //vertikal gewonnen
        for (int i = 0; i < 2; i++) {
            if (feld[i] == feld[i + 3] && feld[i + 3] == feld[i + 6] && feld[i] != 0) {
                System.out.println("2");
                return 1;
            }
        }
        //diagonal gewonnen
        if (feld[0] == feld[4] && feld[4] == feld[8] && feld[0] != 0){
            System.out.println("3");
            return 1;
        }
        //diagonal gewonnen
        if (feld[2] == feld[4] && feld[4] == feld[6] && feld[2] != 0) {
            System.out.println("4");
            return 1;
        }
        //noch nicht fertig
        for (int i = 0; i <= 8; i++) {
            if (feld[i] == 0) {
                return 0;
            }
        }
        //unentschieden
        return 2;
    }

    public void reset() {
        for (int i = 0; i < 7; i++) {
            feld[i] = 0;
        }
    }
}