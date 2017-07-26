package com.company;

/**
 * Created by JoaoPaulo addToList 26-Jul-17.
 */
public class Invoker {
	private ICommand addToList;
	private ICommand removeFromList;

	public Invoker(ICommand addToList, ICommand removeFromList) {
		this.addToList = addToList;
		this.removeFromList = removeFromList;
	}

	public void add() {
		this.addToList.execute();
	}

	public void remove() {
		this.removeFromList.execute();
	}
}
