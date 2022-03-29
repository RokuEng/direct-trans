package data.transport.traits.specials;

import data.cargo.Cargo;
import data.transport.Transport;
import data.transport.traits.Driveable;

public interface Truck extends Driveable, Special {
	abstract void addCargo(Cargo cargo);
	abstract void loadOut();
}
