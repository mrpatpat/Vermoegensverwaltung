package com.ildbc.vermoegensabteilung.vermoegensverwaltung;

import java.util.ArrayList;
import java.util.List;

import com.ildbc.vermoegensabteilung.vermoegensverwaltung.portfolio.Portfolio;
import com.ildbc.vermoegensabteilung.vermoegensverwaltung.vermoegensgegenstaende.Vermoegensgegenstand;
import com.ildbc.vermoegensabteilung.vermoegensverwaltung.vermoegensgegenstaende.aktien.Aktie;

public class Simulation {

	public static void main(String[] args) {
		System.out.println("test");
	}

	private static Portfolio createPortfolioA(boolean istKurs1) {
		List<Vermoegensgegenstand> vg = new ArrayList<Vermoegensgegenstand>();
		vg.add(new Aktie(0, 6102, "BASF", 1000, istKurs1 ? 6127 : 8439));
		return new Portfolio(vg);
	}

}
