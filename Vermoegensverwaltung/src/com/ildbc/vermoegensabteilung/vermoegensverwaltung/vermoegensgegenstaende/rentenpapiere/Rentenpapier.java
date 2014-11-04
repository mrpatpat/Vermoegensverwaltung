package com.ildbc.vermoegensabteilung.vermoegensverwaltung.vermoegensgegenstaende.rentenpapiere;

import com.ildbc.vermoegensabteilung.vermoegensverwaltung.vermoegensgegenstaende.Handelbar;
import com.ildbc.vermoegensabteilung.vermoegensverwaltung.vermoegensgegenstaende.festgelder.Festgeld;

public class Rentenpapier extends Festgeld implements Handelbar {

	private long kurs;

	public Rentenpapier(int kaufdatum, long kaufpreis, String name, int anzahl, int laufzeit, double zins, long kurs) {
		super(kaufdatum, kaufpreis, name, anzahl, laufzeit, zins);
		this.kurs = kurs;
	}

	@Override
	public long getEndwert() {
		return this.getKurs();
	}

	public long getKurs() {
		return kurs;
	}

	public void verkaufen() {
	}

	public void kaufen() {
	}

	public String getTyp() {
		return "Rentenpapier";
	}

	@Override
	public void setKurs(long kurs) {
		this.kurs = kurs;
	}

}
