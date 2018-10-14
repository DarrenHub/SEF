package property_binding;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
public class VariableCircle extends Application {
	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) {
		Pane pane = new Pane(); // Create a pane to hold the circle
		Circle circle = new Circle(); // Create a circle and set its properties
		circle.centerXProperty().bind(pane.widthProperty().divide(2));
		circle.centerYProperty().bind(pane.heightProperty().divide(2));
		circle.setRadius(50);
//		circle.setStroke(Color.BLACK);
//		circle.setFill(Color.WHITE);
//		circle.setStyle("-fx-stroke:black; -fx-fill: red;");
		pane.getChildren().add(circle); // Add circle to the pane
		Scene scene = new Scene(pane, 200, 200);//Create a scene and place it in the stage
		primaryStage.setTitle("ShowCircleCentered"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
	}
	
	/**
	 * The main method is only needed for the IDE with limited JavaFX support. Not
	 * needed for running from the command line.
	 */
	public static void main(String[] args) {
		launch(args);
	}
}
