package app.services;

import org.springframework.stereotype.Component;

/**
 * Created by jpknox on 21/03/17.
 */
@Component
public class LoggerService {

	public void println(String text) {
		System.out.println("\n" + text + "\n");
	}

}
