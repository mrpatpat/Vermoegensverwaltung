package com.ildbc.vermoegensabteilung.vermoegensverwaltung.test;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.ildbc.vermoegensabteilung.vermoegensverwaltung.vermoegensgegenstaende.rentenpapiere.Rentenpapier;


public class RentenpapierTest {

	@Test
	public void test() {
		Rentenpapier b = new Rentenpapier(0, 1000, "Rentenpapiere", 1, 20, 2, 3);
		Rentenpapier c = new Rentenpapier(0, 2000, "Rentenpapiere", 1, 20, 2, 3);
		
		assertEquals(1000, b.getKaufpreis());
		assertEquals(2000, c.getKaufpreis());

		assertEquals("Rentenpapiere", b.getName());
		assertEquals("Rentenpapiere", b.getName());

		assertEquals(1, b.getAnzahl());
		assertEquals(1, c.getAnzahl());
	}

}
