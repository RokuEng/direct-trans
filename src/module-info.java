module direct.trans {
	requires javafx.fxml;
	requires javafx.controls;
	requires javafx.graphics;
	requires slf4j.api;
	requires java.sql;

	opens data;
	opens resources;
	opens edit;
	opens main;
}