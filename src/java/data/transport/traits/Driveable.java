package data.transport.traits;

import data.passanger.Human;
import data.transport.Transport;

public interface Driveable extends Transport {
	public abstract String drive();
	abstract public void addDriver(Human driver);
	abstract public void addSpeed(int speed);
	abstract public void reduceSpeed(int speed);
	abstract public void brake();
	abstract double[] getPos();
	abstract void setPos(double[] pos);
}
