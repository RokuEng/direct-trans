package io.database;

import data.Attribute;
import data.Field;
import data.Transport;
import data.Type;

import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import io.Access;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static data.Field.*;

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
			statement.setQueryTimeout(4);
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

			sb.append("select * from " + tableName + " where 1>0 and ");
			if(!model.isEmpty())
				sb.append(" transport_model = " + dbStyle(model) + " and ");
			if(!category.isEmpty())
				sb.append(" transport_category = " + dbStyle(category) + " and ");
			if(!mark.isEmpty())
				sb.append(" transport_mark = " + dbStyle(mark) + " and ");
			if(!carNumber.isEmpty())
				sb.append(" transport_carNumber = " + dbStyle(carNumber) + " and ");
			if(!hasTrailer.isEmpty())
				sb.append(" transport_hasTrailer = " + hasTrailer + " and ");
			if(!productionYear.isEmpty())
				sb.append(" transport_productionYear = " + productionYear + " and ");
			if(tsType!="null" && !tsType.equals(""))
				sb.append(" transport_tsType = " + dbStyle(tsType) + " and ");
			sb.append(" 1 > 0");

			Logger logger = LoggerFactory.getLogger(this.getClass());
			logger.info(sb.toString());

			ResultSet result = statement.executeQuery(sb.toString());

			while (result.next()) {
				list.add(new Transport(
					result.getString("transport_mark"),
					result.getString("transport_model"),
					result.getString("transport_category"),
					result.getString("transport_carNumber"),
					Type.getType(result.getString("transport_tsType")),
					result.getInt("transport_productionYear"),
					result.getBoolean("transport_hasTrailer")
					)
				);
			}

			return list;
		} catch (Exception e) {
			Logger logger = LoggerFactory.getLogger(PostgresSQL.class);
			logger.error("Error at database select operation", e);
			throw new RuntimeException();
		}
	}

	@Override
	public void update(String carNumber, Attribute... attributes) throws Exception {
		StringBuilder sb = new StringBuilder();
		sb.append("update " + tableName + " set ");

		for (Attribute p : attributes) {
			if (!p.getData().isBlank()) {
				sb.append(p.getField().getString() + " = " + dbStyle(p.getData()) + ",");
			}
		}

		sb.replace(sb.length()-1,sb.length(),"");
		sb.append(" where transport_carNumber = " + dbStyle(carNumber));

		Logger logger = LoggerFactory.getLogger(this.getClass());
		logger.info(sb.toString());
		statement.executeLargeUpdate(sb.toString());
	}

	@Override
	public void insert(String carNumber, Attribute... attributes) throws Exception {
		StringBuilder sb = new StringBuilder();
		sb.append("insert into " + tableName + " values ( ");
		sb.append(dbStyle(carNumber) + ",");

		for (Attribute p : attributes) {
			sb.append(dbStyle(p.getData()) + ",");
		}

		sb.replace(sb.length()-1,sb.length(),"");
		sb.append(")");

		Logger logger = LoggerFactory.getLogger(this.getClass());
		logger.info(sb.toString());
		statement.executeUpdate(sb.toString());
	}

	@Override
	public boolean hasCarNumber(String carNumber) {
		Logger logger = LoggerFactory.getLogger(PostgresSQL.class);
		try {
			logger.info("Entering hasCarNumber() method");
			ResultSet result = statement.executeQuery("select * from " + tableName + " where transport_carNumber = " + "\'" + carNumber + "\'");
			if (result.next()) {
				logger.info("Has number");
				return true;
			} else {
				logger.info("Has not number");
				return false;
			}
		} catch (Exception e) {
			logger.error("Error at database select operation", e);
			throw new RuntimeException();
		}
	}

	private String dbStyle(String s) {
		return "\'" + s + "\'";
	}
}
