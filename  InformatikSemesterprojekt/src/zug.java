public class zug extends initalisierung {
    boolean feldFrei(int feld[], int zug) {
        if (feld[zug] == 0) {
            zugMoeglich = true;
        }
        return zugMoeglich;
    }

    int[] setzten(int[] feld, int zugSpieler, int zug) {
        if (feldFrei(feld, zug)) {
            feld[zug] = zugSpieler;
            if (zugSpieler == 1) {
                spieler = 2;
            } else {
                spieler = 1;
            }
        } else {
            //Zug nicht möglich
        }
        return feld;
    }
}