package data.transport.traits.special;

import data.Unit;
import data.transport.traits.Driveable;
import data.transport.traits.Offroad;

public interface Tractor extends Driveable, Offroad {
	void dropUnit();
	void towUnit(Unit unit);
}
