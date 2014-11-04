package com.ildbc.vermoegensabteilung.vermoegensverwaltung.vermoegensgegenstaende.fonds;

import java.util.List;

import com.ildbc.vermoegensabteilung.vermoegensverwaltung.vermoegensgegenstaende.aktien.Aktie;

public class Aktienfonds extends Fonds<Aktie> {

	public Aktienfonds(int kaufdatum, long kaufpreis, String name, int anzahl, List<Aktie> aktien) {
		super(kaufdatum, kaufpreis, name, anzahl, aktien);
	}

	@Override
	public String getTyp() {
		return "Aktienfonds";
	}

}
