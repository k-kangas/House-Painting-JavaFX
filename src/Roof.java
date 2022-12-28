import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Roof {

	public static void paint(Group p) {
		int x = 500;
		int y = 400;
		int base = 350;
		int height = 200;
		Color c = Color.BLACK;

		Group group = new Group();		
		
		x = 550;
		y = 425;
		base = 50;
		height = 100;
		c = Color.CORAL;
		Rectangle rectangle = new Rectangle();
		rectangle.setHeight(height);
		rectangle.setWidth(base);
		rectangle.setX(x);
		rectangle.setY(y);
		rectangle.setFill(c);
		rectangle.setStrokeWidth(1);
		rectangle.setStroke(Color.GRAY);

		group.getChildren().add(rectangle);
		
		x = 500;
		y = 400;
		base = 350;
		height = 200;
		c = Color.INDIANRED;
		IsosTriangle.paint(group, c, x, y, base, height);
		
		
		p.getChildren().add(group);	
	}
}
