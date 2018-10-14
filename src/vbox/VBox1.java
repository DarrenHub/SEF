package vbox;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class VBox1 extends Application {
	
	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) {
		// Create a pane and set its properties
		VBox vBox = new VBox(5);
		vBox.setPadding(new Insets(15, 5, 5, 5));
		
		Label[] labels = new Label[5];
		for (int i = 0; i < labels.length; i++) {
			labels[i] = new Label("Node " + (i + 1));
			labels[i].setPrefSize(300, 50);
			labels[i].setFont(new Font(20));
			labels[i].setAlignment(Pos.CENTER);
			labels[i].setStyle("-fx-border-color: black");
			vBox.getChildren().add(labels[i]);
		}
		
		// Create a scene and place the pane in the stage
		Scene scene = new Scene(vBox);
		primaryStage.setTitle("VBoxDemo"); // Set the stage title
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
