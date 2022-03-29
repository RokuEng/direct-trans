package data.transport.traits;

import data.Type;
import data.passanger.Human;
import data.transport.SimpleTransport;

public abstract class SimpleDriveable extends SimpleTransport implements Driveable {

	private int speed;

	private Human driver;

	private double[] from;

	@Override
	public String drive() {
		if (driver == null) {
			throw new RuntimeException("Transport have not driver");
		} else {
			return driver.canDrive() ? "Drivable drives. . ." : "Driver cant drive";
		}
	}

	@Override
	public void addDriver(Human driver) {
		if (this.driver != null) {
			throw new RuntimeException("Already have driver");
		} else {
			this.driver = driver;
		}
	}

	public boolean hasDriver() {
		return driver != null;
	}

	@Override
	public void addSpeed(int speed) {
		this.speed =+ speed;
	}

	@Override
	public void reduceSpeed(int speed) {
		this.speed =- speed;
	}

	@Override
	public void brake() {
		this.speed = 0;
	}

	public int getSpeed() {
		return speed;
	}

	public Human getDriver() {
		return driver;
	}

	@Override
	public double[] getPos() {
		return from;
	}

	@Override
	public void setPos(double[] pos) {
		this.from = pos;
	}

	public SimpleDriveable(String mark, String model, String category, String carNumber, Type tsType, int productionYear, boolean hasTrailer, int speed, Human driver, double[] from) {
		super(mark, model, category, carNumber, tsType, productionYear, hasTrailer);
		this.speed = speed;
		this.driver = driver;
		this.from = from;
	}
}
