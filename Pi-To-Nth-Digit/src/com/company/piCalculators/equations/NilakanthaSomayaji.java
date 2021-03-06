package com.company.piCalculators.equations;

import com.company.piCalculators.piGenerator;

import java.math.BigDecimal;

/**
 * Created by JoaoPaulo on 22-Apr-17.
 */
public class NilakanthaSomayaji implements piGenerator {

	@Override
	public BigDecimal generatePi(long iterations) {
		System.out.println("Inside Nilakantha's algorithm.");
		BigDecimal pi = new BigDecimal("3.0");
		int flag = 1;
		long firstDenominator = 2;
		long secondDenominator = 3;
		long thirdDenominator = 4;

		for (int i = 1; i < iterations; i++) {
			if (flag % 2 == 1) {
				pi = pi.add(
						new BigDecimal(
							(double) 4 /(firstDenominator *
											secondDenominator *
											thirdDenominator)
						)
				);
			} else {
				pi = pi.subtract(
						new BigDecimal(
								(double) 4 /(firstDenominator *
										secondDenominator *
										thirdDenominator)
						)
				);
			}
			flag++;
			firstDenominator+=2;
			secondDenominator+=2;
			thirdDenominator+=2;
		}

		return pi;
	}
}
