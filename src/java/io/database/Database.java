package io.database;

import data.Attribute;
import data.Transport;

import java.util.List;

public interface Database {
	public void connect(String tableName);
	public List<Transport> select(String model, String category, String mark, String carNumber, String hasTrailer, String productionYear, String tsType);
	public void update(String carNumber, Attribute... attributes) throws Exception;
	public void insert(String carNumber, Attribute... attributes) throws Exception;
	public boolean hasCarNumber(String carNumber);
}
