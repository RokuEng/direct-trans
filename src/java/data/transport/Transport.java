package data.transport;

import data.Unit;

public interface Transport extends Unit {
	String getMark();

	String getModel();

	String getCategory();

	String getCarNumber();

	String getTsType();

	int getProductionYear();

	boolean isHasTrailer();
}
