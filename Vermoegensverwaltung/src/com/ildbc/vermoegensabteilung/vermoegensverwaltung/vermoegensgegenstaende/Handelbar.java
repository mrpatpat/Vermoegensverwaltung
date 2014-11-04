package com.ildbc.vermoegensabteilung.vermoegensverwaltung.vermoegensgegenstaende;

public interface Handelbar {
	
	public void setKurs(long kurs);
	
	public long getKurs();

	public void kaufen();

	public void verkaufen();

}
