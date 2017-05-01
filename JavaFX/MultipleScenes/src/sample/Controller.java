package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

	@FXML
	private Button nameButton; //The fx:id attribute within the FXML links to the identical name of this button variable.

	@FXML
	private Button townButton;

	@FXML
	public TextField entryTextField;

	@FXML
	private ListView dataListGeneral;

	private ObservableList<String> dataListItems = FXCollections.observableArrayList();
	private int quantityOfEntries = 0;


	@Override
	public void initialize(URL location, ResourceBundle resources) {
		dataListGeneral.setItems(dataListItems);
	}

	@FXML  //The @FXML annotation allows this method to be referenced from the FXML within an attribute of an element.
	private void handleAddButtonAction(ActionEvent action) {
		String entryText = entryTextField.getText();
		if ( !(entryText != null && !entryText.isEmpty()) ) return;

		System.out.println(String.format("Add %s", entryText));
		dataListItems.add(entryText);
		quantityOfEntries++;
	}


	public void handleRemoveButtonAction(ActionEvent actionEvent) {
		String entryText = entryTextField.getText();
		if (quantityOfEntries == 0 || entryText == null || entryText.isEmpty()) return;

		System.out.println(String.format("Remove all occurrences of %s", entryText));
		while (dataListItems.contains(entryText)) {
			dataListItems.remove(entryText);
			quantityOfEntries--;
		}
	}

	public void handleResetButtonAction(ActionEvent actionEvent) {
		System.out.println("Pressed reset");
	}


}
