package com.company;

import com.company.piCalculators.NilakanthaSomayaji;
import com.company.piCalculators.PiCalculator;
import com.company.piDisplay.PiDisplay;

import java.math.BigDecimal;

public class Main {

	private static final long n = 10000000000L;

    public static void main(String[] args) {

        PiCalculator piCalculator = new PiCalculator();
		PiDisplay piDisplay = new PiDisplay();
		piCalculator.setAlgorithm(new NilakanthaSomayaji());
		piCalculator.setIterations(1000000L);

		BigDecimal pi = piCalculator.calculate();
		piDisplay.displayPi(pi);




    }

}
