package menschAergereDichNicht2;

public class Board {
	
	private int positionen[] = new int[72];
	private int spielerAnzahl;
	private int anDerReihe;
	private int spielerGewonnen;
	private boolean zugDurchgefuehrt = false;
	
	public int getSpielerAnzahl() {
		return this.spielerAnzahl;
	}
	public void setSpielerAnzahl(int i) {
		this.spielerAnzahl = i;
	}
	public int getPositionen(int i) {
		return positionen[i];
	}
	public void setPositionen(int position, int wert) {
		this.positionen[position] = wert;
	}
	public int[] getPositionen() {
		return positionen;
	}
	public int getAnDerReihe() {
		return anDerReihe;
	}
	public void setAnDerReihe(int anDerReihe) {
		this.anDerReihe = anDerReihe;
	}
	public int getSpielerGewonnen() {
		return spielerGewonnen;
	}
	public void setSpielerGewonnen(int spielerGewonnen) {
		this.spielerGewonnen = spielerGewonnen;
	}
	public boolean isZugDurchgefuehrt() {
		return zugDurchgefuehrt;
	}
	public void setZugDurchgefuehrt(boolean zugDurchgefuehrt) {
		this.zugDurchgefuehrt = zugDurchgefuehrt;
	}
	
	void initialisieren() {
		for (int i=0; i <= 72; i++) {
			positionen[i] = 0;
		}
		if (spielerAnzahl >= 1) {
			for (int i=56; i <= 59; i++) {
				positionen[i] = 1;
			}
		}
		if (spielerAnzahl >= 2) {
			for (int i=60; i <= 63; i++) {
				positionen[i] = 2;
			}
		}
		if (spielerAnzahl >= 3) {
			for (int i=64; i <= 67; i++) {
				positionen[i] = 3;
			}
		}
		if (spielerAnzahl >= 4) {
			for (int i=68; i <= 71; i++) {
				positionen[i] = 4;
			}
		}
		
	}
	
	boolean gewinnen() {
		if(positionen[56]==1 && positionen[57]==1 && positionen[58]==1 && positionen[59]==1) {
			setSpielerGewonnen(1);
			return true;
		} else if(positionen[60]==2 && positionen[61]==2 && positionen[62]==2 && positionen[63]==2) {
			setSpielerGewonnen(2);
			return true;
		} else if(positionen[64]==3 && positionen[65]==3 && positionen[66]==3 && positionen[67]==3) {
			setSpielerGewonnen(3);
			return true;
		} else if(positionen[68]==4 && positionen[69]==4 && positionen[70]==4 && positionen[71]==4) {
			setSpielerGewonnen(4);
			return true;
		} else {
			return false;
		}
	}
	
	void bewegung(int start, int ende) {																						// führt Bewegung von Steinen aus
		int startObjekt = positionen[start];
		int endObjekt = positionen[ende];
		
		if(endObjekt == 0) {
			positionen[start] = 0;
			positionen[ende] = startObjekt;
			setZugDurchgefuehrt(true);
		} else if(endObjekt != startObjekt) {
			positionen[start] = 0;
			positionen[ende] = startObjekt;
			if(endObjekt == 1) {
				for(int i = 56; i <= 59; i++) {
					int a = 0;																					// sorgt dafür, dass nicht mehrere Plätze besetzt werden
					if(a == 0) {
						if(positionen[i] == 0) {
							positionen[i] = endObjekt;
							a++;
						}
					}
				}
			} else if(endObjekt == 2) {
				for(int i = 60; i <= 63; i++) {
					int a = 0;																					
					if(a == 0) {
						if(positionen[i] == 0) {
							positionen[i] = endObjekt;
							a++;
						}
					}
				}
			} else if(endObjekt == 3) {
				for(int i = 64; i <= 67; i++) {
					int a = 0;																					
					if(a == 0) {
						if(positionen[i] == 0) {
							positionen[i] = endObjekt;
							a++;
						}
					}
				}
			} else if(endObjekt == 4) {
				for(int i = 68; i <= 71; i++) {
					int a = 0;																					
					if(a == 0) {
						if(positionen[i] == 0) {
							positionen[i] = endObjekt;
							a++;
						}
					}
				}
			}
			setZugDurchgefuehrt(true);
		}	
	}
	
	void move(int startposition, int spieler, int wuerfel) {																	// legt fest auf welchen Orten Bewegungen 
		if(spieler == 1) {																										// durchgeführt werden können
			if(startposition == 56 || startposition == 58 || startposition == 58 || startposition == 59) {						// Spielstein ist in der Basis
				if(wuerfel == 6) {																								// 6 wurde gewürfelt
				bewegung(startposition, 0);
				}
			}
			else if(startposition == 40 || startposition == 41 || startposition == 42 || startposition == 43 ) {				// Spielstein ist am Ende
				if((startposition + wuerfel) <= 43) {
					bewegung(startposition, (startposition + wuerfel));
				}
			} else if((startposition == 34 || startposition == 35 || startposition == 36|| startposition == 37|| startposition == 38|| startposition == 39) && startposition + wuerfel > 39) {      //Spielstein geht nach Ende
				if((startposition + wuerfel) <= 43) {
					bewegung(startposition, (startposition + wuerfel + 0));
				}
			} else {
				bewegung(startposition, startposition + wuerfel);
			}
			
		} else if(spieler == 2) {
			if(startposition == 60 || startposition == 61 || startposition == 62 || startposition == 63) {						// Spielstein ist in der Basis
				if(wuerfel == 6) {																								// 6 wurde gewürfelt
				bewegung(startposition, 10);
				}
			}
			else if(startposition == 44 || startposition == 45 || startposition == 46 || startposition == 47 ) {				// Spielstein ist am Ende
				if((startposition + wuerfel) <= 47) {
					bewegung(startposition, (startposition + wuerfel));
				}
			} else if((startposition == 4 || startposition == 5 || startposition == 6|| startposition == 7|| startposition == 8|| startposition == 9) && startposition + wuerfel > 9) {     //Spielstein geht nach Ende
				if((startposition + wuerfel) <= 47) {
					bewegung(startposition, (startposition + wuerfel + 34));
				}
			} else {
				bewegung(startposition, startposition + wuerfel);
			}
			
		} else if(spieler == 3) {
			
			if(startposition == 64 || startposition == 65 || startposition == 66 || startposition == 67) {						// Spielstein ist in der Basis
				if(wuerfel == 6) {																								// 6 wurde gewürfelt
				bewegung(startposition, 20);
				}
			}
			else if(startposition == 48 || startposition == 49 || startposition == 50 || startposition == 51 ) {				// Spielstein ist am Ende
				if((startposition + wuerfel) <= 51) {
					bewegung(startposition, (startposition + wuerfel));
				}
			} else if((startposition == 14 || startposition == 15 || startposition == 16|| startposition == 17|| startposition == 18|| startposition == 19) && startposition + wuerfel > 19) {     //Spielstein geht nach Ende
				if((startposition + wuerfel) <= 51) {
					bewegung(startposition, (startposition + wuerfel + 28));
				}
			} else {
				bewegung(startposition, startposition + wuerfel);
			}
			
		} else {
			
			if(startposition == 68 || startposition == 69 || startposition == 70 || startposition == 71) {						// Spielstein ist in der Basis
				if(wuerfel == 6) {																								// 6 wurde gewürfelt
				bewegung(startposition, 30);
				}
			}
			else if(startposition == 52 || startposition == 53 || startposition == 54 || startposition == 55 ) {				// Spielstein ist am Ende
				if((startposition + wuerfel) <= 55) {
					bewegung(startposition, (startposition + wuerfel));
				}
			} else if((startposition == 24 || startposition == 25 || startposition == 26|| startposition == 27|| startposition == 28|| startposition == 29) && startposition + wuerfel > 29) {     //Spielstein geht nach Ende
				if((startposition + wuerfel) <= 55) {
					bewegung(startposition, (startposition + wuerfel + 22));
				}
			} else {
				bewegung(startposition, startposition + wuerfel);
			}
			
		}
	}
}
