package app.model.music.song;

import javafx.scene.media.Media;

import java.io.File;

/**
 * Created by JoaoPaulo on 06-May-17.
 */
public class HarddriveSong implements ISong {

	private Media songInMemory;

	public HarddriveSong() {
	}

	public HarddriveSong(String sourceURI) {
		this.songInMemory = new Media(sourceURI);
	}

	@Override
	public Media getSong() {
		return this.songInMemory;
	}

	public void setSongInMemory(String songLocationURI) {
		this.songInMemory = new Media(songLocationURI);
	}
}
