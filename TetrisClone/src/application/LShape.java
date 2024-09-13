package application;

import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class LShape extends Shape{
	public static final double bottomBound = 280;
	private Rectangle rect1;
	private Rectangle rect2;
	private static int LCount = 0;
	
	
	private Group group;
	
	LShape(Color c, boolean inverted){
		rect1 = new Rectangle();
		rect2 = new Rectangle();
		rect1.setFill(c);
		rect2.setFill(c);
		rect1.setWidth(30);
		rect1.setHeight(90);
		rect2.setWidth(60);
		rect2.setHeight(30);
		rect1.setX(0);
		rect1.setY(0);
		rect2.setY(60);
		int temp = inverted ? -30: 0;
		rect2.setX(temp);
		rect1.setId("upright " + LCount);
		rect2.setId("notUpright " + LCount);
		
		group = new Group();
		group.setId("Lshape " + (LCount));
		group.getChildren().addAll(rect1,rect2);
		LCount++;
	}
	LShape(){
		this(Color.BLACK, false);
	}
	public Group getShape() {
		return group;
	}
	
}
