import javafx.scene.Group;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;


public class HouseFrame {

	public static void paint(Group p) {

		Group group = new Group();	

		int x = 350;
		int y = 600;
		int base = 300;
		int height = 200;
		Color c = Color.CORNFLOWERBLUE;

		Rectangle rectangle = new Rectangle();
		rectangle.setHeight(height);
		rectangle.setWidth(base);
		rectangle.setX(x);
		rectangle.setY(y);
		rectangle.setFill(c);
		rectangle.setStrokeWidth(1);
		rectangle.setStroke(Color.GRAY);

		group.getChildren().add(rectangle);
		
		p.getChildren().add(group);	
		
		Pane pane = new Pane();
		pane.setLayoutX(100);
		double paneLay = pane.getLayoutX();
		System.out.println(paneLay);
	}
}
