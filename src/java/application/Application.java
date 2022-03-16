package application;

import data.Transport;
import edit.EditWindow;
import io.database.Database;
import javafx.scene.Parent;
import javafx.stage.Stage;

import java.util.List;

public abstract class Application {

	protected Stage mainStage;
	protected Parent mainParent;
	protected EditWindow editWindow;
	private Database database;

	public abstract void startApplication();
	public abstract void closeApplication();
	public abstract void createEditStage();
	public abstract void closeEditStage();
	public abstract void saveTransport();
	public abstract List<Transport> findTransports();
	public abstract boolean updateTransports();
}
