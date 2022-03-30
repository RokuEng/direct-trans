package logic.worldobjects;

import data.transport.Transport;
import data.transport.traits.other.Ship;

public class Water implements WorldObject {

	public static final int ID = 3;

	@Override
	public boolean canMoveThrough(Transport transport) {
		return transport instanceof Ship;
	}

	@Override
	public double getMaxWeight() {
		return -1;
	}

	@Override
	public String getSymbol() {
		return "/";
	}
}
