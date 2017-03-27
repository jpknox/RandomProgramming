package com.company;

/**
 * Created by jpknox on 27/03/17.
 */
public class matrixDisplay {

	public static void displayMatrix(int[] matrix) {
		System.out.printf("\nLength: %d\n", matrix.length);
		int lengthOfSide = (int) Math.sqrt(matrix.length);

		int index = 0;
		for (int row = 0; row < lengthOfSide; row++) {
			for (int column = 0; column < lengthOfSide; column++) {
				System.out.printf("%d", matrix[index++]);
				if (column < lengthOfSide-1) System.out.printf(",\t");
			}
			System.out.printf("\n");
		}

		StringBuilder stringBuilder = new StringBuilder();
		for (index = 0; index < matrix.length; index++) {
			stringBuilder.append(matrix[index]);
			if (index % lengthOfSide < 2) stringBuilder.append(",\t");
			if (index % lengthOfSide == 2) stringBuilder.append("\n");
		}
		System.out.printf("%s", stringBuilder.toString());
	}
}
