package com.ildbc.vermoegensabteilung.vermoegensverwaltung.vermoegensgegenstaende.optionen;

import com.ildbc.vermoegensabteilung.vermoegensverwaltung.vermoegensgegenstaende.Vermoegensgegenstand;
import com.ildbc.vermoegensabteilung.vermoegensverwaltung.vermoegensgegenstaende.aktien.Aktie;

/**
 * Option wird als abstrakte Klasse erstellt
 * erbt von Vermoegensgegenstand
 * 
 * @author Adrian, Marcel und Felix
 *
 *date 5.11.2014
 */

abstract class Option extends Vermoegensgegenstand {

	private final int startdatum;

	private final int dauer;

	private final long ausuebungspreis;

	public final Aktie basiswert;

	public Option(int kaufdatum, long kaufpreis, String name, int anzahl, int startdatum, int dauer, int ausuebungspreis, Aktie basiswert) {
		super(kaufdatum, kaufpreis, name, anzahl);
		this.startdatum = startdatum;
		this.dauer = dauer;
		this.ausuebungspreis = ausuebungspreis;
		this.basiswert = basiswert;

	}

	public int getStartdatum() {
		return startdatum;
	}

	public int getDauer() {
		return dauer;
	}

	public long getAusuebungspreis() {
		return ausuebungspreis;
	}

	public Aktie getBasiswert() {
		return basiswert;
	}

	@Override
	public long getZeitwert(int datum) {
		
		if(datum-startdatum<=0){
			return 0;
		} else if (datum-(startdatum+dauer)>=0){
			return 0;
		} else {
			return getZeitwertInAusuebungsphase();
		}
	}
	
	abstract long getZeitwertInAusuebungsphase();

}
