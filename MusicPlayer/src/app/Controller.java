package app;

import app.model.music.song.HarddriveSong;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.DragEvent;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;

public class Controller {


	private final MediaPlayer songPlayer;

	@FXML
	private Button pauseBtn;

	public Controller() {
		String fileLocation = "C:/Users/JoaoPaulo/IdeaProjects/RandomProgramming/MusicPlayer/resources/sample/mp3/Earhart.mp3";
		fileLocation = "file:///" + fileLocation;
		HarddriveSong song = new HarddriveSong(fileLocation);
		songPlayer = new MediaPlayer(song.getSong());


	}



	public  void play() {
		System.out.println("Pressed play");
		songPlayer.play();
	}

	public void pause(ActionEvent actionEvent) {
		System.out.println("Pressed pause");
		songPlayer.pause();
		songPlayer.getCurrentTime();
		pauseBtn.setText("pressed");
		Stage stageTheLabelBelongs = (Stage) pauseBtn.getScene().getWindow();
//		stageTheLabelBelongs.setScene(new Scene("view/basicScreen.fxml"));
	}

	public void updatePosition(DragEvent dragEvent) {
	}
}
