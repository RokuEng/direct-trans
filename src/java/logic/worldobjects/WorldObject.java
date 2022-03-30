package logic.worldobjects;

import data.transport.Transport;

public interface WorldObject {
	boolean canMoveThrough(Transport transport);
	double getMaxWeight();
	String getSymbol();
}
