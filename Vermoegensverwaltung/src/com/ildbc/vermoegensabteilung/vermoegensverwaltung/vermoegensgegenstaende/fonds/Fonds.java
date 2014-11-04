package com.ildbc.vermoegensabteilung.vermoegensverwaltung.vermoegensgegenstaende.fonds;
import java.util.List;

import com.ildbc.vermoegensabteilung.vermoegensverwaltung.vermoegensgegenstaende.Vermoegensgegenstand;


abstract class Fonds extends Vermoegensgegenstand
{

	
	public List<Vermoegensgegenstand> vermoegensgegenstaende;

	public Fonds(){
		super();
	}

}

