package application;

import data.Attribute;
import data.Transport;
import edit.EditWindow;
import io.database.Database;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public final class JFXApplication extends Application {
	@Override
	public void startApplication() {
		Stage stage = new Stage();
		database.connect("transport");
		stage.setScene(new Scene(mainParent));
		stage.setResizable(false);
		stage.show();
		mainStage = stage;
	}

	@Override
	public void closeApplication() {
		mainStage.close();
	}

	@Override
	public void createEditStage() {
		EditWindow editWindow = new EditWindow(mainStage, database);
		super.editWindow = editWindow;
		editWindow.start();
	}

	@Override
	public void closeEditStage() {
		editWindow.close();
	}

	@Override
	public void saveTransport() {
		throw new UnsupportedOperationException();
	}

	@Override
	public List<Transport> findTransports(Attribute... attributes) {
		return database.select(attributes);
	}


	@Override
	public boolean updateTransports(String carNumber, Attribute... attributes) {
		try {
			if (database.hasCarNumber(carNumber)) {
				database.update(carNumber,attributes);
			} else {
				database.insert(carNumber,attributes);
			}
			return true;
		} catch (Exception e) {
			Logger logger = LoggerFactory.getLogger(this.getClass());
			logger.error("Error at database update operation", e);
			return false;
		}
	}

	@Override
	public boolean hasCarNumber(String carNumber) {
		return database.hasCarNumber(carNumber);
	}

	public JFXApplication(Parent mainParent, Database database) {
		super.database = database;
		super.mainParent = mainParent;
	}
}
