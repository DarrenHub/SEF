package grid_pane;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class RegistrationPane extends Application {
	@Override // Override the start in the Application
	public void start(Stage primaryStage) {
		// Create a pane and set its properties
		GridPane pane = new GridPane();
		pane.setAlignment(Pos.CENTER);
		pane.setGridLinesVisible(true);
		pane.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
		pane.setHgap(5.5);
		pane.setVgap(5.5);

		// Place nodes in the pane
		pane.add(new Label("First Name:"), 0, 0);
		pane.add(new TextField(), 1, 0);
		pane.add(new Label("Surname:"), 0, 1);
		pane.add(new TextField(), 1, 1);
		pane.add(new Label("Username:"), 0, 2);
		pane.add(new TextField(), 1, 2);
		pane.add(new Label("Password:"), 0, 3);
		pane.add(new PasswordField(), 1, 3);
		Button btAdd = new Button("Register");
		pane.add(btAdd, 1, 4);
		// Create a scene and place it in the stage
		Scene scene = new Scene(pane);
		primaryStage.setTitle("ShowGridPane");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
    public static void main(String[] args) {
        Application.launch(args);
    }
}
