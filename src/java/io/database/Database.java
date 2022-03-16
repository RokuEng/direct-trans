package io.database;

import data.Transport;

import java.util.List;

public interface Database {
	public boolean connect();
	public List<Transport> select();
	public void update();
}
