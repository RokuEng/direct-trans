package data.transport.units;

import data.Unit;
import logic.Position;
import logic.World;

public abstract class SimpleUnit implements Unit {

	private Position pos;

	private double weight;

	private World world;

	private String symbol;

	@Override
	public void setWorld(World world) {
		this.world = world;
	}

	@Override
	public World getWorld() {
		return world;
	}

	@Override
	public double getWeight() {
		return weight;
	}

	@Override
	public String getSymbol() {
		return symbol;
	}

	@Override
	public Position getPos() {
		return pos;
	}

	@Override
	public void setPos(Position pos) {
		this.pos = pos;
	}

	public SimpleUnit(Position pos, double weight) {
		this.pos = pos;
		this.weight = weight;
	}
}
