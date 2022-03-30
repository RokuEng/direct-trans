package data.transport.units;

import data.Type;
import data.transport.units.passanger.Human;
import data.transport.SimpleTransport;
import data.transport.traits.Driveable;
import logic.Position;
import logic.World;

public abstract class SimpleDriveable extends SimpleTransport implements Driveable {
	private double weight;
	private Position pos;

	@Override
	public double getWeight() {
		return weight;
	}

	@Override
	public Position getPos() {
		return pos;
	}

	@Override
	public void setPos(Position pos) {
		this.pos = pos;
	}

	@Override
	public void move(int x, int y) {
		if (super.getWorld().getMap()[y][x].canMoveThrough(this) && super.getWorld().getUnits()[y][x] == null) {
			pos.setY(y);
			pos.setX(x);
		}
	}

	@Override
	public void moveUp() {
		int y = pos.getY();
		int x = pos.getX();
		move(x, y-1);
	}

	@Override
	public void moveDown() {
		int y = pos.getY();
		int x = pos.getX();
		move(x, y+1);
	}

	@Override
	public void moveLeft() {
		int y = pos.getY();
		int x = pos.getX();
		move(x-1,y);
	}

	@Override
	public void moveLeftUp() {
		int y = pos.getY();
		int x = pos.getX();
		move(x-1,y-1);
	}

	@Override
	public void moveLeftDown() {
		int y = pos.getY();
		int x = pos.getX();
		move(x-1,y+1);
	}

	@Override
	public void moveRight() {
		int y = pos.getY();
		int x = pos.getX();
		move(x+1,y);
	}

	@Override
	public void moveRightUp() {
		int y = pos.getY();
		int x = pos.getX();
		move(x+1,y-1);
	}

	@Override
	public void moveRightDown() {
		int y = pos.getY();
		int x = pos.getX();
		move(x+1, y+1);
	}

	public SimpleDriveable(String mark, String model, String category, String carNumber, Type tsType, int productionYear, boolean hasTrailer, double weight, Position pos, World world) {
		super(mark, model, category, carNumber, tsType, productionYear, hasTrailer);
		this.weight = weight;
		this.pos = pos;
	}
}
