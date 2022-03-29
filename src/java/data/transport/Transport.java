package data.transport;

public interface Transport {
	abstract public String getMark();

	abstract public String getModel();

	abstract public String getCategory();

	abstract public String getCarNumber();

	abstract public String getTsType();

	abstract public int getProductionYear();

	abstract public boolean isHasTrailer();
}
