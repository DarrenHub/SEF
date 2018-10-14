package ui_controls;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.stage.*;

public class ComboBox1 extends Application {
	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) {
		// Create a pane and set its properties
		Pane pane = new Pane();

		String[] selections = new String[10];
		for (int i = 0; i < selections.length; i++) {
			selections[i] = "Option " + (i + 1);
		}
		
		ComboBox<String> cbo = new ComboBox<>();
		cbo.getItems().addAll(selections);
		cbo.setValue(selections[0]);
		cbo.setOnAction(new ComboBoxListener1(cbo));

		pane.getChildren().add(cbo);
		Scene scene = new Scene(pane);
		primaryStage.setTitle("Combo Box 1 Demo"); // Set the stage title
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

class ComboBoxListener1 implements EventHandler<ActionEvent> {
	
	private ComboBox<String> comboBox;
	
	public ComboBoxListener1(ComboBox<String> comboBox) {
		this.comboBox = comboBox;
	}

	@Override
	public void handle(ActionEvent event) {
		System.out.println("You have selected: " + comboBox.getValue());
	}
	
}
