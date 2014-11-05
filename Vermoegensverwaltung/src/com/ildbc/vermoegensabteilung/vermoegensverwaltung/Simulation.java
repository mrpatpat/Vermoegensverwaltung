package com.ildbc.vermoegensabteilung.vermoegensverwaltung;

import java.util.ArrayList;
import java.util.List;

import com.ildbc.vermoegensabteilung.vermoegensverwaltung.vermoegensgegenstaende.aktien.Aktie;
import com.ildbc.vermoegensabteilung.vermoegensverwaltung.vermoegensgegenstaende.festgelder.Festgeld;
import com.ildbc.vermoegensabteilung.vermoegensverwaltung.vermoegensgegenstaende.fonds.Aktienfonds;
import com.ildbc.vermoegensabteilung.vermoegensverwaltung.vermoegensgegenstaende.immobilien.Immobilie;
import com.ildbc.vermoegensabteilung.vermoegensverwaltung.vermoegensgegenstaende.immobilien.ImmobilieExistiertException;
import com.ildbc.vermoegensabteilung.vermoegensverwaltung.vermoegensgegenstaende.rentenpapiere.Rentenpapier;

public class Simulation {

	private static final long[][] aktienDefinitionen = { { 11110, 12030 },
			{ 6127, 8439 }, { 8824, 8267 }, { 9678, 9513 }, { 4993, 4512 },
			{ 5867, 5756 }, { 11550, 12050 } };

	private static final String[] aktienNamen = { "Muenchener Rueck", "BASF",
			"MAN", "SIEMENS", "DAIMLER", "BMW", "VOLKSWAGEN" };

	public static void main(String[] args) {
		System.out.println("test");
	}

	private static final Immobilie createSchlossAllee(int kaufdatum)
			throws ImmobilieExistiertException {
		return new Immobilie(kaufdatum, 1000000, "Schlossallee 4, Heidelberg",
				20);
	}

	private static Festgeld createSparkassenAnlage(int kaufdatum,
			long kaufpreis, int anzahl, long kurs) {
		return new Festgeld(kaufdatum, kaufpreis, "Sparkasse Mannheim", anzahl,
				3, 2.0d);
	}

	private static Rentenpapier createBundesschatzbrief(int kaufdatum,
			long kaufpreis, int anzahl, long kurs) {
		return new Rentenpapier(kaufdatum, kaufpreis, "Bundesschatzbrief",
				anzahl, 10, 1.5d, kurs);
	}

	private static Aktienfonds createAutofonds() {
		List<Aktie> liste = new ArrayList<Aktie>();

		liste.add(createAktie(4, 0, 500, 4, true));
		liste.add(createAktie(4, 0, 500, 4, false));

		liste.add(createAktie(3, 0, 500, 5, true));
		liste.add(createAktie(3, 0, 500, 5, false));

		liste.add(createAktie(5, 0, 500, 6, true));
		liste.add(createAktie(5, 0, 500, 6, false));

		return new Aktienfonds(0, 500, "Autofonds", 1, liste);
	}

	private static Aktienfonds createIndexFonds() {
		List<Aktie> liste = new ArrayList<Aktie>();
		for (int i = 0; i < aktienNamen.length; i++) {
			liste.add(createAktie(1, 0, 500, i, true));
			liste.add(createAktie(1, 0, 500, i, false));
		}
		return new Aktienfonds(0, 500, "Indexfonds", 1, liste);
	}

	private static Aktie createAktie(int anzahl, int kaufdatum, int kaufpreis,
			int aktienName, boolean nutzeKurs1) {
		return new Aktie(kaufdatum, kaufpreis, aktienNamen[aktienName], anzahl,
				aktienDefinitionen[aktienName][nutzeKurs1 ? 0 : 1]);
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
