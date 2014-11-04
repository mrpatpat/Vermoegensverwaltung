package com.ildbc.vermoegensabteilung.vermoegensverwaltung.vermoegensgegenstaende;

import com.ildbc.vermoegensabteilung.vermoegensverwaltung.portfolio.PortfolioPosition;

public abstract class Vermoegensgegenstand implements PortfolioPosition {

	private final int kaufdatum = 0;

	private final long kaufpreis = 0L;

	private final String name = "";

	public int anzahl;

	public Vermoegensgegenstand() {
	}

	public int getKaufdatum() {
		return 0;
	}

	public long getKaufpreis() {
		return 0L;
	}

	public String getName() {
		return "";
	}

	public abstract long getZeitwert(int datum);

	public int getAnzahl() {
		return 0;
	}

}
