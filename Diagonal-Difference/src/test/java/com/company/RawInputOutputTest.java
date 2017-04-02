package com.company;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Scanner;

import static org.junit.Assert.*;

/**
 * Created by jpknox on 27/03/17.
 */
public class RawInputOutputTest {

	private Scanner scan;
	private static RawInputOutput rawInputOutput;
	private int val;

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
		scan = null;
		val = -1;
	}

	@Test
	public void testGetRawInput() throws Exception {
		int[] legalValues = new int[] {11, 2, 4, 4, 5, 6, 10, 8, -12};
		scan = new Scanner(rawInputOutput.getRawInput());
		int numberOfIntegers = scan.nextInt();
		assertEquals(3, numberOfIntegers);
		for (int i = 0; i < numberOfIntegers * numberOfIntegers; i++) {
			val = scan.nextInt();
			assertEquals(val, legalValues[i]);
		}
	}

	@Test
	public void testGetRawOutput() throws Exception {
		scan = new Scanner(rawInputOutput.getRawOutput());
		val = scan.nextInt();
		assertEquals(15, val);
	}

}