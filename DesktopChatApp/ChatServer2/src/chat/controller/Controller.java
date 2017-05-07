package chat.controller;

import chat.model.ChatServer;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {

	private ChatServer chatServer;

	@FXML
	private TextArea outputTextArea;

	@FXML
	private TextField chatEntryTextField;

	public Controller() {
		new Thread(chatServer = new ChatServer(this)).start();
	}

	public void addToOutputText(String newText) {
		outputTextArea.setText(outputTextArea.getText() + newText + "\n");
	}

	public void pressedAddText(ActionEvent actionEvent) {
		addToOutputText(chatEntryTextField.getText());
		chatEntryTextField.setText("");
	}
}
