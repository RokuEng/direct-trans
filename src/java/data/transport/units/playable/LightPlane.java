package data.transport.units.playable;

import data.Type;
import data.transport.traits.other.Plane;
import data.transport.units.SimpleDriveable;
import logic.Position;
import logic.World;

public class LightPlane extends SimpleDriveable implements Plane {
	@Override
	public void flyTo(int x, int y) {
		if (getWorld().isCanFly() && getWorld().getMap()[y-1][x-1].canMoveThrough(this)) {
			getPos().setX(x-1);
			getPos().setY(y-1);
		}
	}

	@Override
	public String getSymbol() {
		return "P";
	}

	public LightPlane(String mark, String model, String category, String carNumber, Type tsType, int productionYear, boolean hasTrailer, double weight, Position pos, World world) {
		super(mark, model, category, carNumber, tsType, productionYear, hasTrailer, weight, pos, world);
	}
}
