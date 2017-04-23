package com.company.piCalculators.equations;

import com.company.piCalculators.piGenerator;

import java.math.BigDecimal;

/**
 * Created by JoaoPaulo on 22-Apr-17.
 */
public class GregoryLeibnizEquation implements piGenerator {

	@Override
	public BigDecimal generatePi(long iterations) {
		System.out.println("Inside Gregory's algorithm.");
		BigDecimal pi = new BigDecimal(1.0);
		int flag = 1;


		for (double i = 3.0; i < iterations; i += 2.0) {
			if (flag % 2 == 0) {
				pi = pi.add(new BigDecimal(1/i));
			} else {
				pi = pi.subtract(new BigDecimal(1/i));
			}
			flag++;
		}
		pi = pi.multiply(new BigDecimal(4));

		return pi;
	}
}
