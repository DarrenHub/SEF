package key_event;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class KeyEvent2 extends Application {
	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) {
		// Create a pane and set its properties
		TextField textField = new TextField();
		textField.setPromptText("Enter keyword");
		textField.setFocusTraversable(false);
		
		//don't use this method
//		textField.setOnKeyPressed(e -> {
//			//System.out.println(e.getCharacter());
//			System.out.println("You typed: " + textField.getText());
//		});
		
		//this is the correct way
		textField.setOnKeyReleased(e -> {
			if(e.getCode().isLetterKey() || e.getCode().isDigitKey()) {
				System.out.println(textField.getText());	
			}
		});
		
		textField.setOnAction(e -> System.out.println("You have pressed Enter"));
		
		
		Button button = new Button("Search");
		BorderPane.setAlignment(button, Pos.BOTTOM_RIGHT);
		BorderPane borderPane = new BorderPane(textField, null, null, button, null);

		// Create a scene and place the pane in the stage
		Scene scene = new Scene(borderPane);
		primaryStage.setTitle("Key Event Demo 2"); // Set the stage title
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
