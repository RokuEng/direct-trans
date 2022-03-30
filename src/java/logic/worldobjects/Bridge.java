package logic.worldobjects;

public class Bridge extends Land {

	public static final int ID = 4;

	@Override
	public double getMaxWeight() {
		return 3000;
	}

	@Override
	public String getSymbol() {
		return "T";
	}
}
