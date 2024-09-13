package application;

import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class FourLongShape extends Shape{
	public static final double bottomBound = 250;
	private Rectangle rect1;
	private static int fourLongCount = 0;;
	
	private Group group;

	FourLongShape(Color c){
		rect1 = new Rectangle();
		rect1.setX(0);
		rect1.setY(0);
		rect1.setWidth(30);
		rect1.setHeight(120);
		rect1.setFill(c);
		
		group = new Group();
		group.setId("FourLong " + fourLongCount);
		group.getChildren().add(rect1);
		fourLongCount++;
	}
	FourLongShape(){
		this(Color.CRIMSON);
	}
	public Group getShape() {
		return group;
	}
	
}
