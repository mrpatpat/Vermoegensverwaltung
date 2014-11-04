package com.ildbc.vermoegensabteilung.vermoegensverwaltung.vermoegensgegenstaende.aktien;
import com.ildbc.vermoegensabteilung.vermoegensverwaltung.vermoegensgegenstaende.Handelbar;
import com.ildbc.vermoegensabteilung.vermoegensverwaltung.vermoegensgegenstaende.Vermoegensgegenstand;

public class Aktie extends Vermoegensgegenstand implements Handelbar {

	private long kurs;

	public Aktie() {
	}

	public void verkaufen() {
	}

	public long getZeitwert(int zeit) {
		return 0L;
	}

	public int getAnzahl() {
		return 0;
	}

	public String getName() {
		return "";
	}

	public long getKurs() {
		return 0L;
	}

	public String getTyp() {
		return "";
	}

	public void kaufen() {
	}

}
