package data.transport.traits.special;

import data.transport.traits.Driveable;
import data.transport.traits.Offroad;

public interface Bulldozer extends Driveable, Offroad {
	void destroyUp();
	void destroyDown();
	void destroyLeftUp();
	void destroyLeft();
	void destroyLeftDown();
	void destroyRightUp();
	void destroyRight();
	void destroyRightDown();
}
