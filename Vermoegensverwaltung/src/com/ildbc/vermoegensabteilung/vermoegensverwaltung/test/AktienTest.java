package com.ildbc.vermoegensabteilung.vermoegensverwaltung.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.ildbc.vermoegensabteilung.vermoegensverwaltung.vermoegensgegenstaende.aktien.Aktie;

public class AktienTest {

	@Test
	public void testAktie() {
		Aktie b = new Aktie(0, 6000, "Basf", 10000, 500);
		Aktie c = new Aktie(0, 5000, "MAN", 20000, 400);

		assertEquals(6000, b.getKaufpreis());
		assertEquals(5000, c.getKaufpreis());

		assertEquals("Basf", b.getName());
		assertEquals("MAN", b.getName());

		assertEquals(10000, b.getAnzahl());
		assertEquals(20000, c.getAnzahl());

	}

}
