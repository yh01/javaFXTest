package application;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.text.Font;
import javafx.stage.Stage;



public class Main extends Application {
	@Override
	public void start(Stage stage) {
		stage.setTitle("Hello,JavaFX");
		stage.setWidth(540);
		stage.setHeight(220);

		Label label = new Label("Hello,JavaFX");
		label.setAlignment(Pos.CENTER);
		label.setFont(new Font(64));

		stage.setScene(new Scene(label));
		stage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
