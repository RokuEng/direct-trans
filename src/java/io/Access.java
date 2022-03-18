package io;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import resources.ResourceAnchor;

import java.io.FileInputStream;
import java.util.Properties;

public final class Access {
	public static String getDBUsername() {
		try {
			Properties AccessProps = new Properties();
			AccessProps.load(ResourceAnchor.class.getClassLoader().getResourceAsStream("resources/properties.properties"));
			return String.valueOf(AccessProps.getProperty("db_user"));
		} catch (Exception e) {
			Logger logger = LoggerFactory.getLogger(Access.class);
			logger.error("Error at properties reading", e);
			throw new RuntimeException();
		}
	}

	public static String getDBPassword() {
		try {
			Properties AccessProps = new Properties();
			AccessProps.load(ResourceAnchor.class.getClassLoader().getResourceAsStream("resources/properties.properties"));
			return String.valueOf(AccessProps.getProperty("db_password"));
		} catch (Exception e) {
			Logger logger = LoggerFactory.getLogger(Access.class);
			logger.error("Error at properties reading", e);
			throw new RuntimeException();
		}
	}

	public static String getDBUrl() {
		try {
			Properties AccessProps = new Properties();
			AccessProps.load(ResourceAnchor.class.getClassLoader().getResourceAsStream("resources/properties.properties"));
			return String.valueOf(AccessProps.getProperty("db_url"));
		} catch (Exception e) {
			Logger logger = LoggerFactory.getLogger(Access.class);
			logger.error("Error at properties reading", e);
			throw new RuntimeException();
		}
	}
}
