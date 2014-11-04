package com.ildbc.vermoegensabteilung.vermoegensverwaltung.vermoegensgegenstaende.rentenpapiere;

import com.ildbc.vermoegensabteilung.vermoegensverwaltung.vermoegensgegenstaende.festgelder.Festgeld;
import com.ildbc.vermoegensabteilung.vermoegensverwaltung.portfolio.Portfolio;
import com.ildbc.vermoegensabteilung.vermoegensverwaltung.vermoegensgegenstaende.Handelbar;

public class Rentenpapier extends Festgeld implements Handelbar {

	public Portfolio portfolio;

	private long kurs;

	public Rentenpapier() {
		super();
	}

	public long getZeitwert(int zeit) {
		return 0L;
	}

	public int getAnzahl() {
		return 0;
	}

	public long getKurs() {
		return 0L;
	}

	public void verkaufen() {
	}

	public String getName() {
		return "";
	}

	public void kaufen() {
	}

	public String getTyp() {
		return "";
	}

}
