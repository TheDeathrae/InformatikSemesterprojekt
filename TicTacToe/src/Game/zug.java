package Game;

public class zug extends initalisierung {
    
	boolean feldFrei(int feld[], int zug) {
        if (feld[zug] == 0) {
            zugMoeglich = true;
        }
        else {
        	zugMoeglich = false;
        }
        return zugMoeglich;
    }

    public boolean setzen(int zugSpieler, int zug) {
    	System.out.println(zug);
    	System.out.println("");
    	System.out.println(zugSpieler);
        System.out.println("");
     
    	if (feldFrei(feld, zug)) {
            feld[zug] = zugSpieler;
            for (int i = 0; i < 9; i++) {
            	System.out.println(feld[i]);
            }
            System.out.println("");
            return true;
        }
    	
       return false;
    }
}
