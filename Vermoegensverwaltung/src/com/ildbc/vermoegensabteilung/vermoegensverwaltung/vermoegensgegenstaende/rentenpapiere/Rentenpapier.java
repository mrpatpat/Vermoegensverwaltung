package com.ildbc.vermoegensabteilung.vermoegensverwaltung.vermoegensgegenstaende.rentenpapiere;

import com.ildbc.vermoegensabteilung.vermoegensverwaltung.vermoegensgegenstaende.Handelbar;
import com.ildbc.vermoegensabteilung.vermoegensverwaltung.vermoegensgegenstaende.festgelder.Festgeld;

/**
 * Representation des Rentenpapiers
 * 
 * @author Adrian, Marcel und Felix
 *
 *date 5.11.2014
 *
 */

public class Rentenpapier extends Festgeld implements Handelbar {

	private long kurs;
	
	/**
	 * Konstrukteur des Rentenpapiers
	 * 
	 * @param kaufdatum
	 * @param kaufpreis
	 * @param name
	 * @param anzahl
	 * @param laufzeit
	 * @param zins
	 * @param kurs
	 */

	public Rentenpapier(int kaufdatum, long kaufpreis, String name, int anzahl, int laufzeit, double zins, long kurs) {
		super(kaufdatum, kaufpreis, name, anzahl, laufzeit, zins);
		this.kurs = kurs;
	}
	
	/**
	 * Endwert ist der Kurs
	 */

	@Override
	public long getEndwert() {
		return this.getKurs();
	}

	/**
	 * Kurs wird angegeben
	 */
	
	public long getKurs() {
		return kurs;
	}
	
	/**
	 * 
	 */

	public void verkaufen() {
	}

	public void kaufen() {
	}

	/**
	 * Typ wird angegeben
	 */
	
	public String getTyp() {
		return "Rentenpapier";
	}
	
	/**
	 * Kurs wird gesetzt
	 */

	@Override
	public void setKurs(long kurs) {
		this.kurs = kurs;
	}

}
