package com.ildbc.vermoegensabteilung.vermoegensverwaltung.vermoegensgegenstaende.optionen;

import com.ildbc.vermoegensabteilung.vermoegensverwaltung.vermoegensgegenstaende.aktien.Aktie;

public class Calloption extends Option {

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
