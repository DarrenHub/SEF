package flow_pane;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.geometry.Orientation;
import javafx.stage.Stage;

public class ShowFlowPane extends Application {
	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) {
		// Create a pane and set its properties
		FlowPane pane = new FlowPane(Orientation.VERTICAL, 5, 15);// hGap=5,vGap = 5
		// FlowPane pane=new FlowPane(Orientation.HORIZONTAL,5,5);//hGap=5,vGap = 5
		pane.setPadding(new Insets(11, 12, 13, 14));
//		pane.setPadding(new Insets(30, 30, 30, 30));
		// Place nodes in the pane
		pane.getChildren().addAll(new Label("First Name:"), new TextField(), new Label("Last Name:"), new TextField(),
				new Label("Year of Birth:"));
		TextField tfMi = new TextField();
		tfMi.setPrefColumnCount(4);
		pane.getChildren().add(tfMi);
		// Create a scene and place it in the stage
		Scene scene = new Scene(pane, 300, 350);
		primaryStage.setTitle("ShowFlowPane"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}
}
