package data;

public class Transport {
	private String mark;
	private String model;
	private String category;
	private String carNumber;
	private String carType;
	private int productionYear;
	private boolean hasTrailer;
	public Transport(String mark, String model, String category, String carNumber, String carType, int productionYear, boolean hasTrailer) {
		this.mark = mark;
		this.model = model;
		this.category = category;
		this.carNumber = carNumber;
		this.carType = carType;
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

	public String getCarType() {
		return carType;
	}

	public int getProductionYear() {
		return productionYear;
	}

	public boolean isHasTrailer() {
		return hasTrailer;
	}
}
