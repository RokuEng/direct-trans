package main;

import application.Application;
import data.Transport;
import data.Type;
import edit.EditWindow;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public final class Controller {
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
	private ComboBox tsTypeBox;

	@FXML
	private TextField modelField;

	@FXML
	private TextField markField;

	@FXML
	private TextField categoryField;

	@FXML
	private TextField carNumberField;

	@FXML
	private TextField productionYearField;

	@FXML
	private TextField hasTrailerField;

	@FXML
	public void initialize() {
		for (Type type : Type.getTypes()) {
			tsTypeBox.getItems().add(type.getText());
		}
	}

	@FXML
	private void onFindButton(ActionEvent event) {
		Logger logger = LoggerFactory.getLogger(EditWindow.class);
		logger.info("Find transport button is pressed");

		logger.info(
			modelField.getCharacters().toString() + " " +
			categoryField.getCharacters().toString() + " " +
			markField.getCharacters().toString() + " " +
			carNumberField.getCharacters().toString() + " " +
			hasTrailerField.getCharacters().toString() + " " +
			productionYearField.getCharacters().toString() + " " +
			tsTypeBox.getValue().toString()
		);

		List<Transport> transports = app.findTransports(
			modelField.getCharacters().toString(),
			categoryField.getCharacters().toString(),
			markField.getCharacters().toString(),
			carNumberField.getCharacters().toString(),
			hasTrailerField.getCharacters().toString(),
			productionYearField.getCharacters().toString(),
			tsTypeBox.getValue().toString()
		);
	}

	@FXML
	private void onEditButton(ActionEvent event) {
		Logger logger = LoggerFactory.getLogger(EditWindow.class);
		logger.info("Open Edit button is pressed");
		app.createEditStage();
	}
}
