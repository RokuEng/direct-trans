package main;

import application.Application;
import data.Attribute;
import data.transport.SimpleTransport;
import data.Type;
import edit.EditController;
import edit.EditWindow;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.Locale;

import static data.Field.*;

public final class Controller {
	private static Application app;

	public static void configure(Application app) {
		Controller.app = app;
	}

	public static void start() {
		try {
			EditController.configure(app);
			app.startApplication();
		} catch (Exception e) {
			Logger logger = LoggerFactory.getLogger(EditWindow.class);
			logger.error("Main controller isn't configured error ", e);
			throw new RuntimeException();
		}
	}

	@FXML
	private Button selectButton;

	@FXML
	private Button editButton;

	@FXML
	private TableColumn<SimpleTransport, String> markColumn;

	@FXML
	private TableColumn<SimpleTransport, String> modelColumn;

	@FXML
	private TableColumn<SimpleTransport, String> typeColumn;

	@FXML
	private TableColumn<SimpleTransport, String> productionYearColumn;

	@FXML
	private TableColumn<SimpleTransport, String> categoryColumn;

	@FXML
	private TableColumn<SimpleTransport, String> trailerColumn;

	@FXML
	private TableColumn<SimpleTransport, String> carNumberColumn;

	@FXML
	private TableView dataTable;

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

		markColumn.setCellValueFactory(new PropertyValueFactory("mark"));
		modelColumn.setCellValueFactory(new PropertyValueFactory("model"));
		typeColumn.setCellValueFactory(new PropertyValueFactory("tsType"));
		productionYearColumn.setCellValueFactory(new PropertyValueFactory("productionYear"));
		categoryColumn.setCellValueFactory(new PropertyValueFactory("category"));
		trailerColumn.setCellValueFactory(new PropertyValueFactory("hasTrailer"));
		carNumberColumn.setCellValueFactory(new PropertyValueFactory("carNumber"));

		for (Type type : Type.getTypes()) {
			tsTypeBox.getItems().add(type.getText());
		}
	}

	@FXML
	private void onFindButton(ActionEvent event) {
		Logger logger = LoggerFactory.getLogger(EditWindow.class);
		logger.info("Find transport button is pressed");

		List<SimpleTransport> transports = app.findTransports(
			new Attribute(modelField.getText(), MODEL),
			new Attribute(categoryField.getText(), CATEGORY),
			new Attribute(markField.getText(),MARK),
			new Attribute(carNumberField.getText(), CAR_NUMBER),
			new Attribute(hasTrailerField.getText(), HAS_TRAILER),
			new Attribute(productionYearField.getText(),PRODUCTION_YEAR),
			new Attribute(tsTypeBox.getValue() == null ? "" : tsTypeBox.getValue().toString(),TS_TYPE)
		);

		dataTable.refresh();
		dataTable.getItems().clear();
		for (SimpleTransport ts : transports) {
			dataTable.getItems().add(ts);
		}
	}

	@FXML
	private void onEditButton(ActionEvent event) {
		Logger logger = LoggerFactory.getLogger(EditWindow.class);
		logger.info("Open Edit button is pressed");
		app.createEditStage();
	}

	private String toBooleanString(String s) {
		switch (s.toLowerCase(Locale.ROOT)) {
			case "????????":
				return "true";
			default:
				return "false";
		}
	}
}
