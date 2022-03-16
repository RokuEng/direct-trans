package application;

import data.Transport;
import io.database.Database;
import javafx.scene.Parent;
import javafx.stage.Stage;

import java.util.List;

public abstract class Application {
	private Parent mainStage;
	private Database database;

	abstract void startApplication();
	abstract void closeApplication();
	abstract void createEditStage();
	abstract void closeEditStage();
	abstract void saveTransport();

	abstract List<Transport> findTransports();
	abstract boolean updateTransports();
}
