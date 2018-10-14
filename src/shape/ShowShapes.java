package shape;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.text.Text;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Circle;

public class ShowShapes extends Application {
    @Override // Override the start method in the Application class
    public void start(Stage primaryStage) {
	
	Pane pane = new Pane(); // Create a pane1
	
	Rectangle r1 = new Rectangle(25, 10, 60, 30); // Create rectangles and add to pane
	r1.setStroke(Color.BLACK);
	r1.setFill(Color.WHITE);
	pane.getChildren().add(new Text(10, 27, "r1"));
	pane.getChildren().add(r1);
	
	Rectangle r2 = new Rectangle(25, 50, 60, 30);
	pane.getChildren().add(new Text(10, 67, "r2"));
	pane.getChildren().add(r2);
	
	Rectangle r3 = new Rectangle(25, 90, 60, 30);
	r3.setArcWidth(15);
	r3.setArcHeight(25);
	pane.getChildren().add(new Text(10, 107, "r3"));
	pane.getChildren().add(r3);
	
	for (int i = 0; i < 4; i++) {
		   Rectangle r = new Rectangle(100, 50, 100, 30);
		   r.setRotate(i * 360 / 8);
		   r.setStroke(Color.BLACK);
		   r.setFill(Color.color(Math.random(), Math.random(),Math.random()));
		   pane.getChildren().add(r);
	}
		
	Circle c1 = new Circle(150,150,50);
	c1.setStroke(Color.BLACK);
	c1.setFill(Color.WHITE);
	pane.getChildren().add(c1);
	
	Line l1 = new Line(150,150,240,180);
	l1.setStroke(Color.BLACK);
	pane.getChildren().add(l1);
	
	// Create a scene and place it in the stage
	Scene scene = new Scene(pane, 250, 250);
	primaryStage.setTitle("Show Shapes"); // Set the stage title
	primaryStage.setScene(scene); // Place the scene in the stage
	primaryStage.show(); // Display the stage
   }
    
	public static void main(String[] args) {
		Application.launch(args);
	}
}
