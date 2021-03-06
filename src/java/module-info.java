module direct.trans {
	requires javafx.fxml;
	requires javafx.controls;
	requires javafx.graphics;
	requires slf4j.api;
	requires java.sql;

	exports resources;

	opens data;
	opens resources;
	opens edit;
	opens main;
	opens data.transport;
	opens data.transport.units;
	opens logic;
	opens data.transport.units.playable;
	opens data.transport.units.other;
	opens data.transport.units.border;
}