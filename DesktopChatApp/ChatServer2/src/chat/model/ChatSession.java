package chat.model;

import java.net.Socket;

/**
 * Created by JoaoPaulo on 07-May-17.
 */
public class ChatSession {

	private Socket socket;

	public ChatSession(Socket socket) {
		this.socket = socket;

		start();
	}

	private void start() {
		System.out.println("ChatSession started");
	}

}
