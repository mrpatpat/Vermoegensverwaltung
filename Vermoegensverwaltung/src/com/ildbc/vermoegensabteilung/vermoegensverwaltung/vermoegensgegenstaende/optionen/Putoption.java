package com.ildbc.vermoegensabteilung.vermoegensverwaltung.vermoegensgegenstaende.optionen;

import com.ildbc.vermoegensabteilung.vermoegensverwaltung.vermoegensgegenstaende.aktien.Aktie;

/**
 * Klasse Putoption erbt von Option
 * Prüft ob der aktuele Kurs niedriger ist 
 * um die Putoption zu ziehen
 * 
 * @author Adrian, Marcel und Felix
 *
 *date 5.11.2014
 */

public class Putoption extends Option {

	public Putoption(int kaufdatum, long kaufpreis, String name, int anzahl, int startdatum, int dauer, int ausuebungspreis, Aktie basiswert) {
		super(kaufdatum, kaufpreis, name, anzahl, startdatum, dauer, ausuebungspreis, basiswert);
	}

	public void put() {
		// nicht gefordert
	}

	@Override
	public long getZeitwertInAusuebungsphase() {
		// TODO: LOGIK ?
		return Math.min(this.getBasiswert().getKurs(), this.getAusuebungspreis());
	}

	@Override
	public String getTyp() {
		return "Putoption";
	}

}
