package main;

import application.Application;
import edit.EditWindow;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Controller {
	private static Application app;

	public static void configure(Application app) {
		Controller.app = app;
	}

	public static void start() {
		try {
			app.startApplication();
		} catch (Exception e) {
			Logger logger = LoggerFactory.getLogger(EditWindow.class);
			logger.error("Contoller isn't configurated error ", e);
		}
	}

	@FXML
	private Button selectButton;
	@FXML
	private Button editButton;
	@FXML
	private TableView<?> dataTable;

	@FXML
	private void onEditButton(ActionEvent event) {
		Logger logger = LoggerFactory.getLogger(EditWindow.class);
		logger.info("Open Edit button is pressed");
		app.createEditStage();
	}
}
