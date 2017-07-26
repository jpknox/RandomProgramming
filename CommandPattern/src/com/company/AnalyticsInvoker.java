package com.company;

/**
 * Created by JoaoPaulo on 26-Jul-17.
 */
public class AnalyticsInvoker {

	ICommand command;

	public AnalyticsInvoker(ICommand trackStartupCommand) {
		this.command = trackStartupCommand;
	}

	public void setCommand(ICommand command) {
		this.command = command;
	}

	public void track() {
		this.command.execute();
	}
}
