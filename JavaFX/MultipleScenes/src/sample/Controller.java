package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class Controller {

	@FXML
	Button nameButton; //The fx:id attribute within the FXML links to the identical name of this button variable.

	@FXML  //The @FXML annotation allows this method to be referenced from the FXML within an attribute of an element.
	private void  handleNameButtonAction(ActionEvent action) {
		String name = "Joao Paulo Knox";
		System.out.println(name);
		nameButton.setText(name);  //Using the @FXML injection above the button is accessed.
	}
}
