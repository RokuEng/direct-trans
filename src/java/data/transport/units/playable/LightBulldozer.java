package data.transport.units.playable;

import data.Type;
import data.transport.traits.special.Bulldozer;
import data.transport.units.SimpleDriveable;
import logic.Position;
import logic.World;

public class LightBulldozer extends SimpleDriveable implements Bulldozer {
	private void destroy(int x, int y) {
		if (super.getWorld().getMap()[y][x].canMoveThrough(this)) {
			getWorld().getUnits()[y][x] = null;
			setPos(new Position(x,y));
		}
	}

	@Override
	public void destroyUp() {
		int x = getPos().getX();
		int y = getPos().getY();
		destroy(x,y-1);
	}

	@Override
	public void destroyDown() {
		int x = getPos().getX();
		int y = getPos().getY();
		destroy(x,y+1);
	}

	@Override
	public void destroyLeftUp() {
		int x = getPos().getX();
		int y = getPos().getY();
		destroy(x-1,y-1);
	}

	@Override
	public void destroyLeft() {
		int x = getPos().getX();
		int y = getPos().getY();
		destroy(x-1,y);
	}

	@Override
	public void destroyLeftDown() {
		int x = getPos().getX();
		int y = getPos().getY();
		destroy(x-1,y+1);
	}

	@Override
	public void destroyRightUp() {
		int x = getPos().getX();
		int y = getPos().getY();
		destroy(x+1,y-1);
	}

	@Override
	public void destroyRight() {
		int x = getPos().getX();
		int y = getPos().getY();
		destroy(x+1,y);
	}

	@Override
	public void destroyRightDown() {
		int x = getPos().getX();
		int y = getPos().getY();
		destroy(x+1,y+1);
	}

	@Override
	public String getSymbol() {
		return "B";
	}

	public LightBulldozer(String mark, String model, String category, String carNumber, Type tsType, int productionYear, boolean hasTrailer, double weight, Position pos, World world) {
		super(mark, model, category, carNumber, tsType, productionYear, hasTrailer, weight, pos, world);
	}
}
