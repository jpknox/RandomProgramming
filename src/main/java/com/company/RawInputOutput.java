package com.company;

import org.adrianwalker.multilinestring.Multiline;

/**
 * Created by jpknox on 27/03/17.
 */
public class RawInputOutput {
	/**
	 * 3
	 * 11 2 4
	 * 4 5 6
	 * 10 8 -12
	 */
	@Multiline
	private static String rawInput;

	/**
	 * 15
	 */
	@Multiline
	private static String rawOutput;

	public static String getRawInput() {
		return rawInput;
	}

	public static String getRawOutput() {
		return rawOutput;
	}
}
