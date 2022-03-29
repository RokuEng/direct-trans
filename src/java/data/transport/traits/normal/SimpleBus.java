package data.transport.traits.normal;

import data.Type;
import data.cargo.Goods;
import data.passanger.Creature;
import data.passanger.Human;
import data.transport.traits.SimpleDriveable;

import java.util.Arrays;
import java.util.List;

public abstract class SimpleBus extends SimpleDriveable implements Bus {

	private List<Goods> cazes;
	private List<Creature> passengers;
	private double[] to;

	public List<Goods> getAllGoods() {
		return cazes;
	}

	public List<Creature> getPassengers() {
		return passengers;
	}

	@Override
	public void movesBetween(double xFrom, double yFrom, double xTo, double yTo) {
		moveTo(xFrom, yFrom);
		this.to = new double[]{xTo, yTo};
	}

	@Override
	public void movesBetweenCurrentAnd(double x, double y) {
		this.to = new double[]{x, y};
	}

	@Override
	public void addAllPassengers(Creature... passenger) {
		this.passengers.addAll(Arrays.asList(passenger));
	}

	@Override
	public void addAllGoods(Goods... goods) {
		this.cazes.addAll(Arrays.asList(goods));
	}

	@Override
	public void addPassenger(Creature passenger) {
		this.passengers.add(passenger);
	}

	@Override
	public void moveTo(double x, double y) {
		System.out.println("Bus moves to. . .");
		setPos(new double[]{x, y});
	}

	@Override
	public void addGoods(Goods goods) {
		this.cazes.add(goods);
	}

	@Override
	public Creature getPassenger() {
		throw new UnsupportedOperationException("Bus have List<Creature> of passangers");
	}

	public SimpleBus(String mark, String model, String category, String carNumber, Type tsType, int productionYear, boolean hasTrailer, int speed, Human driver, double[] from, List<Goods> cazes, List<Creature> passengers) {
		super(mark, model, category, carNumber, tsType, productionYear, hasTrailer, speed, driver, from);
		this.cazes = cazes;
		this.passengers = passengers;
	}
}
