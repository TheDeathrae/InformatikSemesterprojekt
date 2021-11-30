package Muehle;

public class Spielzustand {
    int[] feld = new int[24];
    int spielerAmZug = 1;

    public int get_spielerAmZug() {
        return this.spielerAmZug;
    }

    boolean feldFrei(int zug) {
        return this.feld[zug] == 0;
    }

    public boolean setzen(int zug) {
        if (!feldFrei(zug)) {
            return false;
        }
        feld[zug] = spielerAmZug;
        this.spielerAmZug = this.spielerAmZug == 1 ? 2 : 1;
        return true;
    }

    public boolean steinNehmen(){
        //horizontal
        for (int i = 0; i<22; i+=3){
            if (feld[i] == feld[i+1] && feld[i+1] == feld[i+2] && feld[i] != 0) {
                return true;
            }
        }
        //vertikal 1
        if (feld[0] == feld[9] && feld[9] == feld[21] && feld[0] != 0) {
            return true;
        }
        //vertikal 2
        if (feld[3] == feld[10] && feld[10] == feld[18] && feld[3] != 0) {
            return true;
        }
        //vertikal 3
        if (feld[6] == feld[11] && feld[11] == feld[15] && feld[6] != 0) {
            return true;
        }
        //vertikal 4
        if (feld[1] == feld[4] && feld[4] == feld[7] && feld[1] != 0) {
            return true;
        }
        //vertikal 5
        if (feld[16] == feld[19] && feld[19] == feld[22] && feld[16] != 0) {
            return true;
        }
        //vertikal 6
        if (feld[8] == feld[12] && feld[12] == feld[17] && feld[8] != 0) {
            return true;
        }
        //vertikal 7
        if (feld[5] == feld[13] && feld[13] == feld[20] && feld[5] != 0) {
            return true;
        }
        //vertikal 8
        if (feld[2] == feld[14] && feld[14] == feld[23] && feld[2] != 0) {
            return true;
        }
        return false;
    }

    public int gewinnPruefen() {
        for (int i = 0; i<24;){
            if(feld[i] != spielerAmZug){
                i++;
                if(i == 23){
                    return 1;
                }
            }
        }
        return 2;
    }
}
