package com.ildbc.vermoegensabteilung.vermoegensverwaltung.vermoegensgegenstaende.optionen;
import com.ildbc.vermoegensabteilung.vermoegensverwaltung.vermoegensgegenstaende.Vermoegensgegenstand;
import com.ildbc.vermoegensabteilung.vermoegensverwaltung.vermoegensgegenstaende.aktien.Aktie;

class Option extends Vermoegensgegenstand
{

	private int startdatum;
	
	private int dauer;
	
	private long ausuebungspreis;
	
	public Aktie basiswert;

	public Option(){
		super();
	}
	
	public int getStartdatum() {
		return 0;	
	}
	
	public int getDauer() {
		return 0;	
	}
	
	public long getAusuebungspreis() {
		return 0L;	
	}
	
	public Aktie getBasiswert() {
		return null;	
	}

	@Override
	public String getTyp() {
		return null;
	}

	@Override
	public long getZeitwert(int datum) {
		return 0;
	}
	
}

