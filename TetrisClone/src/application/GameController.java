package application;

import java.io.IOException;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.fxml.FXML;
import javafx.scene.Group;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.util.Duration;

public class GameController {
	@FXML
	private AnchorPane ap;
	private int frameCount = 0;
	private int currentIdx = 0;
	
	@FXML
	public void initialize(){ // runs upon opening of fxml
		System.out.println("test");
		int Lidx = makeLShape();
		currentIdx = Lidx;
//		int FLidx = makeFourLongShape();
		
		int temp = 0;
		
		int[][] solid = new int[8][10]; // x,y 8 is max width, 10 is made up height
		
		//new "frame" every 16 ms. similar to 60 fps
		Timeline timeline = new Timeline(new KeyFrame(Duration.millis(16), event -> {
			//this is game loop, put everything needing an update in here
			if(frameCount/2 == 0) {
				if(((Group)ap.getChildren().get(Lidx)).getTranslateY() < LShape.bottomBound + temp)((Group)ap.getChildren().get(Lidx)).setTranslateY(((Group)ap.getChildren().get(Lidx)).getTranslateY() +1);
//				if(((Group)ap.getChildren().get(FLidx)).getTranslateY() < FourLongShape.bottomBound + temp)((Group)ap.getChildren().get(FLidx)).setTranslateY(((Group)ap.getChildren().get(FLidx)).getTranslateY() +1);
				frameCount = 0;
			}
			
			frameCount++;
		}));
		timeline.setCycleCount(Timeline.INDEFINITE);
		timeline.play();
		
	}
	public int makeLShape() {
		LShape LS = new LShape(Color.AQUAMARINE, true);
		LS.getShape().setTranslateX(120);
		ap.getChildren().add(LS.getShape());
		
		return ap.getChildren().size()-1;
	}
	public int makeFourLongShape() {
		FourLongShape fls = new FourLongShape();
		fls.getShape().setTranslateX(150); //for testing purposes, will be 120 in future but will instantiate at a different time than other shapes
		ap.getChildren().add(fls.getShape());
		
		return ap.getChildren().size()-1;
	}
	//TODO
	//make gameplay loop as such: shape instantiates and is made "current", begins to fall, shape lands, shape solidifies, new shape instantiates
	//when solidifying, 2d array is marked so new bottom bound is made
	
	
	public void handleKeyPress(KeyEvent event) throws IOException {
		if (event.getCode().toString() == "A") {
			((Group)ap.getChildren().get(currentIdx)).setTranslateX(((Group)ap.getChildren().get(currentIdx)).getTranslateX()-30);
			System.out.println("moving left");
		}
			

		if (event.getCode().toString() == "D") {
			((Group)ap.getChildren().get(currentIdx)).setTranslateX(((Group)ap.getChildren().get(currentIdx)).getTranslateX()+30);
			System.out.println("moving right");
		}

	}
	
}
