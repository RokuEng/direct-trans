package data.transport.traits.specials;

import data.transport.Transport;
import data.transport.traits.Driveable;

public interface Tractor extends Driveable, Special {
	abstract void towTransport(Driveable driveable);
}
