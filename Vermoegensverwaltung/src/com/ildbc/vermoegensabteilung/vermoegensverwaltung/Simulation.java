package com.ildbc.vermoegensabteilung.vermoegensverwaltung;

import java.util.ArrayList;
import java.util.List;

import com.ildbc.vermoegensabteilung.vermoegensverwaltung.portfolio.Portfolio;
import com.ildbc.vermoegensabteilung.vermoegensverwaltung.vermoegensgegenstaende.Vermoegensgegenstand;
import com.ildbc.vermoegensabteilung.vermoegensverwaltung.vermoegensgegenstaende.aktien.Aktie;
import com.ildbc.vermoegensabteilung.vermoegensverwaltung.vermoegensgegenstaende.festgelder.Festgeld;
import com.ildbc.vermoegensabteilung.vermoegensverwaltung.vermoegensgegenstaende.fonds.Aktienfonds;
import com.ildbc.vermoegensabteilung.vermoegensverwaltung.vermoegensgegenstaende.immobilien.Immobilie;
import com.ildbc.vermoegensabteilung.vermoegensverwaltung.vermoegensgegenstaende.immobilien.ImmobilieExistiertException;
import com.ildbc.vermoegensabteilung.vermoegensverwaltung.vermoegensgegenstaende.optionen.Calloption;
import com.ildbc.vermoegensabteilung.vermoegensverwaltung.vermoegensgegenstaende.optionen.Putoption;
import com.ildbc.vermoegensabteilung.vermoegensverwaltung.vermoegensgegenstaende.rentenpapiere.Rentenpapier;

public class Simulation {

	public static void main(String[] args) {
		

		System.out.println(printPortfolio(createPortfolioA(true),"Portfolio 1 - Jahr 0 ",0));
		Immobilie.clear();
		System.out.println(printPortfolio(createPortfolioA(false),"Portfolio 1 - Jahr 1 ",1));
		Immobilie.clear();
		System.out.println(printPortfolio(createPortfolioB(true),"Portfolio 2 - Jahr 0 ",0));
		Immobilie.clear();
		System.out.println(printPortfolio(createPortfolioB(false),"Portfolio 2 - Jahr 1 ",1));
		Immobilie.clear();
		
	}

	private static String printPortfolio(Portfolio A,String name,int zeitwert){
		String s = new String ("");
		s+=name + " - Kaufwert: " + A.getGesamtinvestition() + " - Zeitwert: " + A.getZeitwert(zeitwert);				
		return s;
	}
	

	private static Portfolio createPortfolioA(boolean istKurs1) {

		List<Vermoegensgegenstand> vg = new ArrayList<Vermoegensgegenstand>();

		vg.add(new Aktie(0, 6102, "BASF", 1000, istKurs1 ? 6127 : 8439));
		vg.add(new Aktie(0, 8925, "MAN", 240, istKurs1 ? 8824 : 8267));

		List<Aktie> dax = new ArrayList<Aktie>();
		dax.add(new Aktie(0, 11500, "Münchener Rück", 1, istKurs1 ? 11110
				: 12030));
		dax.add(new Aktie(0, 6102, "BASF", 1, istKurs1 ? 6127 : 8439));
		dax.add(new Aktie(0, 8925, "MAN", 1, istKurs1 ? 8824 : 8267));
		dax.add(new Aktie(0, 9710, "Siemens", 1, istKurs1 ? 9678 : 9513));
		dax.add(new Aktie(0, 4500, "Daimler", 1, istKurs1 ? 4993 : 4512));
		dax.add(new Aktie(0, 5800, "BMW", 1, istKurs1 ? 5867 : 5756));
		dax.add(new Aktie(0, 11032, "Volkswagen", 1, istKurs1 ? 11550 : 12050));
		Aktienfonds indexFonds = new Aktienfonds(0, 58149, "DAX", 300, dax);

		vg.add(indexFonds);

		try {
			vg.add(new Immobilie(0, 100000000, "Villa", 20));
		} catch (ImmobilieExistiertException e) {
			e.printStackTrace();
		}

		vg.add(new Festgeld(0, 10000000, "Sparkasse", 1, 3, 2.0));

		Aktie a = new Aktie(0, 6102, "BASF", 1, istKurs1 ? 6127 : 8439);
		vg.add(new Calloption(0, 500, "Call BASF", 10000, 0, 10, 6000, a));

		a = new Aktie(0, 8925, "MAN", 1, istKurs1 ? 8824 : 8267);
		vg.add(new Calloption(0, 100, "Call MAN", 5000, 0, 10, 8800, a));

		a = new Aktie(0, 8925, "MAN", 1, istKurs1 ? 8824 : 8267);
		vg.add(new Putoption(0, 200, "Put MAN", 5000, 0, 10, 8500, a));

		a = new Aktie(0, 4500, "Daimler", 1, istKurs1 ? 4993 : 4512);
		vg.add(new Putoption(0, 300, "Put Daimler", 5000, 0, 10, 4700, a));

		return new Portfolio(vg);

	}

	private static Portfolio createPortfolioB(boolean istKurs1) {

		List<Aktie> dax = new ArrayList<Aktie>();
		dax.add(new Aktie(0, 11500, "Münchener Rück", 1, istKurs1 ? 11110
				: 12030));
		dax.add(new Aktie(0, 6102, "BASF", 1, istKurs1 ? 6127 : 8439));
		dax.add(new Aktie(0, 8925, "MAN", 1, istKurs1 ? 8824 : 8267));
		dax.add(new Aktie(0, 9710, "Siemens", 1, istKurs1 ? 9678 : 9513));
		dax.add(new Aktie(0, 4500, "Daimler", 1, istKurs1 ? 4993 : 4512));
		dax.add(new Aktie(0, 5800, "BMW", 1, istKurs1 ? 5867 : 5756));
		dax.add(new Aktie(0, 11032, "Volkswagen", 1, istKurs1 ? 11550 : 12050));

		List<Aktie> automobil = new ArrayList<Aktie>();
		automobil.add(new Aktie(0, 4500, "Daimler", 4, istKurs1 ? 4993 : 4512));
		automobil.add(new Aktie(0, 5800, "BMW", 3, istKurs1 ? 5867 : 5756));
		automobil.add(new Aktie(0, 11032, "Volkswagen", 5, istKurs1 ? 11550
				: 12050));

		List<Vermoegensgegenstand> vg = new ArrayList<Vermoegensgegenstand>();
		vg.add(new Aktie(0, 6102, "BASF", 2000, istKurs1 ? 6127 : 8439));
		vg.add(new Aktie(0, 8925, "MAN", 240, istKurs1 ? 8824 : 8267));
		vg.add(new Aktie(0, 9710, "Siemens", 400, istKurs1 ? 9678 : 9513));
		vg.add(new Aktie(0, 11032, "VW", 600, istKurs1 ? 11550 : 12050));
		vg.add(new Aktienfonds(0, 58149, "DAX", 500, dax));
		vg.add(new Aktienfonds(0, 95000, "Automobil", 200, automobil));
		vg.add(new Rentenpapier(0, 5000000, "Bundes", 1, 10, 1.5, 5200000));
		vg.add(new Festgeld(0, 8000000, "Sparkasse", 1, 3, 2.0));

		return new Portfolio(vg);
	}

}