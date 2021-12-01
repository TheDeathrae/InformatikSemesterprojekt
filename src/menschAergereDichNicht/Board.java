package menschAergereDichNicht;

public class Board {
	
	private int positionen[] = new int[73];
	private int spielerAnzahl;
	private int anDerReihe;
	private int spielerGewonnen = 0;
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
		if(positionen[40]==1 && positionen[41]==1 && positionen[42]==1 && positionen[43]==1) {
			setSpielerGewonnen(1);
			return true;
		} else if(positionen[44]==2 && positionen[45]==2 && positionen[46]==2 && positionen[47]==2) {
			setSpielerGewonnen(2);
			return true;
		} else if(positionen[48]==3 && positionen[49]==3 && positionen[50]==3 && positionen[51]==3) {
			setSpielerGewonnen(3);
			return true;
		} else if(positionen[52]==4 && positionen[53]==4 && positionen[54]==4 && positionen[55]==4) {
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
				int a = 0;	
				for(int i = 56; i <= 59; i++) {																				// sorgt dafür, dass nicht mehrere Plätze besetzt werden
					if(a == 0) {
						if(positionen[i] == 0) {
							positionen[i] = endObjekt;
							a++;
						}
					}
				}
			} else if(endObjekt == 2) {
				int a = 0;	
				for(int i = 60; i <= 63; i++) {																				
					if(a == 0) {
						if(positionen[i] == 0) {
							positionen[i] = endObjekt;
							a++;
						}
					}
				}
			} else if(endObjekt == 3) {
				int a = 0;	
				for(int i = 64; i <= 67; i++) {																									
					if(a == 0) {
						if(positionen[i] == 0) {
							positionen[i] = endObjekt;
							a++;
						}
					}
				}
			} else if(endObjekt == 4) {
				int a = 0;	
				for(int i = 68; i <= 71; i++) {																		
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
		if(spieler == 1) {																										// durchgefï¿½hrt werden kï¿½nnen
			if(positionen[0] == 1 && zugMoeglichVonStart(1, wuerfel)) {
				if(startposition == 0) {
					bewegung(0, wuerfel);
				}
			} else if(numberInBase(1) != 0 && wuerfel == 6 && positionen[0] != 1) {
				if(startposition > 55 && startposition < 60) {
					bewegung(startposition, 0);
				}												// Spielstein ist in der Basis
			} else if(startposition == 56 || startposition == 58 || startposition == 58 || startposition == 59) {
				if(wuerfel == 6) {																								// 6 wurde gewï¿½rfelt
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
			
			if(positionen[10] == 2 && zugMoeglichVonStart(2, wuerfel)) {
				if(startposition == 10) {
					bewegung(10, 10 + wuerfel);
				}
			} else if(numberInBase(2) != 0  && wuerfel == 6 && positionen[10] != 2) {
				if(startposition > 59 && startposition < 64) {
					bewegung(startposition, 10);
				}												// Spielstein ist in der Basis
			} else if(startposition == 60 || startposition == 61 || startposition == 62 || startposition == 63) {						// Spielstein ist in der Basis
				if(wuerfel == 6) {																								// 6 wurde gewï¿½rfelt
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
			} else if(startposition <= 39 && startposition >= 34 && startposition + wuerfel > 39) {
				bewegung(startposition, startposition + wuerfel - 40);				
			} else {
				bewegung(startposition, startposition + wuerfel);
			}
			
		} else if(spieler == 3) {
			
			if(positionen[20] == 3 && zugMoeglichVonStart(3, wuerfel)) {
				if(startposition == 20) {
					bewegung(20, 20 + wuerfel);
				}
			} else if(numberInBase(3) != 0  && wuerfel == 6 && positionen[20] != 3) {
				if(startposition > 63 && startposition < 68) {
					bewegung(startposition, 20);
				}												// Spielstein ist in der Basis
			} else if(startposition == 64 || startposition == 65 || startposition == 66 || startposition == 67) {						// Spielstein ist in der Basis
				if(wuerfel == 6) {																								// 6 wurde gewï¿½rfelt
				bewegung(startposition, 20);
				}
			} else if(startposition == 48 || startposition == 49 || startposition == 50 || startposition == 51 ) {				// Spielstein ist am Ende
				if((startposition + wuerfel) <= 51) {
					bewegung(startposition, (startposition + wuerfel));
				}
			} else if((startposition == 14 || startposition == 15 || startposition == 16|| startposition == 17|| startposition == 18|| startposition == 19) && startposition + wuerfel > 19) {     //Spielstein geht nach Ende
				if((startposition + wuerfel) <= 51) {
					bewegung(startposition, (startposition + wuerfel + 28));
				}
			} else if(startposition <= 39 && startposition >= 34 && startposition + wuerfel > 39) {
				bewegung(startposition, startposition + wuerfel - 40);				
			} else {
				bewegung(startposition, startposition + wuerfel);
			}
			
		} else {
			
			if(positionen[30] == 4 && zugMoeglichVonStart(4, wuerfel)) {
				if(startposition == 30) {
					bewegung(30, 30 + wuerfel);
				}
			}  else if(numberInBase(4) != 0  && wuerfel == 6 && positionen[30] != 4) {
				if(startposition > 67 && startposition < 72) {
					bewegung(startposition, 30);
				}												// Spielstein ist in der Basis
			}else if(startposition == 68 || startposition == 69 || startposition == 70 || startposition == 71) {						// Spielstein ist in der Basis
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
			}  else if(startposition <= 39 && startposition >= 34 && startposition + wuerfel > 39) {
				bewegung(startposition, startposition + wuerfel - 40);				
			} else {
				bewegung(startposition, startposition + wuerfel);
			}
			
		}
	}
	public boolean isInBase(int spieler) {
		
		int zaehler = 0;
		if(spieler == 1) {
			for(int i = 0; i < 4; i++) {
				int hausStelle = 43 - i;
				if(positionen[hausStelle] == 1) {
					zaehler ++;
				} else {
					break;
				}
			}
			for(int i = 0; i < 4; i++) {
				int baseStelle = i + 56;
				if(positionen[baseStelle] == 1)
					zaehler ++;
			}
		} else if(spieler == 2) {
			for(int i = 0; i < 4; i++) {
				int hausStelle = 43 - i;
				if(positionen[hausStelle] == 1) {
					zaehler ++;
				} else {
					break;
				}
			}
			for(int i = 0; i < 4; i++) {
				int baseStelle = i + 60;
				if(positionen[baseStelle] == 2)
					zaehler ++;
			}
		} else if(spieler == 3) {
			for(int i = 0; i < 4; i++) {
				int hausStelle = 43 - i;
				if(positionen[hausStelle] == 1) {
					zaehler ++;
				} else {
					break;
				}
			}
			for(int i = 0; i < 4; i++) {
				int baseStelle = i + 64;
				if(positionen[baseStelle] == 3)
					zaehler ++;
			}
		} else if(spieler == 4) {
			for(int i = 0; i < 4; i++) {
				int hausStelle = 43 - i;
				if(positionen[hausStelle] == 1) {
					zaehler ++;
				} else {
					break;
				}
			}
			for(int i = 0; i < 4; i++) {
				int baseStelle = i + 68;
				if(positionen[baseStelle] == 4)
					zaehler ++;
			}
		}
		if(zaehler == 4) {
			return true;
		} else {
			return false;
		}	
	}
	boolean zugMoeglichVonStart(int spieler, int wuerfel) {
		if(spieler == 1) {
			if(positionen[wuerfel] != 1) {
				return true;
			} else {
				return false;
			}
		} else if(spieler == 2) {
			if(positionen[wuerfel+10] != 2) {
				return true;
			} else {
				return false;
			}
		} else if(spieler == 3) {
			if(positionen[wuerfel+20] != 3) {
				return true;
			} else {
				return false;
			}
		} else {
			if(positionen[wuerfel+30] != 4) {
				return true;
			} else {
				return false;
			}
		}
	}
	int numberInBase(int spieler) {
		int zaehler = 0;
		if(spieler == 1) {
			for(int i = 0; i < 4; i++) {
				int baseStelle = i + 56;
				if(positionen[baseStelle] == 1)
					zaehler ++;
			}
		} else if(spieler == 2) {
			for(int i = 0; i < 4; i++) {
				int baseStelle = i + 60;
				if(positionen[baseStelle] == 2)
					zaehler ++;
			}
		} else if(spieler == 3) {
			for(int i = 0; i < 4; i++) {
				int baseStelle = i + 64;
				if(positionen[baseStelle] == 3)
					zaehler ++;
			}
		} else if(spieler == 4) {
			for(int i = 0; i < 4; i++) {
				int baseStelle = i + 68;
				if(positionen[baseStelle] == 4)
					zaehler ++;
			}
		}
		return zaehler;
	}
} 	

