package com.company;

import java.util.Scanner;

// https://www.hackerrank.com/challenges/diagonal-difference

public class Main {

	private static RawInputOutput rawInputOutput;
	private static matrixDisplay matrixDisplay;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(rawInputOutput.getRawInput());
		int numOfInts = scanner.nextInt();
		int[] matrix = new int[numOfInts*numOfInts];
		int i = 0;
		while (scanner.hasNext()) {
			matrix[i++] = scanner.nextInt();
		}

		matrixDisplay.displayMatrix(matrix);
	}
}
