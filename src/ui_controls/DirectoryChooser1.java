package ui_controls;
import javafx.application.Application;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.*;
import javafx.event.*;
import java.io.*;

public class DirectoryChooser1 extends Application {
	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) {
		// Create a pane and set its properties
		BorderPane root = new BorderPane();
		
		Button button = new Button("Choose Folder to Save File");
		button.setOnAction(new DirectoryChooser1Listener(primaryStage));
		
		root.setCenter(button);
		
		// Create a scene and place the pane in the stage
		Scene scene = new Scene(root);
		primaryStage.setTitle("Directory Chooser Example 1"); // Set the stage title
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

class DirectoryChooser1Listener implements EventHandler<ActionEvent> {

	private Stage primaryStage;
	
	public DirectoryChooser1Listener(Stage stage) {
		primaryStage = stage;
	}
	
	@Override
	public void handle(ActionEvent event) {
		DirectoryChooser dirChooser = new DirectoryChooser();
		dirChooser.setTitle("Select a folder...");
		File selectedDir = dirChooser.showDialog(primaryStage);
//		String selectedDirPath = dirChooser.showDialog(primaryStage).getAbsolutePath();
//		System.out.println(selectedDir.getAbsolutePath());
		writeToFile(selectedDir.getAbsolutePath(), "temp.txt");
	}
	
	private void writeToFile(String absolutePath, String fileName) {
		PrintWriter writer;
		try {
			writer = new PrintWriter(absolutePath + "/" + fileName, "UTF-8");
			writer.println("The first line");
			writer.println("The second line");
			writer.close();
			System.out.println("File " + fileName + " has been saved to " + absolutePath);
		} catch (FileNotFoundException | UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}

