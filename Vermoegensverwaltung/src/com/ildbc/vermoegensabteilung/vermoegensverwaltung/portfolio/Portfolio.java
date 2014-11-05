package com.ildbc.vermoegensabteilung.vermoegensverwaltung.portfolio;

import java.util.List;

import com.ildbc.vermoegensabteilung.vermoegensverwaltung.vermoegensgegenstaende.Vermoegensgegenstand;

/**
 * Portfolio ist ene Ansammlung der Vermoegenswerte
 * Inhalt Aktien Festgelder Fonds Immobilien Rentenpapiere
 * + den Zusatz der Optionen
 * 
 * sie werden mit hilfe einer Liste generiet
 * 
 * @author Adrian, Marcel und Felix
 *date 5.11.2014
 */

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
