package com.company.piDisplay;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

/**
 * Created by JoaoPaulo on 22-Apr-17.
 */
public class PiDisplayTest {

	private PiDisplay piDisplay;

	@Before
	public void setUp() {
		piDisplay = new PiDisplay();
	}

	@After
	public void tearDown() {
		piDisplay = null;
	}

	@Test
	public void testGetComparablePiShort() {
		BigDecimal piBigDecimal = new BigDecimal("3.141").setScale(3, BigDecimal.ROUND_HALF_UP);

		String piString = "3.141";
		assertEquals(piString, piDisplay.getComparablePi(piBigDecimal));
	}

	@Test
	public void testGetComparablePiMedium() {
		BigDecimal piBigDecimal = new BigDecimal("3.141592653589793").setScale(15, BigDecimal.ROUND_HALF_UP);
		String piString = "3.141592653589793";
		assertEquals(piString, piDisplay.getComparablePi(piBigDecimal));
	}

	@Test
	public void testGetComparablePiLong() {
		BigDecimal piBigDecimal = new BigDecimal("3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679")
				.setScale(100, BigDecimal.ROUND_HALF_UP);
		String piString = "3.14159265358979323846264338327950288419716939937510" +
				"58209749445923078164062862089986280348253421170679";
		assertEquals(piString, piDisplay.getComparablePi(piBigDecimal));
	}

	@Test
	public void testGetCorrectPiCharacters() {
		BigDecimal piBigDecimal = new BigDecimal("3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679");
		int length = piBigDecimal.toString().toCharArray().length;
		String stringPi = piDisplay.getCorrectPiCharacters(piBigDecimal);
		assertEquals(length, stringPi.length());
		assertEquals(piBigDecimal.toString(), stringPi);
	}


}