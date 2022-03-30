package data.transport.units.playable;

import data.Type;
import data.transport.traits.Offroad;
import data.transport.units.SimpleDriveable;
import data.transport.units.cargo.Goods;
import data.transport.units.passanger.Creature;
import data.transport.traits.normal.Car;
import logic.Position;
import logic.World;

public class LightCar extends SimpleDriveable implements Car {

	public static final String symbol = "C";

	private Creature passenger;

	private Goods goods;

	@Override
	public Creature getPassenger() {
		return passenger;
	}

	@Override
	public void addPassenger(Creature passenger) {
		if (this.passenger != null) {
			System.out.println("Already have passenger");
		} else {
			this.passenger = passenger;
		}
	}

	@Override
	public void addGoods(Goods goods) {
		if (this.goods != null) {
			System.out.println("Already have goods");
		} else {
			this.goods = goods;
		}
	}

	@Override
	public String getSymbol() {
		return symbol;
	}

	public LightCar(String mark, String model, String category, String carNumber, Type tsType, int productionYear, boolean hasTrailer, double weight, Position pos, World world) {
		super(mark, model, category, carNumber, tsType, productionYear, hasTrailer, weight, pos, world);
	}


}
