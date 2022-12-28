import javafx.animation.RotateTransition;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Rectangle;
import javafx.util.Duration;

public class Sky {

	public static void paint(Group p) {
		Group group = new Group();

		int X = 0;
		int Y = 0;
		int base = 1000;
		int height = 800;
		Color c = Color.LIGHTSKYBLUE;

		Rectangle rectangle = new Rectangle();
		rectangle.setHeight(height);
		rectangle.setWidth(base);
		rectangle.setX(X);
		rectangle.setY(Y);
		rectangle.setFill(c);
		rectangle.setStrokeWidth(1);
		rectangle.setStroke(Color.GRAY);

		group.getChildren().add(rectangle);


		double x = 575.0;
		double y = 400.0;
		for (int i = 0; i < 3; i++) {

			RotateTransition rotateTransition = new RotateTransition();
			Ellipse ellipse = new Ellipse();
			ellipse.setCenterX(x); 
			ellipse.setCenterY(y);

			ellipse.setRadiusX(25.0f); 
			ellipse.setRadiusY(15.0f); 

			ellipse.setFill(Color.WHITE);
			ellipse.setStroke(Color.WHITESMOKE);
			ellipse.setStrokeWidth(1);

			rotateTransition.setNode(ellipse);
			rotateTransition.setDuration(Duration.millis(250));
			rotateTransition.setByAngle(360);
			rotateTransition.setCycleCount(50);
			rotateTransition.setAutoReverse(false);
			rotateTransition.play();

			group.getChildren().add(ellipse);

			x += 40;
			y -= 40;
			ellipse = new Ellipse();
		}	



		p.getChildren().add(group);

	}

}
