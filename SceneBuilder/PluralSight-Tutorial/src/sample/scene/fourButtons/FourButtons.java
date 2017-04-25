package sample.scene.fourButtons;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;

import java.awt.event.ActionListener;

/**
 * Created by joaok on 25/04/2017.
 */
public class FourButtons extends Scene implements EventHandler<ActionEvent> {

    @FXML
    Button upperLeft;

    @FXML
    Button upperRight;

    @FXML
    Button lowerLeft;

    @FXML
    Button lowerRight;

    public FourButtons(Parent root, int width, int height) {
        super(root, width, height);
        upperLeft.setOnAction(this);
        upperRight.setOnAction(this);
        lowerLeft.setOnAction(this);
        lowerRight.setOnAction(this);
    }

    @Override
    public void handle(ActionEvent event) {
        if (event.getSource() == upperLeft) {
            System.out.println("You clicked UpperLeft.");
        } else
        if (event.getSource() == upperRight) {
            System.out.println("You clicked UpperRight.");
        } else
        if (event.getSource() == lowerLeft) {
            System.out.println("You clicked LowerLeft.");
        } else
        if (event.getSource() == lowerRight) {
            System.out.println("You clicked LowerRight.");
        }
    }
}
