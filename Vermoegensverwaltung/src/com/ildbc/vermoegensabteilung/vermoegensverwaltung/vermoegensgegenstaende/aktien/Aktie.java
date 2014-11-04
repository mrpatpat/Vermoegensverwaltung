package com.ildbc.vermoegensabteilung.vermoegensverwaltung.vermoegensgegenstaende.aktien;
import com.ildbc.vermoegensabteilung.vermoegensverwaltung.vermoegensgegenstaende.Handelbar;
import com.ildbc.vermoegensabteilung.vermoegensverwaltung.vermoegensgegenstaende.Vermoegensgegenstand;

public class Aktie extends Vermoegensgegenstand implements Handelbar {

	private long kurs;

	public Aktie(int kaufdatum, long kaufpreis, String name, int anzahl,long kurs) {
		super(kaufdatum,kaufpreis,name,anzahl);
		this.kurs = kurs;
	}
	
	public void setKurs(long kurs){
		this.kurs = kurs;
	}

	public long getZeitwert(int zeit) {
		return getKurs();
	}

	public long getKurs() {
		return kurs;
	}

	@Override
	public String getTyp() {
		return "Aktie";
	}

	public void verkaufen() {
		//nicht angegeben, aber gefordert
	}

	public void kaufen() {
		//nicht angegeben, aber gefordert
	}


}
