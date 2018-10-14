package ui_controls;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ContentDisplay;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class CheckBox1 extends Application {
	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) {
		// Create a pane and set its properties
		Pane pane = new Pane();
		
		CheckBox aptCheckBox = new CheckBox("Apartment");
		try {
			aptCheckBox.setGraphic(new ImageView(new Image(getClass()
					.getResource("/resources/premiumSuite1.jpg").toURI().toString(), 80, 80, true, true)));
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		aptCheckBox.setContentDisplay(ContentDisplay.LEFT);
		aptCheckBox.setStyle("-fx-border-color: black"); 
		aptCheckBox.setSelected(true);
		aptCheckBox.setPadding(new Insets(5, 5, 5, 5));
		
		aptCheckBox.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				if(aptCheckBox.isSelected()) {
					System.out.println("You have selected the Apartment option");	
				}	
			}
		});

		pane.getChildren().add(aptCheckBox);
		// Create a scene and place the pane in the stage
		Scene scene = new Scene(pane);
		primaryStage.setTitle("Check Box 1 Demo"); // Set the stage title
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
