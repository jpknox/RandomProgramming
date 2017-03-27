package com.company;

/**
 * Created by jpknox on 27/03/17.
 */
public class matrixDisplay {

	public static void displayMatrix(int[] matrix) {
		int lengthOfSide = (int) Math.sqrt(matrix.length);

		StringBuilder stringBuilder = new StringBuilder();
		for (int index = 0; index < matrix.length; index++) {
			stringBuilder.append(matrix[index]);
			if (index % lengthOfSide < 2) stringBuilder.append(",\t");
			if (index % lengthOfSide == 2) stringBuilder.append("\n");
		}
		System.out.printf("%s", stringBuilder.toString());
	}
}
