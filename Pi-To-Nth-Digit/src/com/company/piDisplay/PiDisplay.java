package com.company.piDisplay;

import java.math.BigDecimal;

/**
 * Created by JoaoPaulo on 22-Apr-17.
 */
public class PiDisplay {

	private static String concretePi = "3.14159265358979323846264338327950288419716939937510" +
			"58209749445923078164062862089986280348253421170679";

	public void displayPi(BigDecimal pi) {
		System.out.println(String.format("Calculation:\t%s", pi.toString()));
		System.out.println(String.format("Concrete:\t%s", getComparablePi(pi)));
	}

	public String getComparablePi(BigDecimal calculatedPi) {
		String calculatedPiString = calculatedPi.toString();
		int length = calculatedPiString.length();

		char[] concretePiChars = concretePi.toCharArray();
		StringBuilder shortConcretePi = new StringBuilder();
		for (int i = 0; i < length; i++) {
			shortConcretePi.append(concretePiChars[i]);
		}

		return shortConcretePi.toString();
	}



}
