/*
 * Kurt Kangas
 * CIS 2212 Java Software Development I
 * JavaFX House Painting
 */

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Picture extends Application {
	public void start(Stage stage) {	
		
		int Height = 1000;
		int Width = 1000;		
		// Create a Group
		Group p = new Group();
		// Add to Group
		Picture.paint(p);
		// Create a Scene
		Scene scene = new Scene(p, Width, Height);
		// Create a Stage
		stage.setTitle("House");
		stage.setScene(scene);
		stage.show();
	
	}
	public static void main(String[] args) {	
		launch(args);
	}
	
	public static void paint(Group p) {
		Scenery.paint(p);
		House.paint(p);
		}

}
