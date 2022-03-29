package data.transport.traits.normal;

import data.cargo.Goods;
import data.passanger.Creature;

import java.util.ArrayList;
import java.util.List;

public interface Bus extends Car {
	abstract public void movesBetween(double xFrom, double yFrom, double xTo, double yTo);
	abstract public void movesBetweenCurrentAnd(double x, double y);
	abstract public void addAllPassengers(Creature... passenger);
	abstract public void addAllGoods(Goods... goods);
	abstract public List<Creature> getPassengers();
	abstract public List<Goods> getGoods();
}
