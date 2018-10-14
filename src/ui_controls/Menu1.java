package ui_controls;

import javafx.application.Application;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.*;
import javafx.event.*;

public class Menu1 extends Application {
	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) {
		// Create a pane and set its properties
		BorderPane root = new BorderPane();
		
		MenuBar menuBar = new MenuBar();
		Menu fileMenu = new Menu("File");
		
		MenuItem saveMenuItem = new MenuItem("Save");
		saveMenuItem.setOnAction(new MenuItemListener(saveMenuItem));
		
		MenuItem exitMenuItem = new MenuItem("Exit");
		exitMenuItem.setOnAction(new MenuItemListener(exitMenuItem));
		
		fileMenu.getItems().addAll(saveMenuItem, exitMenuItem);
		
		menuBar.getMenus().add(fileMenu);
		
		root.setTop(menuBar);
		
		// Create a scene and place the pane in the stage
		Scene scene = new Scene(root);
		primaryStage.setWidth(300);
		primaryStage.setHeight(200);
		primaryStage.setTitle("Title"); // Set the stage title
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

class MenuItemListener implements EventHandler<ActionEvent> {

	private MenuItem menuItem;
	
	public MenuItemListener(MenuItem menuItem) {
		this.menuItem = menuItem;
	}
	
	@Override
	public void handle(ActionEvent event) {
		System.out.println("You have selected the " + menuItem.getText() + " menu item");
	}
	
}

