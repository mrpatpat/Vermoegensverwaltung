package com.ildbc.vermoegensabteilung.vermoegensverwaltung.test;
import static org.junit.Assert.*;

import org.junit.Test;

import com.ildbc.vermoegensabteilung.vermoegensverwaltung.vermoegensgegenstaende.festgelder.Festgeld;


public class FestgeldTest {

	@SuppressWarnings("deprecation")
	@Test
	public void test() {
		Festgeld b = new Festgeld(0, 100000, "Festgeld", 1,20, 2);
		Festgeld c = new Festgeld(0, 200000, "Festgeld", 1,20, 2);
		
		assertEquals(100000, b.getKaufpreis());
		assertEquals(200000, c.getKaufpreis());

		assertEquals("Festgeld", b.getName());
		assertEquals("Festgeld", b.getName());

		assertEquals(1, b.getAnzahl());
		assertEquals(1, c.getAnzahl());
		
		assertEquals(2.0, b.getZins(), 0);
		assertEquals(2.0, c.getZins(), 0);
		
	}

}
