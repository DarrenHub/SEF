package mouse_event;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.effect.DropShadow;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MouseEvent1 extends Application {
	DropShadow shadow = new DropShadow();

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) {
		Scene scene = new Scene(new Group());
		stage.setTitle("Button Sample");
		stage.setWidth(300);
		stage.setHeight(190);

		VBox vbox = new VBox();
		vbox.setLayoutX(20);
		vbox.setLayoutY(20);

		final Button button1 = new Button("Accept");

		//the first way
		button1.setOnMouseEntered(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) {
				Object source = event.getSource();
				if(source instanceof Button) {
					button1.setEffect(shadow);
					System.out.println("Mouse is over button " + button1.getText());
				}
			} 
		});
		
		//the second way
//		button1.addEventHandler(MouseEvent.MOUSE_ENTERED, new EventHandler<MouseEvent>() {
//			@Override
//			public void handle(MouseEvent e) {
//				button1.setEffect(shadow);
//				System.out.println("Mouse is over button " + button1.getText());
//			}
//		});
		
		//the first way
		button1.setOnMouseExited(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) {
				button1.setEffect(null);
				System.out.println("Mouse exits button " + button1.getText());
			}
		});

		//the second way
//		button1.addEventHandler(MouseEvent.MOUSE_EXITED, new EventHandler<MouseEvent>() {
//			@Override
//			public void handle(MouseEvent e) {
//				button1.setEffect(null);
//				System.out.println("Mouse exits button " + button1.getText());
//			}
//		});

		vbox.getChildren().add(button1);
		vbox.setSpacing(10);
		((Group) scene.getRoot()).getChildren().add(vbox);
		stage.setTitle("Mouse Event Demo 1");
		stage.setScene(scene);
		stage.show();
	}
}
