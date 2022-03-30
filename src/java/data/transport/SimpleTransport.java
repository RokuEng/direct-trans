package data.transport;

import data.Type;
import logic.World;

public abstract class SimpleTransport implements Transport {
	private String mark;
	private String model;
	private String category;
	private String carNumber;
	private Type tsType;
	private int productionYear;
	private boolean hasTrailer;
	private World world;
	private String symbol = " ";

	public SimpleTransport(String mark, String model, String category, String carNumber, Type tsType, int productionYear, boolean hasTrailer) {
		this.mark = mark;
		this.model = model;
		this.category = category;
		this.carNumber = carNumber;
		this.tsType = tsType;
		this.productionYear = productionYear;
		this.hasTrailer = hasTrailer;
	}

	@Override
	public String getMark() {
		return mark;
	}

	@Override
	public String getModel() {
		return model;
	}

	@Override
	public String getCategory() {
		return category;
	}

	@Override
	public String getCarNumber() {
		return carNumber;
	}

	@Override
	public String getTsType() {
		return tsType.getText();
	}

	@Override
	public int getProductionYear() {
		return productionYear;
	}

	@Override
	public boolean isHasTrailer() {
		return hasTrailer;
	}

	/* Methods to implement in subclass */

	@Override
	public String toString() {
		return "Transport{" +
			"mark='" + mark + '\'' +
			", model='" + model + '\'' +
			", category='" + category + '\'' +
			", carNumber='" + carNumber + '\'' +
			", tsType=" + tsType +
			", productionYear=" + productionYear +
			", hasTrailer=" + hasTrailer +
			'}';
	}

	@Override
	public void setWorld(World world) {
		this.world = world;
	}

	@Override
	public String getSymbol() {
		return symbol;
	}

	@Override
	public World getWorld() {
		return world;
	}
}
