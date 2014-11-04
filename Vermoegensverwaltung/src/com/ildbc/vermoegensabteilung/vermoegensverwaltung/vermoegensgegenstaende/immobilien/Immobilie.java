package com.ildbc.vermoegensabteilung.vermoegensverwaltung.vermoegensgegenstaende.immobilien;

import java.util.ArrayList;
import java.util.List;

import com.ildbc.vermoegensabteilung.vermoegensverwaltung.vermoegensgegenstaende.Vermoegensgegenstand;

public class Immobilie extends Vermoegensgegenstand {

	private static final int MAX_ANZAHL_INSTANZEN = 1;

	private static List<String> existierendeImmobilien;

	private int abschreibungsdauer;

	public Immobilie(int kaufdatum, long kaufpreis, String name) throws ImmobilieExistiertException {
		super(kaufdatum, kaufpreis, name, Immobilie.MAX_ANZAHL_INSTANZEN);
		
		if(Immobilie.immobilieExistiert(name)){
			throw new ImmobilieExistiertException();
		} else {
			Immobilie.addImmobilie(name);
		}
		
	}

	@Override
	public String getTyp() {
		return "Immobilie";
	}

	@Override
	public long getZeitwert(int datum) {
		return getKaufpreis() - (getKaufpreis()/abschreibungsdauer) * (datum - getKaufdatum());
	}

	private static void addImmobilie(String name){
		listeInitilisieren();
		existierendeImmobilien.add(name);
	}

	private static boolean immobilieExistiert(String name) {
		listeInitilisieren();
		for (String s : existierendeImmobilien) {
			if (s.equals(name))
				return true;
		}
		return false;
	}

	private static void listeInitilisieren() {
		if(existierendeImmobilien == null){
			existierendeImmobilien = new ArrayList<String>();
		}
	}

}
