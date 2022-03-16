package application;

import data.Transport;
import edit.EditWindow;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.Window;

import java.util.List;

public final class JFXApplication extends Application{
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
	public List<Transport> findTransports() {
		return null;
	}

	@Override
	public boolean updateTransports() {
		return false;
	}

	public JFXApplication(Parent mainParent) {
		super.mainParent = mainParent;
	}
}
