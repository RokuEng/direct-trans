package data.transport.units.border;

import data.Unit;
import data.transport.units.SimpleUnit;
import logic.Position;
import logic.World;

public class Boulder extends SimpleUnit implements Unit {

	@Override
	public String getSymbol() {
		return "n";
	}

	public Boulder(Position pos, double weight) {
		super(pos, weight);
	}
}
