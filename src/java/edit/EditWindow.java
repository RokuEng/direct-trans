package edit;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EditWindow {
	private Stage parent;

	public EditWindow(Stage parent) {
		this.parent = parent;
	}

	public void start() {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("EditStage.fxml"));
			Stage stage = new Stage();
			stage.setScene(new Scene(root));
			stage.setResizable(false);
			stage.initModality(Modality.WINDOW_MODAL);
			stage.initOwner(parent.getScene().getWindow());
			stage.show();
		} catch (Exception e) {
			Logger logger = LoggerFactory.getLogger(EditWindow.class);
			logger.error("Error at edit window creation", e);
			parent.close();
		}
	}
}
