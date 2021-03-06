package data.transport.units.other;

import data.Type;
import data.transport.SimpleTransport;
import logic.Position;

public class SerializableTransport extends SimpleTransport {

	public SerializableTransport(SimpleTransport transport) {
		super(transport.getMark(), transport.getModel(), transport.getCategory(), transport.getCarNumber(), Type.getType(transport.getTsType()), transport.getProductionYear(), transport.isHasTrailer());
	}

	public SerializableTransport(String mark, String model, String category, String carNumber, Type tsType, int productionYear, boolean hasTrailer) {
		super(mark, model, category, carNumber, tsType, productionYear, hasTrailer);
	}

	@Override
	public double getWeight() {
		throw new UnsupportedOperationException();
	}

	@Override
	public Position getPos() {
		throw new UnsupportedOperationException();
	}

	@Override
	public void setPos(Position pos) {
		throw new UnsupportedOperationException();
	}
}
