package edit;

import application.Application;
import data.Attribute;
import data.Type;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import static data.Field.*;
import static edit.EditWindow.*;

public class EditController {

	private static Application app;

	public static void configure(Application app) {
		EditController.app = app;
	}

	@FXML
	private Label logField;

	@FXML
	private Button saveButton;

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
		carNumberField.textProperty().addListener(
			(observable, oldValue, newValue) -> {
				if (CURRENT_WINDOW.database.hasCarNumber(carNumberField.getText())) {
					logField.setText("Существующее ТС будет отредактировано!");
				} else {
					logField.setText("Текущий номер ТС доступен!");
				}
			});
		for (Type type : Type.getTypes()) {
			tsTypeBox.getItems().add(type.getText());
		}
	}

	@FXML
	public void onSaveButton(ActionEvent event) {
		boolean result = app.updateTransports(carNumberField.getText(),
			new Attribute(modelField.getText(), MODEL),
			new Attribute(categoryField.getText(),CATEGORY),
			new Attribute(markField.getText(), MARK),
			new Attribute(hasTrailerField.getText(), HAS_TRAILER),
			new Attribute(productionYearField.getText(),PRODUCTION_YEAR),
			new Attribute(String.valueOf(tsTypeBox.getValue()), TS_TYPE)
		);

		if (result) {
			logField.setText("Успех!");
		} else {
			logField.setText("Ошибка!");
		}
	}
}
