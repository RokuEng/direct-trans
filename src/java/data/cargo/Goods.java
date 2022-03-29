package data.cargo;

import data.passanger.Human;

public class Goods extends Cargo {
	private Human owner;

	public Human getOwner() {
		return owner;
	}

	public Goods(String cargo, double weight, Human owner) {
		super(cargo, weight);
		this.owner = owner;
	}
}
