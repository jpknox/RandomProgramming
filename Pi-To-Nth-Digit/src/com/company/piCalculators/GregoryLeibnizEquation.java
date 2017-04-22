package com.company.piCalculators;

import java.math.BigDecimal;

/**
 * Created by JoaoPaulo on 22-Apr-17.
 */
public class GregoryLeibnizEquation implements piGenerator {

	@Override
	public BigDecimal generatePi(long iterations) {
		BigDecimal pi = new BigDecimal(1.0);
		int flag = 1;


		for (double i = 3.0; i < iterations; i += 2.0) {
			if (flag % 2 == 0) {
				pi.add(new BigDecimal(1/i));
			} else {
				pi.subtract(new BigDecimal(1/i));
			}
			flag++;
		}
		pi.multiply(new BigDecimal(4));

		return pi;
	}
}
