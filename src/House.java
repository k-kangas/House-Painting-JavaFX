import javafx.scene.Group;

public class House {

	public static void paint(Group p) {
		HouseFrame.paint(p);
		Door.paint(p);
		Roof.paint(p);
		Window.paint(p);
	}
}
