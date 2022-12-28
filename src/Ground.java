import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.Stop;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;

public class Ground {
	
	public static void paint(Group p) {
		Line line = new Line();
		Group group = new Group();
		Color c = Color.BLACK;

		line.setStartX(0); 
		line.setStartY(800.0); 
		line.setEndX(1000.0); 
		line.setEndY(800.0); 
		c = Color.BLACK;
		line.setStroke(c);
		group.getChildren().add(line);
		
		int x = 000;
		int y = 800;
		int base = 1000;
		int height = 200;
		c = Color.LAWNGREEN;
		Stop[] stops = new Stop[] { new Stop(0, Color.FORESTGREEN), new Stop(1, c)};
		LinearGradient lg1 = new LinearGradient(0, 0, 1, 0, true, CycleMethod.NO_CYCLE, stops);
		
		Rectangle rectangle = new Rectangle();
		
		rectangle.setHeight(height);
		rectangle.setWidth(base);
		rectangle.setX(x);
		rectangle.setY(y);
		rectangle.setFill(lg1);
		rectangle.setStrokeWidth(1);
		rectangle.setStroke(c);

		
		group.getChildren().add(rectangle);
		p.getChildren().add(group);
	}
}
