package com.ildbc.vermoegensabteilung.vermoegensverwaltung.vermoegensgegenstaende;
import com.ildbc.vermoegensabteilung.vermoegensverwaltung.portfolio.PortfolioPosition;
import com.ildbc.vermoegensabteilung.vermoegensverwaltung.portfolio.Portfolio;

abstract class Vermoegensgegenstand implements PortfolioPosition
{
	
	private final int kaufdatum = 0;
	
	private final long kaufpreis = 0L;
	
	private final String name = "";
	
	public int anzahl;

	public Vermoegensgegenstand(){
	}

	
	public int getKaufdatum() {
		return 0;	
	}
	
	public long getKaufpreis() {
		return 0L;	
	}
	
	public String getName() {
		return "";	
	}
	
	public abstract long getZeitwert(int datum) ;
	
	public int getAnzahl() {
		return 0;	
	}
	
	public abstract String getTyp() ;
	
	
	public String getName() {
		return "";	
	}
	
	public String getTyp() {
		return "";	
	}
	
	public long getZeitwert(int zeit) {
		return 0L;	
	}
	
	public int getAnzahl() {
		return 0;	
	}
	
}

