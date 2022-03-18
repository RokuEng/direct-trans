package application;

import data.Transport;
import data.Type;
import edit.EditWindow;
import io.database.Database;
import javafx.scene.Parent;
import javafx.stage.Stage;

import java.util.List;

public abstract class Application {

	protected Stage mainStage;
	protected Parent mainParent;
	protected EditWindow editWindow;
	protected Database database;

	public abstract void startApplication();
	public abstract void closeApplication();
	public abstract void createEditStage();
	public abstract void closeEditStage();
	public abstract void saveTransport();
	public abstract List<Transport> findTransports(String model, String category, String mark, String carNumber, String hasTrailer, String productionYear, String tsType);
	public abstract boolean updateTransports();
}
