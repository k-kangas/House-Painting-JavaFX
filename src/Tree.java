import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Tree {

	public static void paint(Group p) {
		Group group = new Group();	

		Color c = Color.BLACK;
		Color LineColor = Color.GRAY;
		int x = 0;
		int y = 0;
		int base = 0;
		int height = 0;

		int NumberOfTrees = 2;

		for (int loop = 0; loop < NumberOfTrees; loop++) {
			// Tree Trunk
			x = 740;
			y = 780;
			base = 20;
			height = 20;
			c = Color.BROWN;
			for (int i = 0; i < NumberOfTrees; i++) {
				base =  20;
				height = 20;
				x = 740;
				y = 780;
				if (i > 0) {
					x -= 500;
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

			}
			// Body of Tree	
			c = Color.BLACK;
			c = Color.GREEN;
			x = 750;
			NumberOfTrees = 2;
			for (int i = 0; i < NumberOfTrees; i++) {
				y = 700;
				base = 80;
				height = 80;
				if (i > 0) {
					x -= 500;
				}
				for (int j = 0; j < 4; j++) {
					int Bdub = 5;
					int Hdub = 20;
					IsosTriangle.paint(group, c, x, y, base, height);
					base -= Bdub;
					Bdub += Bdub;
					height -= Hdub;
				}	
			}

		}	
		p.getChildren().add(group);
	}
}
