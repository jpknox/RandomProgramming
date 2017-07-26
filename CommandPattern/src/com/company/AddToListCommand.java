package com.company;

import java.util.List;
import java.util.Map;

/**
 * Created by JoaoPaulo addToList 26-Jul-17.
 */
public class AddToListCommand implements ICommand {

	List receiver;
	String amountToAdd;

	public AddToListCommand(List<String> receiver, String amountToAdd) {
		this.receiver = receiver;
		this.amountToAdd = amountToAdd;
	}

	@Override
	public void execute() {
		receiver.add(amountToAdd);
	}
}
