package com.company;

/**
 * Created by JoaoPaulo on 30-May-17.
 */
public class Fibonacci {

	public static long getFibonacci(long number) {
		if (number == 0 || number == 1) return number;
		long derivedNumber = getFibonacci(number-1) + getFibonacci(number-2);
		return derivedNumber;
	}

}