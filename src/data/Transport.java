package data;

public final class Transport {
	private String mark;
	private String model;
	private String category;
	private String carNumber;
	private Type tsType;
	private int productionYear;
	private boolean hasTrailer;
	public Transport(String mark, String model, String category, String carNumber, Type tsType, int productionYear, boolean hasTrailer) {
		this.mark = mark;
		this.model = model;
		this.category = category;
		this.carNumber = carNumber;
		this.tsType = tsType;
		this.productionYear = productionYear;
		this.hasTrailer = hasTrailer;
	}

	public String getMark() {
		return mark;
	}

	public String getModel() {
		return model;
	}

	public String getCategory() {
		return category;
	}

	public String getCarNumber() {
		return carNumber;
	}

	public String getTsType() {
		return tsType.getText();
	}

	public int getProductionYear() {
		return productionYear;
	}

	public boolean isHasTrailer() {
		return hasTrailer;
	}

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
}
