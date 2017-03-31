package com.jpknox;

/**
 * Created by joaok on 31/03/2017.
 */
public class Greeter implements Runnable {

	private final String name;

	public Greeter(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		greet();
	}

	private void greet() {
		System.out.printf("Hello from thread %s\n", name);
	}
}
