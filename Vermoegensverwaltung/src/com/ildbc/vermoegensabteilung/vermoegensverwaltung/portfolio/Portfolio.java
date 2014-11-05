package com.ildbc.vermoegensabteilung.vermoegensverwaltung.portfolio;

import java.util.List;

import com.ildbc.vermoegensabteilung.vermoegensverwaltung.vermoegensgegenstaende.Vermoegensgegenstand;

/**
 * Portfolio ist ene Ansammlung der Vermoegenswerte Inhalt Aktien Festgelder
 * Fonds Immobilien Rentenpapiere + den Zusatz der Optionen
 * 
 * sie werden mit hilfe einer Liste generiet
 * 
 * @author Adrian, Marcel und Felix
 * @date 5.11.2014
 */

public class Portfolio {

	/**
	 * Vermögenswerte
	 */
	private final List<Vermoegensgegenstand> vermoegenswerte;

	/**
	 * Konstruktor.
	 * 
	 * @param vermoegenswerte
	 *            Liste aller Vermögenswerte des Portfolios
	 */
	public Portfolio(List<Vermoegensgegenstand> vermoegenswerte) {
		this.vermoegenswerte = vermoegenswerte;
	}

	/**
	 * Gibt die Liste der Portfoliopositionen zurück.
	 * 
	 * @return Portfoliopositionen
	 */
	public List<Vermoegensgegenstand> getVermoegenswerte() {
		return this.vermoegenswerte;
	}

	/**
	 * Gesamtinvestition des Portfolios.
	 * 
	 * @return Gesamtinvestition in Cent
	 */
	public long getGesamtinvestition() {

		long investition = 0;

		for (Vermoegensgegenstand v : vermoegenswerte) {
			investition += v.getAnzahl() * v.getKaufpreis();
		}

		return investition;
	}

	/**
	 * Zeitwert des Portfolios.
	 * 
	 * @param datum
	 *            Zeitpunkt in Jahren
	 * @return Zeitwert in Cent
	 */
	public long getZeitwert(int datum) {
		long zeitwert = 0;

		for (Vermoegensgegenstand v : vermoegenswerte) {
			zeitwert += v.getAnzahl() * v.getZeitwert(datum);
		}

		return zeitwert;
	}

	/**
	 * Bilanz des Portfolios.
	 * 
	 * @param datum
	 *            Zeitpunkt in Jahren
	 * @return bilanz in Cent
	 */
	public long getBilanz(int datum) {
		return this.getZeitwert(datum) - this.getGesamtinvestition();
	}

}
