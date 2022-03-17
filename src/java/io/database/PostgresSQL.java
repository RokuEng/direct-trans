package io.database;

import data.Transport;
import data.Type;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import io.Access;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PostgresSQL implements Database {

	private final String DB_USERNAME = Access.getDBUsername();
	private final String DB_PASSWORD = Access.getDBPassword();
	private final String DB_URL = Access.getDBUrl();

	private Connection connection;
	private Statement statement;
	private String tableName;

	@Override
	public void connect(String tableName) {
		try {
			connection = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
			statement = connection.createStatement();
			this.tableName = tableName;
		} catch (Exception e) {
			Logger logger = LoggerFactory.getLogger(PostgresSQL.class);
			logger.error("Error at database connection", e);
			throw new RuntimeException();
		}
	}

	@Override
	public List<Transport> select(String model, String category, String mark, String carNumber, String hasTrailer, String productionYear, String tsType) {
		try {
			List<Transport> list = new ArrayList<>();
			StringBuilder sb = new StringBuilder();

			sb.append("select * from " + tableName + " where ");
			if(!model.isEmpty())
				sb.append(" transport_model = " + model);
			if(!category.isEmpty())
				sb.append(" transport_category = " + category);
			if(!mark.isEmpty())
				sb.append(" transport_mark = " + mark);
			if(!carNumber.isEmpty())
				sb.append(" transport_carNumber = " + carNumber);
			if(!hasTrailer.isEmpty())
				sb.append(" transport_hasTrailer = " + hasTrailer);
			if(!productionYear.isEmpty())
				sb.append(" transport_productionYear = " + productionYear);
			if(!tsType.isEmpty())
				sb.append(" transport_tsType = " + tsType);

			ResultSet result = statement.executeQuery(sb.toString());

			while (result.next()) {
				list.add(new Transport(mark,model,category,carNumber,Type.getType(tsType),Integer.valueOf(productionYear),Boolean.valueOf(hasTrailer)));
			}

			return list;
		} catch (Exception e) {
			Logger logger = LoggerFactory.getLogger(PostgresSQL.class);
			logger.error("Error at database select operation", e);
			throw new RuntimeException();
		}
	}

	@Override
	public void update(String model, String category, String mark, String carNumber, String hasTrailer, String productionYear, String tsType) {

	}

	@Override
	public void insert(String model, String category, String mark, String carNumber, String hasTrailer, String productionYear, String tsType) throws Exception {
		Logger logger = LoggerFactory.getLogger(this.getClass());
//		logger.info("insert into " + tableName + " values ( " +
//			dbStyle(carNumber) + "," +
//			dbStyle(model) + "," +
//			dbStyle(category) + "," +
//			dbStyle(mark) + "," +
//			hasTrailer + "," +
//			productionYear + "," +
//			dbStyle(tsType) + " )"
//		);
		statement.executeUpdate("insert into " + tableName + " values ( " +
			dbStyle(carNumber) + "," +
			dbStyle(model) + "," +
			dbStyle(category) + "," +
			dbStyle(mark) + "," +
			hasTrailer + "," +
			productionYear + "," +
			dbStyle(tsType) + " )"
		);
	}

	private String dbStyle(String s) {
		return "\'" + s + "\'";
	}
}
