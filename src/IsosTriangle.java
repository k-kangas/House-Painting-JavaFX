import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;

public class IsosTriangle {

	public static void paint(Group p, Color c, int x, int y, int base, int height) {
		Group group = new Group();
		
		
		// Right Side
		int PointX1 = x + (base/2);
		int PointY1 = y + height;
		// Left Side
		int PointX2 = x - (base/2);
		int PointY2 = y + height;

		double Points[] = {x, y, PointX1, PointY1, PointX2, PointY2};

		
		Polygon polygon = new Polygon(Points);
		polygon.setFill(c);
		polygon.setStrokeWidth(1);
		polygon.setStroke(c);
		

		group.getChildren().add(polygon);
		p.getChildren().add(group);
	}

}
