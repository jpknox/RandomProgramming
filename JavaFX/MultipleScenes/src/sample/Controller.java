package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

	@FXML
	private Button nameButton; //The fx:id attribute within the FXML links to the identical name of this button variable.

	@FXML
	private Button townButton;

	@FXML
	private Button boroughButton;
	
	@FXML
	private ListView dataListGeneral;

	private ObservableList<String> dataListItems = FXCollections.observableArrayList();
	private int i = 1;


	@Override
	public void initialize(URL location, ResourceBundle resources) {
		dataListGeneral.setItems(dataListItems);
	}

	@FXML  //The @FXML annotation allows this method to be referenced from the FXML within an attribute of an element.
	private void handleAddButtonAction(ActionEvent action) {
		System.out.println(String.format("Add %d", i));
		dataListItems.add(String.format("Item %d", i));
		++i;
//		dataListGeneral.
	}


	public void handleRemoveButtonAction(ActionEvent actionEvent) {
		if (i > 0) dataListItems.remove(String.format("Item %d", --i));
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
