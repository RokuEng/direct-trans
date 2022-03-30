package data.transport.traits.other;

import data.transport.Transport;
import data.transport.traits.Driveable;

public interface Plane extends Transport {
	void flyTo(int x, int y);
}
