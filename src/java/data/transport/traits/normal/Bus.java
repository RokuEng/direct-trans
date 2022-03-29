package data.transport.traits.normal;

import data.cargo.Goods;
import data.passanger.Creature;

public interface Bus extends Car {
	abstract public void movesBetween(double xFrom, double yFrom, double xTo, double yTo);
	abstract public void movesBetweenCurrentAnd(double x, double y);
	abstract public void addAllPassengers(Creature... passenger);
	abstract public void addAllGoods(Goods... goods);
}
