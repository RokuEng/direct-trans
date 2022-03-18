package main;

import application.JFXApplication;
import edit.EditWindow;
import io.database.PostgresSQL;
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
		PostgresSQL database = new PostgresSQL();
		Controller.configure(new JFXApplication(root, database));
		Controller.start();

//		TransportGenerator.generate(800, "transport");
	}
}
