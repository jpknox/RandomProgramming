package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class Controller {

	@FXML
	Button nameButton; //The fx:id attribute within the FXML links to the identical name of this button variable.

	@FXML
	Button townButton;

	@FXML
	Button boroughButton;

	@FXML  //The @FXML annotation allows this method to be referenced from the FXML within an attribute of an element.
	private void  handleNameButtonAction(ActionEvent action) {
		String name = "Joao Paulo Knox";
		System.out.println(name);
		nameButton.setText(name);  //Using the @FXML injection above the button is accessed.
		resetOtherButtonsText((Button) action.getSource());
	}

	public void handleTownButtonAction(ActionEvent actionEvent) {
		String town = "Cheltenham";
		System.out.println(town);
		townButton.setText(town);
		resetOtherButtonsText((Button) actionEvent.getSource());

	}

	public void handleBoroughButtonAction(ActionEvent actionEvent) {
		String borough = "Gloucestershire";
		System.out.println(borough);
		boroughButton.setText(borough);
		resetOtherButtonsText((Button) actionEvent.getSource());
	}

	public void handleResetButtonAction(ActionEvent actionEvent) {
		System.out.println("Pressed reset");
		resetOtherButtonsText((Button) actionEvent.getSource());
	}

	private int resetOtherButtonsText(Button callingButton) {
		String defaultBtnText = "Button";
		switch (callingButton.getId()) {
			case "nameButton":
				townButton.setText(defaultBtnText);
				boroughButton.setText(defaultBtnText);
				break;
			case "townButton":
				nameButton.setText(defaultBtnText);
				boroughButton.setText(defaultBtnText);
				break;
			case "boroughButton":
				nameButton.setText(defaultBtnText);
				townButton.setText(defaultBtnText);
				break;
			default:
				nameButton.setText(defaultBtnText);
				townButton.setText(defaultBtnText);
				boroughButton.setText(defaultBtnText);
				break;
		}

		return 0;
	}


}
