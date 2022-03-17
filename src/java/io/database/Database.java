package io.database;

import data.Transport;
import data.Type;

import java.sql.SQLException;
import java.util.List;

public interface Database {
	public void connect(String tableName);
	public List<Transport> select(String model, String category, String mark, String carNumber, String hasTrailer, String productionYear, String tsType);
	public void update(String model, String category, String mark, String carNumber, String hasTrailer, String productionYear, String tsType);
	public void insert(String model, String category, String mark, String carNumber, String hasTrailer, String productionYear, String tsType) throws Exception;
}
