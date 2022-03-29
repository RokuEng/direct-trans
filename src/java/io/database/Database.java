package io.database;

import data.Attribute;
import data.transport.SimpleTransport;

import java.util.List;

public interface Database {
	public void connect(String tableName);
	public List<SimpleTransport> select(Attribute... attributes);
	public void update(String carNumber, Attribute... attributes) throws Exception;
	public void insert(String carNumber, Attribute... attributes) throws Exception;
	public boolean hasCarNumber(String carNumber);
}
