package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import sample.scene.fourButtons.FourButtons;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        Integer width = Integer.parseInt(getParameters().getNamed().get("width"));
        Integer height = Integer.parseInt(getParameters().getNamed().get("height"));
        primaryStage.setScene(new Scene(root, width, height));
//        primaryStage.setScene(new FourButtons(600, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
