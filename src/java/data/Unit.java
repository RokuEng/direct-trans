package data;

import logic.Position;
import logic.World;

public interface Unit {
	double getWeight();
	Position getPos();
	void setPos(Position pos);
	void setWorld(World world);
	World getWorld();
	String getSymbol();
}
