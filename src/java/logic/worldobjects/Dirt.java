package logic.worldobjects;

import data.transport.Transport;
import data.transport.traits.Offroad;
import data.transport.traits.normal.Car;

public class Dirt extends Land {

	public static final int ID = 1;

	@Override
	public boolean canMoveThrough(Transport transport) {
		return transport instanceof Offroad;
	}

	@Override
	public double getMaxWeight() {
		return 1000;
	}

	@Override
	public String getSymbol() {
		return "`";
	}
}
