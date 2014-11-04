package com.ildbc.vermoegensabteilung.vermoegensverwaltung.vermoegensgegenstaende.immobilien;
import com.ildbc.vermoegensabteilung.vermoegensverwaltung.vermoegensgegenstaende.Vermoegensgegenstand;

public class Immobilie extends Vermoegensgegenstand
{

	
	private int abschreibungsdauer;
	
	public Immobilie(){
		super();
	}

	@Override
	public String getTyp() {
		return null;
	}

	@Override
	public long getZeitwert(int datum) {
		return 0;
	}

}

