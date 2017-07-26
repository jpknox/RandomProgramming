package com.company;

/**
 * Created by JoaoPaulo on 26-Jul-17.
 */
public class GoogleAnalyticsRequest {

	String information;
	String param1;
	String param2;
	String param3;
	String param4;
	String param5;


	public GoogleAnalyticsRequest(String information) {
		this.information = information;
	}

	public GoogleAnalyticsRequest(String param1, String param2, String param3, String param4) {
		this.param1 = param1;
		this.param2 = param2;
		this.param3 = param3;
		this.param4 = param4;
	}
}
