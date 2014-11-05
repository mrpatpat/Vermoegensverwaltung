package com.ildbc.vermoegensabteilung.vermoegensverwaltung.vermoegensgegenstaende.optionen;

import com.ildbc.vermoegensabteilung.vermoegensverwaltung.vermoegensgegenstaende.aktien.Aktie;

/**
 * Klasse Calloption erbt von Option
 * Prüft ob der aktuele Kurs niedriger ist 
 * um die Calloption zu ziehen
 * 
 * @author Adrian, Marcel und Felix
 *
 *date 5.11.2014
 */

public class Calloption extends Option {
	
	/**
	 * Konstrukteur f�r die Calloptionen
	 * 
	 * @param kaufdatum
	 * @param kaufpreis
	 * @param name
	 * @param anzahl
	 * @param startdatum
	 * @param dauer
	 * @param ausuebungspreis
	 * @param basiswert
	 */

	public Calloption(int kaufdatum, long kaufpreis, String name, int anzahl, int startdatum, int dauer, int ausuebungspreis, Aktie basiswert) {
		super(kaufdatum, kaufpreis, name, anzahl, startdatum, dauer, ausuebungspreis, basiswert);
	}

	public void call() {
		// nicht gefordert
	}

	@Override
	public long getZeitwertInAusuebungsphase() {
		//TODO: LOGIK ?
		return Math.min(this.getBasiswert().getKurs(), this.getAusuebungspreis());
	}

	@Override
	public String getTyp() {
		return "Calloption";
	}

}
