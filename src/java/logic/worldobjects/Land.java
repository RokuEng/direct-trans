package logic.worldobjects;

import data.transport.Transport;
import data.transport.traits.Driveable;

public class Land implements WorldObject {

	public static final int ID = 0;

	@Override
	public boolean canMoveThrough(Transport transport) {
		return transport instanceof Driveable;
	}

	@Override
	public double getMaxWeight() {
		return -1;
	}

	@Override
	public String getSymbol() {
		return "X";
	}
}
