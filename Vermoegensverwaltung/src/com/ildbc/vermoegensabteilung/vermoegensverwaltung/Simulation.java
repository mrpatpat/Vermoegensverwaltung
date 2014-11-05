package com.ildbc.vermoegensabteilung.vermoegensverwaltung;

import java.util.ArrayList;
import java.util.List;

import com.ildbc.vermoegensabteilung.vermoegensverwaltung.portfolio.Portfolio;
import com.ildbc.vermoegensabteilung.vermoegensverwaltung.vermoegensgegenstaende.Vermoegensgegenstand;
import com.ildbc.vermoegensabteilung.vermoegensverwaltung.vermoegensgegenstaende.aktien.Aktie;
import com.ildbc.vermoegensabteilung.vermoegensverwaltung.vermoegensgegenstaende.festgelder.Festgeld;
import com.ildbc.vermoegensabteilung.vermoegensverwaltung.vermoegensgegenstaende.immobilien.Immobilie;
import com.ildbc.vermoegensabteilung.vermoegensverwaltung.vermoegensgegenstaende.immobilien.ImmobilieExistiertException;

public class Simulation {

	public static void main(String[] args) {
		System.out.println("test");
	}

	private static Portfolio createPortfolioA(boolean istKurs1) {
		List<Vermoegensgegenstand> vg = new ArrayList<Vermoegensgegenstand>();
		vg.add(new Aktie(0, 6102, "BASF", 1000, istKurs1 ? 6127 : 8439));
		return new Portfolio(vg);
	}
	
	//optionen
	private static final Aktie basfCall = new Aktie(0, 6000,"Basf" , 1, 500);
	private static final Aktie daimlerPut = new Aktie(0, 4700, "Daimler", 1, 300);
	private static final Aktie manCall = new Aktie(0, 8800, "MAN", 1, 100);
	private static final Aktie manPut = new Aktie(0, 8500, "MAN", 1, 200);
	
	//Portfolio1
	private static final Aktie basf = new Aktie(0, 6102, "Basf", 1000, 500);
	private static final Aktie man = new Aktie(0, 8925, "MAN", 240, 300);
	//Fonds
	private static final Aktie fond = new Aktie(0, 58149, "DAX", 300, 100);
	//Villa
	private static final Immobilie Villa1(int kaufdatum)
			throws ImmobilieExistiertException {
		return new Immobilie(kaufdatum, 1000000, "Villa 1",
				20);}
	//Festgeld
	private static final Festgeld festgeld = new Festgeld(0, 100000, "Festgeld", 1,20, 2);
	//Optionen
	private static final Aktie basfCallOption = new Aktie(0, 6000, "Basf", 10000, 500);
	private static final Aktie manCallOption = new Aktie(0, 8800, "MAN", 5000, 100);
	private static final Aktie manPutOption = new Aktie(0, 8500, "MAN", 5000, 200);
	private static final Aktie daimlerPutOption = new Aktie(0, 4700, "MAN", 5000, 300);
	

}
