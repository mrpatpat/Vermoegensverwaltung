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

	}
	
	private static final Immobilie createSchlossAllee(int kaufdatum) throws ImmobilieExistiertException {
		return new Immobilie(kaufdatum, 1000000, "Schlossallee 4, Heidelberg", 20);
	}
	
	private static Festgeld createSparkassenAnlage(int kaufdatum, long kaufpreis, int anzahl, long kurs){
		return new Festgeld(kaufdatum, kaufpreis,"Sparkasse Mannheim", anzahl, 3, 2.0d);
	}
	
	private static Rentenpapier createBundesschatzbrief(int kaufdatum, long kaufpreis, int anzahl, long kurs){
		return new Rentenpapier(kaufdatum, kaufpreis,"Bundesschatzbrief", anzahl, 10, 1.5d , kurs);
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

}
