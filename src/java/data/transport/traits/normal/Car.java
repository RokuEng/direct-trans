package data.transport.traits.normal;

import data.cargo.Goods;
import data.passanger.Creature;
import data.transport.traits.Driveable;

public interface Car extends Driveable {
	abstract public void addPassenger(Creature passenger);
	abstract public Creature getPassenger();
	abstract public void moveTo(double x, double y);
	abstract public void addGoods(Goods goods);
}
