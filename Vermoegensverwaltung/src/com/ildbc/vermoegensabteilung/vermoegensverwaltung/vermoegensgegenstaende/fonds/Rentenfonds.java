package com.ildbc.vermoegensabteilung.vermoegensverwaltung.vermoegensgegenstaende.fonds;

import java.util.List;

import com.ildbc.vermoegensabteilung.vermoegensverwaltung.vermoegensgegenstaende.rentenpapiere.Rentenpapier;

/**
 * Ansammlung der Rentenpapiere
 * Klasse Rentenfonds
 * erbt von Fonds
 * 
 * mit der Hilfe von java generics
 * 
 * @author Adrian, Marcel und Felix
 *
 * date 5.11.2014
 */

public class Rentenfonds extends Fonds<Rentenpapier> {
	
	/**
	 * Konstrukteur für Rentenfonds
	 * 
	 * @param kaufdatum
	 * @param kaufpreis
	 * @param name
	 * @param anzahl
	 * @param rentenpapiere
	 */

	public Rentenfonds(int kaufdatum, long kaufpreis, String name, int anzahl, List<Rentenpapier> rentenpapiere) {
		super(kaufdatum, kaufpreis, name, anzahl, rentenpapiere);
	}
	
	/**
	 * Rentenfonds wir als Typ zurück gegeben
	 */

	@Override
	public String getTyp() {
		return "Rentenfonds";
	}

}
