package application;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class LShape extends Shape{
	private Rectangle rect1;
	private Rectangle rect2;
	private static int LCount = 0;
	
	LShape(Color c, boolean inverted){
		rect1 = new Rectangle();
		rect2 = new Rectangle();
		rect1.setFill(c);
		rect2.setFill(c);
		rect1.setWidth(30);
		rect1.setHeight(90);
		rect2.setWidth(60);
		rect2.setHeight(30);
		rect1.setX(120);
		rect1.setY(-100);
		rect2.setY(-40);
		int temp = inverted ? 90: 120;
		rect2.setX(temp);
		rect1.setId("upright " + LCount);
		rect2.setId("notUpright " + LCount);
		
		LCount++;
	}
	LShape(){
		this(Color.BLACK, false);
	}
	public Rectangle[] getShape() {
		Rectangle[] rects = {rect1,rect2};
		return rects;
	}
}
