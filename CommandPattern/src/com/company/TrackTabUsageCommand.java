package com.company;

/**
 * Created by JoaoPaulo on 26-Jul-17.
 */
public class TrackTabUsageCommand implements ICommand {

	GoogleAnalytics googleAnalytics;
	String tab1Usage;
	String tab2Usage;
	String tab3Usage;
	String tab4Usage;

	public TrackTabUsageCommand(GoogleAnalytics googleAnalytics, String tab1Usage, String tab2Usage, String tab3Usage, String tab4Usage) {
		this.googleAnalytics = googleAnalytics;
		this.tab1Usage = tab1Usage;
		this.tab2Usage = tab2Usage;
		this.tab3Usage = tab3Usage;
		this.tab4Usage = tab4Usage;
	}

	@Override
	public void execute() {
		this.googleAnalytics.post(new GoogleAnalyticsRequest(this.tab1Usage, this.tab2Usage, this.tab3Usage, this.tab4Usage));
		System.out.println("Tab 1:" + this.tab1Usage + " Tab 2:" + this.tab2Usage + " Tab 3:" + this.tab3Usage + " Tab 4:" + this.tab4Usage + ".");
	}
}
