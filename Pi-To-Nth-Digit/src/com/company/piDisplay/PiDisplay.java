package com.company.piDisplay;

import java.math.BigDecimal;

/**
 * Created by JoaoPaulo on 22-Apr-17.
 */
public class PiDisplay {

	private static String concretePi = "3.14159265358979323846264338327950288419716939937510" +
			"58209749445923078164062862089986280348253421170679" +
			"82148086513282306647093844609550582231725359408128" +
			"48111745028410270193852110555964462294895493038196" +
			"44288109756659334461284756482337867831652712019091" +
			"45648566923460348610454326648213393607260249141273" +
			"72458700660631558817488152092096282925409171536436" +
			"78925903600113305305488204665213841469519415116094" +
			"33057270365759591953092186117381932611793105118548" +
			"07446237996274956735188575272489122793818301194912" +
			"98336733624406566430860213949463952247371907021798" +
			"60943702770539217176293176752384674818467669405132" +
			"00056812714526356082778577134275778960917363717872" +
			"14684409012249534301465495853710507922796892589235" +
			"42019956112129021960864034418159813629774771309960" +
			"51870721134999999837297804995105973173281609631859" +
			"50244594553469083026425223082533446850352619311881" +
			"71010003137838752886587533208381420617177669147303" +
			"59825349042875546873115956286388235378759375195778" +
			"18577805321712268066130019278766111959092164201989";

	public void displayPi(BigDecimal pi) {
		System.out.println(String.format("Result of algorithm:\t%s", pi.toString()));
		System.out.println(String.format("Accuracy:\t\t\t\t%s",  getCorrectPiCharacters(pi)));
		System.out.println(String.format("Comparable chars:\t\t%s",  getComparablePi(pi)));
	}

	public String getComparablePi(BigDecimal calculatedPi) {
		int length = calculatedPi.toString().length();

		char[] concretePiChars = concretePi.toCharArray();
		StringBuilder shortConcretePi = new StringBuilder();
		for (int i = 0; i < length; i++) {
			shortConcretePi.append(concretePiChars[i]);
		}

		return shortConcretePi.toString();
	}

	public String getCorrectPiCharacters(BigDecimal inaccuratePi) {
		char[] inaccuratePiChars = inaccuratePi.toString().toCharArray();
		int length = inaccuratePiChars.length;
		char[] concretePiChars = concretePi.toCharArray();

		StringBuilder stringBuilder = new StringBuilder();
		for (int i = 0; i < length; i++) {
			if (inaccuratePiChars[i] == concretePiChars[i]) {
				stringBuilder.append(inaccuratePiChars[i]);
			} else {
				break;
			}
		}

		return stringBuilder.toString();
	}



}
