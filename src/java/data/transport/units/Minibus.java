package data.transport.units;

import data.Type;
import data.cargo.Goods;
import data.passanger.Creature;
import data.passanger.Human;
import data.transport.traits.normal.SimpleBus;

import java.util.List;

public class Minibus extends SimpleBus {
	public Minibus(String mark, String model, String category, String carNumber, Type tsType, int productionYear, boolean hasTrailer, int speed, Human driver, double[] from, List<Goods> goods, List<Creature> passengers) {
		super(mark, model, category, carNumber, tsType, productionYear, hasTrailer, speed, driver, from, goods, passengers);
	}
}
