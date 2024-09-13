package application;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.util.Duration;

public class GameController {
	@FXML
	private AnchorPane ap;
	private int frameCount = 0;
	
	@FXML
	public void initialize(){ // runs upon opening of fxml
		System.out.println("test");
		
		LShape test = new LShape();
		ap.getChildren().addAll(test.getShape());
		
		
		
		
		
		//new "frame" every 16 ms. similar to 60 fps
		Timeline timeline = new Timeline(new KeyFrame(Duration.millis(16), event -> {
			//this is game loop, put everything needing an update in here
			if(frameCount/2 == 0) {
				if(((Rectangle)ap.getChildren().get(4)).getY() < 280)((Rectangle)ap.getChildren().get(4)).setY(((Rectangle)ap.getChildren().get(4)).getY() +1);
				if(((Rectangle)ap.getChildren().get(5)).getY() < 340)((Rectangle)ap.getChildren().get(5)).setY(((Rectangle)ap.getChildren().get(5)).getY() +1);
				frameCount = 0;
			}
			
			frameCount++;
		}));
		timeline.setCycleCount(Timeline.INDEFINITE);
		timeline.play();
		
	}
	
	
}
