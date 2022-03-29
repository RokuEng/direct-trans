package data.transport.units;

import data.Type;
import data.cargo.Goods;
import data.passanger.Creature;
import data.passanger.Human;
import data.transport.traits.normal.SimpleCar;

public class GeneralPurposeCar extends SimpleCar {

	public GeneralPurposeCar(String mark, String model, String category, String carNumber, Type tsType, int productionYear, boolean hasTrailer, int speed, Human driver, double[] from, Goods goods, Creature passenger) {
		super(mark, model, category, carNumber, tsType, productionYear, hasTrailer, speed, driver, from, goods, passenger);
	}
}
