import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;

public class Window {

	public static void paint(Group p) {
		Color c = Color.BLACK;
		Group group = new Group();	

		// Variables
		c = Color.WHITE;
		Color LineColor = Color.GRAY;
		int base = 0;
		int height = 0;
		int x = 0;
		int y = 0;

		// Bottom Windows
		int NumberOfWindowsOnBottom = 2;
		for (int i = 0; i < NumberOfWindowsOnBottom; i++) {
			base = 50;
			height = 50;
			x = 400;
			y = 725;
			if (i > 0) {
				x += 150;
			}
			Rectangle rectangle = new Rectangle();
			rectangle.setHeight(height);
			rectangle.setWidth(base);
			rectangle.setX(x);
			rectangle.setY(y);
			rectangle.setFill(c);
			rectangle.setStrokeWidth(1);
			rectangle.setStroke(LineColor);
			group.getChildren().add(rectangle);
			Line line = new Line();
			line.setStartX(x);
			line.setStartY(y + height / 2);
			line.setEndX(x+base);
			line.setEndY(y + height / 2);
			line.setStroke(LineColor);
			group.getChildren().add(line);
			line = new Line();
			line.setStartX(x + base / 2);
			line.setStartY(y);
			line.setEndX(x+ base / 2);
			line.setEndY(y + height);
			line.setStroke(LineColor);
			group.getChildren().add(line);
		}
		// Top Windows
		int NumberOfWindowsOnTop = 2;
		for (int i = 0; i < NumberOfWindowsOnTop; i++) {
			base =  28;
			height = 50;
			x = 400;
			y = 625;
			if (i > 0) {
				x += 172;
			}
			Rectangle rectangle = new Rectangle();
			rectangle.setHeight(height);
			rectangle.setWidth(base);
			rectangle.setX(x);
			rectangle.setY(y);
			rectangle.setFill(c);
			rectangle.setStrokeWidth(1);
			rectangle.setStroke(LineColor);
			group.getChildren().add(rectangle);
			Line line = new Line();
			line.setStartX(x);
			line.setStartY(y + height / 2);
			line.setEndX(x+base);
			line.setEndY(y + height / 2);
			line.setStroke(LineColor);
			group.getChildren().add(line);
			line = new Line();
			line.setStartX(x + base / 2);
			line.setStartY(y);
			line.setEndX(x+ base / 2);
			line.setEndY(y + height);
			line.setStroke(LineColor);
			group.getChildren().add(line);
		}
		// Middle Window above Door of House
		double X = 500.0;
		double Y = 650.0;
		double R = 15.0;
		c = Color.WHITE;
		Circle circle = new Circle();
		circle.setCenterX(X);
		circle.setCenterY(Y);
		circle.setRadius(R);
		circle.setFill(c);
		circle.setStroke(LineColor);
		circle.setStrokeWidth(1);

		group.getChildren().add(circle);

		Line line = new Line();
		line.setStartX(X - R); 
		line.setStartY(Y); 
		line.setEndX(X + R); 
		line.setEndY(Y);
		line.setStroke(LineColor);
		group.getChildren().add(line);

		line = new Line();
		line.setStartX(X); 
		line.setStartY(Y - R); 
		line.setEndX(X); 
		line.setEndY(Y + R);
		line.setStroke(LineColor);

		group.getChildren().add(line);

		p.getChildren().add(group);
	}
}

