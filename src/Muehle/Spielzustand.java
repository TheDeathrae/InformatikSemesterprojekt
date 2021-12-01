package Muehle;

public class Spielzustand {
    int[] feld = new int[24];
    int spielerAmZug = 1;
    int spielSteine[] = {9, 9};

    public int get_spielerAmZug() {
        return this.spielerAmZug;
    }

    public void naechsterSpieler() {
        this.spielerAmZug = this.spielerAmZug == 1 ? 2 : 1;
        System.out.println("naechster Spieler");
    }

    boolean feldFrei(int zug) {
        return this.feld[zug] == 0;
    }

    public boolean setzen(int zug) {
        if (!feldFrei(zug) || spielSteine[spielerAmZug - 1] == 0) {
            return false;
        }
        feld[zug] = spielerAmZug;
        spielSteine[spielerAmZug - 1]--;
        return true;
    }

    public boolean kannBewegen(int zug) {
        if (feldFrei(zug) || spielSteine[spielerAmZug - 1] != 0 || feld[zug] != 0) {
            return false;
        }
        return true;
    }

    public boolean bewegen(int bewegenVonFeld, int zug) {
        if (benachbartesFeld(bewegenVonFeld, zug)) {
            feld[bewegenVonFeld] = spielerAmZug;
            feld[zug] = 0;
            return true;
        }
        return false;
    }

    private boolean benachbartesFeld(int feld1, int feld2) {
        if (feld1 == feld2 - 1 || feld1 == feld2 - 1) {
            return true;
        }
        return false;
    }

    public boolean steinNehmen(int zug) {
        if (feldFrei(zug) || feld[zug] != spielerAmZug) {
            return false;
        }
        feld[zug] = 0;
        System.out.println("feld[3]: " + feld[3] + " feld[4]: " + feld[4] + " feld[5]: " + feld[5]);
        return true;
    }

    public boolean kannSteinNehmen(int zug) {
        //horizontal
        for (int i = 0; i < 22; i += 3) {
            if (feld[i] == feld[i + 1] && feld[i + 1] == feld[i + 2] && feld[i] != 0 && (zug == i || zug == i+1 || zug == i+2) && !steinNehmen(zug)) {
                return true;
            }
        }
        //vertikal 1
        if (feld[0] == feld[9] && feld[9] == feld[21] && feld[0] != 0 && (zug == 0 || zug == 9 || zug == 21) && !steinNehmen(zug)) {
            return true;
        }
        //vertikal 2
        if (feld[3] == feld[10] && feld[10] == feld[18] && feld[3] != 0 && (zug == 3 || zug == 10 || zug == 18) && !steinNehmen(zug)) {
            return true;
        }
        //vertikal 3
        if (feld[6] == feld[11] && feld[11] == feld[15] && feld[6] != 0 && (zug == 6 || zug == 11 || zug == 15) && !steinNehmen(zug)) {
            return true;
        }
        //vertikal 4
        if (feld[1] == feld[4] && feld[4] == feld[7] && feld[1] != 0 && (zug == 1 || zug == 4 || zug == 7) && !steinNehmen(zug)) {
            return true;
        }
        //vertikal 5
        if (feld[16] == feld[19] && feld[19] == feld[22] && feld[16] != 0 && (zug == 16 || zug == 19 || zug == 22) && !steinNehmen(zug)) {
            return true;
        }
        //vertikal 6
        if (feld[8] == feld[12] && feld[12] == feld[17] && feld[8] != 0 && (zug == 8 || zug == 12 || zug == 17) && !steinNehmen(zug)) {
            return true;
        }
        //vertikal 7
        if (feld[5] == feld[13] && feld[13] == feld[20] && feld[5] != 0 && (zug == 5 || zug == 13 || zug == 20) && !steinNehmen(zug)) {
            return true;
        }
        //vertikal 8
        if (feld[2] == feld[14] && feld[14] == feld[23] && feld[2] != 0 && (zug == 2 || zug == 14 || zug == 23) && !steinNehmen(zug)) {
            return true;
        }
        return false;
    }

    public boolean gewinnPruefen() {
        boolean nichtLeer = false;
        for (int i = 0; i < 24; ) {
            if (feld[i] != spielerAmZug) {
                if ((i == 23) && nichtLeer) {
                    return true;
                }
                if (feld[i] != 0) {
                    nichtLeer = true;
                }
                i++;
            }
        }
        return false;
    }
    public boolean steinInMuehle(int zug) {
        //horizontal
        for (int i = 0; i < 22; i += 3) {
            if (feld[i] == feld[i + 1] && feld[i + 1] == feld[i + 2] && feld[i] != 0 && (zug == i || zug == i+1 || zug == i+2)) {
                return true;
            }
        }
        //vertikal 1
        if (feld[0] == feld[9] && feld[9] == feld[21] && feld[0] != 0 && (zug == 0 || zug == 9 || zug == 21)) {
            return true;
        }
        //vertikal 2
        if (feld[3] == feld[10] && feld[10] == feld[18] && feld[3] != 0 && (zug == 3 || zug == 10 || zug == 18)) {
            return true;
        }
        //vertikal 3
        if (feld[6] == feld[11] && feld[11] == feld[15] && feld[6] != 0 && (zug == 6 || zug == 11 || zug == 15)) {
            return true;
        }
        //vertikal 4
        if (feld[1] == feld[4] && feld[4] == feld[7] && feld[1] != 0 && (zug == 1 || zug == 4 || zug == 7)) {
            return true;
        }
        //vertikal 5
        if (feld[16] == feld[19] && feld[19] == feld[22] && feld[16] != 0 && (zug == 16 || zug == 19 || zug == 22)) {
            return true;
        }
        //vertikal 6
        if (feld[8] == feld[12] && feld[12] == feld[17] && feld[8] != 0 && (zug == 8 || zug == 12 || zug == 17)) {
            return true;
        }
        //vertikal 7
        if (feld[5] == feld[13] && feld[13] == feld[20] && feld[5] != 0 && (zug == 5 || zug == 13 || zug == 20)) {
            return true;
        }
        //vertikal 8
        if (feld[2] == feld[14] && feld[14] == feld[23] && feld[2] != 0 && (zug == 2 || zug == 14 || zug == 23)) {
            return true;
        }
        return false;
    }
}
