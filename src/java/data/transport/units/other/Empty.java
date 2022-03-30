package data.transport.units.other;

import data.Unit;
import logic.Position;
import logic.World;

public class Empty implements Unit {
	@Override
	public double getWeight() {
		throw new UnsupportedOperationException();
	}

	@Override
	public Position getPos() {
		throw new UnsupportedOperationException();
	}

	@Override
	public void setPos(Position pos) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void setWorld(World world) {
		throw new UnsupportedOperationException();
	}

	@Override
	public World getWorld() {
		throw new UnsupportedOperationException();
	}

	@Override
	public String getSymbol() {
		throw new UnsupportedOperationException();
	}
}
