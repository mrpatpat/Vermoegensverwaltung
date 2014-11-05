package com.ildbc.vermoegensabteilung.vermoegensverwaltung.vermoegensgegenstaende.fonds;

import java.util.List;

import com.ildbc.vermoegensabteilung.vermoegensverwaltung.vermoegensgegenstaende.Vermoegensgegenstand;

/**
 * Erstellung einer Abstraktenklasse fÃ¼r die Fonds
 * erbt von Vermoegensgegenstand
 * 
 * mit der Hilfe von java generics
 * 
 * @author Adrian, Marcel und Felix
 *
 * @param <T>
 * 
 * date 5.11.2014
 */

abstract class Fonds<T extends Vermoegensgegenstand> extends Vermoegensgegenstand {

	private final List<T> vermoegensgegenstaende;
	
	/**
	 * Konstrukteur des Fonds
	 * 
	 * @param kaufdatum
	 * @param kaufpreis
	 * @param name
	 * @param anzahl
	 * @param vermoegensgegenstaende
	 */

	public Fonds(int kaufdatum, long kaufpreis, String name, int anzahl, List<T> vermoegensgegenstaende) {
		super(kaufdatum, kaufpreis, name, anzahl);
		this.vermoegensgegenstaende = vermoegensgegenstaende;
	}
	
	/**
	 * die verschiedenen Vermögenswerten werden auf summiert
	 * und zurück gegeben
	 *
	 * @return long
	 */

	public long getZeitwert(int datum) {
		long summe = 0;

		for (T v : vermoegensgegenstaende) {
			summe += v.getZeitwert(datum);
		}

		return summe;
	}

}
