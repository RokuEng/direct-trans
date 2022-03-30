package data.transport.traits.other;

import data.transport.units.cargo.Goods;
import data.transport.units.passanger.Creature;
import data.transport.traits.Driveable;

import java.util.List;

public interface Ship extends Driveable {
	void addAllPassengers(Creature... passenger);
	void addAllGoods(Goods... goods);
	List<Creature> getPassengers();
	List<Goods> getGoods();
}
