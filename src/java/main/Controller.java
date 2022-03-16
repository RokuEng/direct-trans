package main;

import application.Application;

public class Controller {
	private static Application app;
	public static void configure(Application app) {
		Controller.app = app;
	}
}
