package com.ildbc.vermoegensabteilung.vermoegensverwaltung.vermoegensgegenstaende.fonds;

import java.util.List;

import com.ildbc.vermoegensabteilung.vermoegensverwaltung.vermoegensgegenstaende.rentenpapiere.Rentenpapier;

public class Rentenfonds extends Fonds<Rentenpapier> {

	public Rentenfonds(int kaufdatum, long kaufpreis, String name, int anzahl, List<Rentenpapier> rentenpapiere) {
		super(kaufdatum, kaufpreis, name, anzahl, rentenpapiere);
	}

	@Override
	public String getTyp() {
		return "Rentenfonds";
	}

}
