package com.company.piCalculators;

import java.math.BigDecimal;

/**
 * Created by JoaoPaulo on 19-Apr-17.
 */
public class PiCalculator {

	private piGenerator algorithm;
	private long iterations;


	public PiCalculator() {
		this.algorithm = new GregoryLeibnizEquation();
		this.iterations = 1000;
	}

	public void setAlgorithm(piGenerator algorithm) {
		this.algorithm = algorithm;
	}

	public void setIterations(long iterations) {
		this.iterations = iterations;
	}

	public BigDecimal calculate() {
		return algorithm.generatePi(iterations);
	}


}
