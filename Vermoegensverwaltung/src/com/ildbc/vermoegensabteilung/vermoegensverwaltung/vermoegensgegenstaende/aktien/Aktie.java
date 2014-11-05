package com.ildbc.vermoegensabteilung.vermoegensverwaltung.vermoegensgegenstaende.aktien;
import com.ildbc.vermoegensabteilung.vermoegensverwaltung.vermoegensgegenstaende.Handelbar;
import com.ildbc.vermoegensabteilung.vermoegensverwaltung.vermoegensgegenstaende.Vermoegensgegenstand;

/**
 * Representation einer Aktien 
 * und erben Eigenschaften von der Klasse Vermoegensgegenstand
 * das Interface was benutz ist fuer die Klasse ist Handelbar
 *
 * 
 * @author Adrian, Marcel und Felix
 * date 5.11.2014
 */

public class Aktie extends Vermoegensgegenstand implements Handelbar {

	private long kurs;
	
	/**
	 * Konstrukteur für die Aktie
	 * 
	 * @param kaufdatum
	 * @param kaufpreis
	 * @param name
	 * @param anzahl
	 * @param kurs
	 */

	public Aktie(int kaufdatum, long kaufpreis, String name, int anzahl,long kurs) {
		super(kaufdatum,kaufpreis,name,anzahl);
		this.kurs = kurs;
	}
	
	/**
	 * Kurs setzen
	 */
	
	public void setKurs(long kurs){
		this.kurs = kurs;
	}

	/**
	 * Aktuellen Wert bekommen
	 */
	
	public long getZeitwert(int zeit) {
		return getKurs();
	}

	/**
	 * Aktueller Kurs
	 */
	
	public long getKurs() {
		return kurs;
	}
	
	/**
	 * Typ des Vermögengegestand
	 */

	@Override
	public String getTyp() {
		return "Aktie";
	}
	
	/**
	 * Ationen die man benutzen kann mit den Aktien
	 */

	public void verkaufen() {
		//nicht angegeben, aber gefordert
	}

	public void kaufen() {
		//nicht angegeben, aber gefordert
	}


}
