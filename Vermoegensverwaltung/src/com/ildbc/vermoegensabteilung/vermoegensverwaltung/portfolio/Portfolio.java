package com.ildbc.vermoegensabteilung.vermoegensverwaltung.portfolio;

import java.util.List;

import com.ildbc.vermoegensabteilung.vermoegensverwaltung.vermoegensgegenstaende.Vermoegensgegenstand;

public class Portfolio {

	private final List<Vermoegensgegenstand> vermoegenswerte;

	public Portfolio(List<Vermoegensgegenstand> vermoegenswerte) {
		this.vermoegenswerte = vermoegenswerte;
	}

	public List<Vermoegensgegenstand> getVermoegenswerte() {
		return this.vermoegenswerte;
	}

	public long getGesamtinvestition() {
		return 0L;
	}

	public long getZeitwert(int datum) {
		return 0L;
	}

	public long getBilanz() {
		return 0L;
	}

}
