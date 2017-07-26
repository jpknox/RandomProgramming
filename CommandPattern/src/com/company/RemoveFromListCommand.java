package com.company;

import java.util.List;
import java.util.Map;

/**
 * Created by JoaoPaulo on 26-Jul-17.
 */
public class RemoveFromListCommand implements ICommand {

	List receiver;
	String amountToRemove;

	public RemoveFromListCommand(List<String> receiver, String amountToRemove) {
		this.receiver = receiver;
		this.amountToRemove = amountToRemove;
	}

	@Override
	public void execute() {
		receiver.remove(amountToRemove);
	}
}
