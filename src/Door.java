import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

public class Door {

	public static void paint(Group p) {

		Color c = Color.BLACK;
		
		Group group = new Group();

		int x = 475;
		int y = 700;
		int height = 100;
		int base = 50;
		c = Color.RED;
	
		Rectangle rectangle = new Rectangle();
		rectangle.setHeight(height);
		rectangle.setWidth(base);
		rectangle.setX(x);
		rectangle.setY(y);
		rectangle.setFill(c);
		rectangle.setStrokeWidth(1);
		rectangle.setStroke(Color.GRAY);

		group.getChildren().add(rectangle);
		

		Circle doorknob = new Circle(515, 750, 3);
		doorknob.setFill(Color.WHITE);
		doorknob.setStrokeWidth(1);
		doorknob.setStroke(Color.BLACK);

		group.getChildren().add(doorknob);
		
		
		p.getChildren().add(group);	
	}
}
