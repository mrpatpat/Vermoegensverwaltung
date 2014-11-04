package com.ildbc.vermoegensabteilung.vermoegensverwaltung.portfolio;

import java.util.List;

public class Portfolio {

	public final List<PortfolioPosition> vermoegenswerte;

	public Portfolio(List<PortfolioPosition> vermoegenswerte) {
		this.vermoegenswerte = vermoegenswerte;
	}

	public List<PortfolioPosition> getVermoegenswerte() {
		return null;
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
