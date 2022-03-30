package data.transport.units.playable;

import data.Type;
import data.Unit;
import data.transport.traits.special.Tractor;
import data.transport.units.SimpleDriveable;
import logic.Position;
import logic.World;

public class LightTractor extends SimpleDriveable implements Tractor {

	public static final String symbol = "Y";

	private Unit unit;

	@Override
	public void move(int x, int y) {
		int oldX = getPos().getX();
		int oldY= getPos().getY();

		if (super.getWorld().getMap()[y][x].canMoveThrough(this) && super.getWorld().getUnits()[y][x] == null) {
			getPos().setY(y);
			getPos().setX(x);

			if (unit != null) {
				unit.getPos().setX(oldX);
				unit.getPos().setY(oldY);
			}
		}
	}

	@Override
	public void dropUnit() {
		this.unit = null;
	}

	@Override
	public void towUnit(Unit unit) {
		this.unit = unit;
	}

	@Override
	public String getSymbol() {
		return symbol;
	}

	public LightTractor(String mark, String model, String category, String carNumber, Type tsType, int productionYear, boolean hasTrailer, double weight, Position pos, World world) {
		super(mark, model, category, carNumber, tsType, productionYear, hasTrailer, weight, pos, world);
	}
}
