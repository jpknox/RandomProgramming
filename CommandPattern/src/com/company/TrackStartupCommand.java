package com.company;

/**
 * Created by JoaoPaulo on 26-Jul-17.
 */
public class TrackStartupCommand implements ICommand {

	private GoogleAnalytics googleAnalyticsReceiver;
	String information;

	public TrackStartupCommand(GoogleAnalytics googleAnalyticsReceiver, String information) {
		this.googleAnalyticsReceiver = googleAnalyticsReceiver;
		this.information = information;
	}

	public void setGoogleAnalyticsReceiver(GoogleAnalytics googleAnalyticsReceiver) {
		this.googleAnalyticsReceiver = googleAnalyticsReceiver;
	}

	public void setInformation(String information) {
		this.information = information;
	}

	@Override
	public void execute() {
		googleAnalyticsReceiver.post(new GoogleAnalyticsRequest(this.information));
		System.out.println("Startup POST'ed to Google Analytics.");
	}
}
