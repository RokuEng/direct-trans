package data.transport.traits.others;

import data.transport.traits.Driveable;

public interface Plane extends Driveable, Other  {
	abstract void flyTo(double x, double y);
}
