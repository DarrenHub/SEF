package ui_controls;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TextArea1 extends Application {
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(final Stage primaryStage) {
		
		String longText = "The terrain along this stretch of the river was mostly flat, but in the immediate vicinity of the island, the land on the sunrise side was like a rumpled cloth, with hills and ridges and valleys. Among Lara’s people, there was a wooden baby’s crib, suitable for strapping to a cart, that had been passed down for generations. The island was shaped like that crib, longer than it was wide and pointed at the upriver end, where the flow had eroded both banks. The island was like a crib, and the group of hills on the sunrise side of the river were like old women mantled in heavy cloaks gathered to have a look at the baby in the crib—that was how Lara’s father had once described the lay of the land.";
		
		Group root = new Group();
		//final TextArea textArea = TextAreaBuilder.create().prefWidth(400).wrapText(true).build();
		TextArea textArea = new TextArea(longText);
		textArea.setPrefWidth(300);
		textArea.setWrapText(true);

		ScrollPane scrollPane = new ScrollPane(textArea);
		scrollPane.setFitToWidth(true);

		VBox vBox = new VBox(scrollPane);
		root.getChildren().add(vBox);
		primaryStage.setScene(new Scene(root));
		primaryStage.show();
	}

}
