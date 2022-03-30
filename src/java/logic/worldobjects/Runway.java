package logic.worldobjects;

import data.transport.Transport;
import data.transport.traits.Driveable;
import data.transport.traits.other.Plane;

public class Runway extends Land {
	public static final int ID = 5;

	@Override
	public String getSymbol() {
		return "H";
	}

	@Override
	public boolean canMoveThrough(Transport transport) {
		return transport instanceof Driveable || transport instanceof Plane;
	}
}
