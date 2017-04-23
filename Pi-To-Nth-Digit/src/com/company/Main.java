package com.company;

import com.company.piCalculators.equations.GregoryLeibnizEquation;
import com.company.piCalculators.equations.NilakanthaSomayaji;
import com.company.piCalculators.PiCalculator;
import com.company.piDisplay.PiDisplay;

import java.math.BigDecimal;

public class Main {

	private static final long n = 1000000L;

    public static void main(String[] args) {
		PiCalculator piCalculator = new PiCalculator();
		PiDisplay piDisplay = new PiDisplay();
		piCalculator.setIterations(n);
		BigDecimal pi;


		piCalculator.setAlgorithm(new NilakanthaSomayaji());
		pi = piCalculator.calculate();
		piDisplay.displayPi(pi);

		piCalculator.setAlgorithm(new GregoryLeibnizEquation());
		pi = piCalculator.calculate();
		piDisplay.displayPi(pi);



    }

}
