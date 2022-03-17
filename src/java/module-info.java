module direct.trans {
	requires javafx.fxml;
	requires javafx.controls;
	requires javafx.graphics;
	requires slf4j.api;
	requires java.sql;

	exports resources;

	opens resources;
	opens edit;
	opens main;
}