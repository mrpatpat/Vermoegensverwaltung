package com.ildbc.vermoegensabteilung.vermoegensverwaltung.vermoegensgegenstaende;

public abstract class Vermoegensgegenstand {

	private final int kaufdatum;
	private final long kaufpreis;
	private final String name;
	private final int anzahl;

	public Vermoegensgegenstand(int kaufdatum, long kaufpreis, String name, int anzahl) {
		this.kaufdatum = kaufdatum;
		this.kaufpreis = kaufpreis;
		this.name = name;
		this.anzahl = anzahl;
	}

	public int getKaufdatum() {
		return kaufdatum;
	}

	public long getKaufpreis() {
		return kaufpreis;
	}

	public String getName() {
		return name;
	}

	public abstract long getZeitwert(int datum);

	public abstract String getTyp();

	public int getAnzahl() {
		return anzahl;
	}

}
