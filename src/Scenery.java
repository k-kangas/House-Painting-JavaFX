import javafx.scene.Group;

public class Scenery {	
	
	public static void paint(Group p) {	
		Sky.paint(p);
		Ground.paint(p);
		Tree.paint(p);	
	}
}

