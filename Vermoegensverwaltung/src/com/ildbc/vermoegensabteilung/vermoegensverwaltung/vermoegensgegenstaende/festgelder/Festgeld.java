package com.ildbc.vermoegensabteilung.vermoegensverwaltung.vermoegensgegenstaende.festgelder;

import com.ildbc.vermoegensabteilung.vermoegensverwaltung.vermoegensgegenstaende.Vermoegensgegenstand;

public class Festgeld extends Vermoegensgegenstand {

	private final int laufzeit;
	private final double zins;

	public Festgeld(int kaufdatum, long kaufpreis, String name, int anzahl, int laufzeit, double zins) {
		super(kaufdatum,kaufpreis,name,anzahl);
		this.laufzeit = laufzeit;
		this.zins = zins;
	}

	public long getEndwert() {
		
		double a = 1 + (zins/100d);
		a = Math.pow(a, laufzeit);
		a *= getKaufpreis();
		
		return (long)a;
		
	}

	@Override
	public String getTyp() {
		return "Festgeld";
	}

	@Override
	public long getZeitwert(int datum) {
		return getKaufpreis();
	}

}
