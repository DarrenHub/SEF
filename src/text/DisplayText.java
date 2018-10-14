package text;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.FontPosture;

public class DisplayText extends Application {
	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) {
		Pane pane = new Pane(); // Create a pane to hold the texts
		pane.setPadding(new Insets(5, 5, 5, 5));
		Text text1 = new Text(20, 20, "Advanced Programming is Cool!");
		text1.setFont(Font.font("Courier", FontWeight.BOLD, FontPosture.ITALIC, 15));
		pane.getChildren().add(text1);
		Text text2 = new Text(60, 60, "PF is a prereq for AP\nand AP is a prereq for AA ");
		pane.getChildren().add(text2);
		Text text3 = new Text(100, 100, "AP is Hard");
		text3.setStrikethrough(true);
		pane.getChildren().add(text3);
		Text text4 = new Text(100, 120, "AP is Fun when you spend time");
		text4.setFill(Color.RED);
		text4.setUnderline(true);
		pane.getChildren().add(text4);
		Scene scene = new Scene(pane);
		primaryStage.setTitle("ShowText"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}
}
