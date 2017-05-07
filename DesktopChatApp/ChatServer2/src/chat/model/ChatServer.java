package chat.model;

import chat.controller.Controller;

import java.io.IOException;
import java.net.ServerSocket;

/**
 * Created by JoaoPaulo on 07-May-17.
 */
public class ChatServer implements Runnable {

	private int port = 8085;
	private Controller controller;
	private ServerSocket server = null;


	public ChatServer(Controller controller) {
		this.controller = controller;
	}

	@Override
	public void run() {
		start();
	}

	private void start() {
		try {
			server = new ServerSocket(port);
		} catch (IOException e) {
			e.printStackTrace();
		}

		while (!server.isClosed()) {
			try {
				new ChatSession(server.accept());
			} catch (IOException e) {
				e.printStackTrace();
		}
		}
	}
}
