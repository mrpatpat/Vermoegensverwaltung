package com.ildbc.vermoegensabteilung.vermoegensverwaltung.vermoegensgegenstaende.fonds;

import java.util.List;

import com.ildbc.vermoegensabteilung.vermoegensverwaltung.vermoegensgegenstaende.Vermoegensgegenstand;

abstract class Fonds<T extends Vermoegensgegenstand> extends Vermoegensgegenstand {

	private final List<T> vermoegensgegenstaende;

	public Fonds(int kaufdatum, long kaufpreis, String name, int anzahl, List<T> vermoegensgegenstaende) {
		super(kaufdatum, kaufpreis, name, anzahl);
		this.vermoegensgegenstaende = vermoegensgegenstaende;
	}

	public long getZeitwert(int datum) {
		long summe = 0;

		for (T v : vermoegensgegenstaende) {
			summe += v.getZeitwert(datum);
		}

		return summe;
	}

}
