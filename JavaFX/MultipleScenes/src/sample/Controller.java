package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class Controller {

	@FXML
	Button nameButton;



	public void notifyNameAction(ActionEvent actionEvent) {
		System.out.println("Joao Paulo Knox");
	}
}
