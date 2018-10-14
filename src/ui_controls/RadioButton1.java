package ui_controls;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class RadioButton1 extends Application {
	
	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) {
		// Create a pane and set its properties
		VBox vBox = new VBox(5);
		vBox.setPadding(new Insets(15, 5, 5, 5));

		RadioButton aptRadioButton = createRadioButton("Apartment", "/resources/apartment1.png", false);
		aptRadioButton.setOnAction(new RadioButtonListener1(aptRadioButton));
		RadioButton suiteRadioButton = createRadioButton("Premium Suite", "/resources/premiumSuite1.jpg", false);
		suiteRadioButton.setOnAction(new RadioButtonListener1(suiteRadioButton));
		
		ToggleGroup group = new ToggleGroup();
		aptRadioButton.setToggleGroup(group);
		suiteRadioButton.setToggleGroup(group);
		
		vBox.getChildren().add(aptRadioButton);		
		vBox.getChildren().add(suiteRadioButton);		
		
		// Create a scene and place the pane in the stage
		Scene scene = new Scene(vBox);
		primaryStage.setTitle("Radio Button Demo 1"); // Set the stage title
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
	
	private RadioButton createRadioButton(String text, String imagePath, boolean selectionStatus) {
		RadioButton radioButton = new RadioButton(text);
		try {
			radioButton.setGraphic(new ImageView(new Image(getClass()
					.getResource(imagePath).toURI().toString(), 80, 80, true, true)));
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		radioButton.setTextFill(Color.GREEN);
		radioButton.setContentDisplay(ContentDisplay.LEFT);
		radioButton.setStyle("-fx-border-color: black");
		radioButton.setSelected(selectionStatus);
		radioButton.setPadding(new Insets(5, 5, 5, 5));
		radioButton.setFont(Font.font("Arial", FontWeight.BOLD, 20));
		radioButton.setPrefSize(300, 50);
		radioButton.setAlignment(Pos.CENTER);
		return radioButton;
	}
}

class RadioButtonListener1 implements EventHandler<ActionEvent> {
	
	private RadioButton radioButton;
	
	public RadioButtonListener1(RadioButton radioButton) {
		this.radioButton = radioButton;
	}

	@Override
	public void handle(ActionEvent event) {
		if(radioButton.isSelected()) {
			System.out.println(radioButton.getText() + " radio button is selected.");
		}
	}
	
}
