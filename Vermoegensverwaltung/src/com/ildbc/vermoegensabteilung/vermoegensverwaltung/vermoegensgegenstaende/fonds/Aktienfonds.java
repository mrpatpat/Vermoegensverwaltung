package com.ildbc.vermoegensabteilung.vermoegensverwaltung.vermoegensgegenstaende.fonds;

import java.util.List;

import com.ildbc.vermoegensabteilung.vermoegensverwaltung.vermoegensgegenstaende.aktien.Aktie;

/**
 * Ansammlung der Aktien
 * Klasse Aktienfonds
 * erbt von Fonds
 * 
 * @author Adrian, Marcel und Felix
 *
 * date 5.11.2014
 */

public class Aktienfonds extends Fonds<Aktie> {
	
	/**
	 * Konstrukteur des Aktienfonds
	 * 
	 * @param kaufdatum
	 * @param kaufpreis
	 * @param name
	 * @param anzahl
	 * @param aktien
	 */

	public Aktienfonds(int kaufdatum, long kaufpreis, String name, int anzahl, List<Aktie> aktien) {
		super(kaufdatum, kaufpreis, name, anzahl, aktien);
	}

	/**
	 * Typ wird angegeben
	 * Aktienfonds
	 */
	
	@Override
	public String getTyp() {
		return "Aktienfonds";
	}

}
