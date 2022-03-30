package data.transport.units.cargo;

import data.transport.units.SimpleUnit;
import data.transport.units.passanger.Human;
import logic.Position;

public class Goods extends SimpleUnit {
	private Human owner;

	public Human getOwner() {
		return owner;
	}

	public Goods(double weight, Human owner, Position pos) {
		super(pos,weight);
		this.owner = owner;
	}
}
