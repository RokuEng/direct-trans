package data.transport.traits.specials;

import data.cargo.Cargo;

public interface Crane extends Special {
	abstract void liftCargo(Cargo cargo);
}
