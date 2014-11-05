package com.ildbc.vermoegensabteilung.vermoegensverwaltung.vermoegensgegenstaende.festgelder;

import com.ildbc.vermoegensabteilung.vermoegensverwaltung.vermoegensgegenstaende.Vermoegensgegenstand;

/**
 * Representation des Festgeld 
 * Klasse erbt von Vermoegensgegenstand
 * Kapital * (1+p/100)^laufzeit
 * Endwert wird erst am Ende der Laufzeit angegeben
 * 
 * @author Adrian, Marcel und Felix
 * 
 *date 5.11.2014
 */

public class Festgeld extends Vermoegensgegenstand {

	private final int laufzeit;
	private final double zins;
	
	/**
	 * Konstuktuer mit den Eigenschaften der Vermoegenstand
	 * 
	 * @param kaufdatum
	 * @param kaufpreis
	 * @param name
	 * @param anzahl
	 * @param laufzeit
	 * @param zins
	 */

	public Festgeld(int kaufdatum, long kaufpreis, String name, int anzahl, int laufzeit, double zins) {
		super(kaufdatum,kaufpreis,name,anzahl);
		this.laufzeit = laufzeit;
		this.zins = zins;
	}

	/**
	 * Gibt den Endwert an des Festgeldes
	 * 
	 * @return long
	 */
	
	public long getEndwert() {
		
		double a = 1 + (zins/100d);
		a = Math.pow(a, laufzeit);
		a *= getKaufpreis();
		
		return (long)a;
		
	} 
	
	/**
	 * Gibt den Typ an
	 */

	@Override
	public String getTyp() {
		return "Festgeld";
	}
	
	/**
	 * Zeitwert wird angegeben
	 */

	@Override
	public long getZeitwert(int datum) {
		return getKaufpreis();
	}

}
