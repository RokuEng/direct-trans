package data.cargo;

public abstract class Cargo {
	private String cargo;
	private double weight;

	public String getCargo() {
		return cargo;
	}

	public double getWeight() {
		return weight;
	}

	public Cargo(String cargo, double weight) {
		this.cargo = cargo;
		this.weight = weight;
	}
}
