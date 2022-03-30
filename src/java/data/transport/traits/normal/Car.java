package data.transport.traits.normal;

import data.transport.units.cargo.Goods;
import data.transport.units.passanger.Creature;
import data.transport.traits.Driveable;

public interface Car extends Driveable {
	void addPassenger(Creature passenger);
	Creature getPassenger();
	void addGoods(Goods goods);
}
