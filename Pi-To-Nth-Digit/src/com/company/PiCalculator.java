package com.company;

import java.math.BigDecimal;

/**
 * Created by JoaoPaulo on 19-Apr-17.
 */
public class PiCalculator {

	public Double getPi(long iterations) {
		double pi = 1.0;
		int flag = 1;


		for (double i = 3.0; i < iterations; i += 2.0) {
			if (flag % 2 == 0) {
				pi += 1/i;
			} else {
				pi -= 1/i;
			}
			flag++;
		}
		pi *= 4;

		return pi;
	}

	public Double getPiNilakantha(long iterations) {
		double pi = 3.0;
		int flag = 1;
		long firstDenominator = 2;
		long secondDenominator = 3;
		long thirdDenominator = 4;

		for (int i = 1; i < iterations; i++) {
			if (flag % 2 == 1) {
				pi += (double) 4 /(firstDenominator *
								   secondDenominator *
								   thirdDenominator);
			} else {
				pi -= (double) 4 /(firstDenominator *
						secondDenominator *
						thirdDenominator);
			}
			flag++;
			firstDenominator+=2;
			secondDenominator+=2;
			thirdDenominator+=2;
		}

		return pi;
	}

}
