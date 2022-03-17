package main;

import application.JFXApplication;
import edit.EditWindow;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import utils.TransportGenerator;

public final class Main extends Application {
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("MainStage.fxml"));
		Controller.configure(new JFXApplication(root, null));
		Controller.start();

//		TransportGenerator.generate(800, "transport");
	}
}
