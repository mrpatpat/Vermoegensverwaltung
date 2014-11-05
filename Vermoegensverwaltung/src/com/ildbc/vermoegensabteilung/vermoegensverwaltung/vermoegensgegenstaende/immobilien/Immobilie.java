package com.ildbc.vermoegensabteilung.vermoegensverwaltung.vermoegensgegenstaende.immobilien;

import java.util.ArrayList;
import java.util.List;

import com.ildbc.vermoegensabteilung.vermoegensverwaltung.vermoegensgegenstaende.Vermoegensgegenstand;

/**
 * Klasse Immobilien erbt von Vermoegensgegenstand
 * mit einer statischen Liste wird eine Liste generiet
 * dadurch kann man nur eine spezifische Immobilie 
 * es gibt keine doppelt
 * 
 * @author Adrian, Marcel und Felix
 *
 *date 5.11.2014
 */

public class Immobilie extends Vermoegensgegenstand {

	private static final int MAX_ANZAHL_INSTANZEN = 1;

	private static List<String> existierendeImmobilien;

	private int abschreibungsdauer;
	
	/**
	 * Konstukteur fuer Immobilie
	 * 
	 * @param kaufdatum
	 * @param kaufpreis
	 * @param name
	 * @param abschreibungsdauer
	 * @throws ImmobilieExistiertException
	 */

	public Immobilie(int kaufdatum, long kaufpreis, String name, int abschreibungsdauer) throws ImmobilieExistiertException {
		super(kaufdatum, kaufpreis, name, Immobilie.MAX_ANZAHL_INSTANZEN);
		
		if(Immobilie.immobilieExistiert(name)){
			throw new ImmobilieExistiertException();
		} else {
			Immobilie.addImmobilie(name);
			this.abschreibungsdauer = abschreibungsdauer;
		}
		
	}
	
	/**
	 * Typ wird angegeben
	 */

	@Override
	public String getTyp() {
		return "Immobilie";
	}
	
	/**
	 * Zeitwert der Immobilie ist begrentz und sinkt irgendwann auf 0
	 */

	@Override
	public long getZeitwert(int datum) {
		return getKaufpreis() - (getKaufpreis()/abschreibungsdauer) * (datum - getKaufdatum());
	}

	/**
	 * Immobilien Name wird zur Liste dazu gegeben statisch
	 * 
	 * und List wird auch auch geprueft auf leere
	 * 
	 * @param name
	 */
	
	private static void addImmobilie(String name){
		listeInitilisieren();
		existierendeImmobilien.add(name);
	}
	
	public static void clear(){
		existierendeImmobilien = new ArrayList<String>();
	}
	
	/**
	 * Pruefung ob die Immobilie nur einaml vorhanden ist
	 * 
	 * @param name
	 * @return boolean
	 */

	private static boolean immobilieExistiert(String name) {
		listeInitilisieren();
		for (String s : existierendeImmobilien) {
			if (s.equals(name))
				return true;
		}
		return false;
	}
	
	/**
	 * falls die Liste leer ist wird sie initialisiert
	 */

	private static void listeInitilisieren() {
		if(existierendeImmobilien == null){
			existierendeImmobilien = new ArrayList<String>();
		}
	}

}
