package event_handling;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class ControlCircle extends Application {
	private CirclePane circlePane = new CirclePane();

	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) {
		HBox hBox = new HBox(); // Hold two buttons in an HBox
		hBox.setSpacing(10);
		hBox.setAlignment(Pos.CENTER);
		Button btEnlarge = new Button("Enlarge");
		Button btShrink = new Button("Shrink");
		hBox.getChildren().add(btEnlarge);
		hBox.getChildren().add(btShrink);

		// Create and register the handler
		btEnlarge.setOnAction(new EnlargeHandler());
		btShrink.setOnAction(new ShrinkHandler());
		BorderPane borderPane = new BorderPane();
		borderPane.setCenter(circlePane);
		borderPane.setBottom(hBox);
		BorderPane.setAlignment(hBox, Pos.CENTER);
		Scene scene = new Scene(borderPane, 200, 150);
		primaryStage.setTitle("ControlCircle"); // Set the stage title
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

	class EnlargeHandler implements EventHandler<ActionEvent> {
		@Override // Override the handle method
		public void handle(ActionEvent e) {
			circlePane.enlarge();
		}
	}

	class ShrinkHandler implements EventHandler<ActionEvent> {
		@Override // Override the handle method
		public void handle(ActionEvent e) {
			circlePane.shrink();
		}
	}
}

class CirclePane extends StackPane {
	private Circle circle = new Circle(50);

	public CirclePane() {
		getChildren().add(circle);
		circle.setStroke(Color.BLACK);
		circle.setFill(Color.WHITE);
	}

	public void enlarge() {
		circle.setRadius(circle.getRadius() + 2);
	}

	public void shrink() {
		circle.setRadius(circle.getRadius() > 2 ? circle.getRadius() - 2 : circle.getRadius());
	}
}