package data.transport.traits.specials;

import data.transport.traits.Driveable;

public interface Bulldozer extends Driveable, Special {
	abstract void destroyBarrier();
}
