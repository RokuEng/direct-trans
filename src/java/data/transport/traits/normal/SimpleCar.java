package data.transport.traits.normal;

import data.Type;
import data.cargo.Goods;
import data.passanger.Creature;
import data.passanger.Human;
import data.transport.traits.SimpleDriveable;

public abstract class SimpleCar extends SimpleDriveable implements Car {
	private Goods goods;
	private Creature passenger;
	private double[] to;

	public Goods getGoods() {
		return goods;
	}

	@Override
	public Creature getPassenger() {
		return passenger;
	}

	@Override
	public void addPassenger(Creature passenger) {
		if (this.passenger != null) {
			throw new RuntimeException("Already have passanger");
		} else {
			this.passenger = passenger;
		}
	}

	public boolean hasPassenger() {
		return passenger != null;
	}

	@Override
	public void moveTo(double x, double y) {
		System.out.println("Car moves to. . .");
		setPos(new double[]{x,y});
	}

	@Override
	public void addGoods(Goods goods) {
		this.goods = goods;
	}

	public SimpleCar(String mark, String model, String category, String carNumber, Type tsType, int productionYear, boolean hasTrailer, int speed, Human driver, double[] from, Goods goods, Creature passenger) {
		super(mark, model, category, carNumber, tsType, productionYear, hasTrailer, speed, driver, from);
		this.goods = goods;
		this.passenger = passenger;
	}
}
