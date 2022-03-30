package data.transport.traits;

import data.transport.units.passanger.Human;
import data.transport.Transport;

public interface Driveable extends Transport {
	void move(int x, int y);
	void moveUp();
	void moveDown();
	void moveLeft();
	void moveLeftUp();
	void moveLeftDown();
	void moveRight();
	void moveRightUp();
	void moveRightDown();
}
