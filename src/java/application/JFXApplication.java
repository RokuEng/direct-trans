package application;

import data.Transport;
import data.Type;
import edit.EditWindow;
import io.database.Database;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.Window;

import java.util.List;

public final class JFXApplication extends Application {
	@Override
	public void startApplication() {
		Stage stage = new Stage();
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
		EditWindow editWindow = new EditWindow(mainStage);
		super.editWindow = editWindow;
		editWindow.start();
	}

	@Override
	public void closeEditStage() {
		editWindow.close();
	}

	@Override
	public void saveTransport() {

	}

	@Override
	public List<Transport> findTransports(String model, String category, String mark, String carNumber, String hasTrailer, String productionYear, String tsType) {
		return database.select(model, category, mark, carNumber, hasTrailer, productionYear, tsType);
	}


	@Override
	public boolean updateTransports() {
		return false;
	}

	public JFXApplication(Parent mainParent, Database database) {
		super.database = database;
		super.mainParent = mainParent;
	}
}
