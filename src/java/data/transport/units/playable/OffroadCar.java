package data.transport.units.playable;

import data.Type;
import data.transport.traits.Offroad;
import logic.Position;
import logic.World;

public class OffroadCar extends LightCar implements Offroad {

	@Override
	public String getSymbol() {
		return "G";
	}

	public OffroadCar(String mark, String model, String category, String carNumber, Type tsType, int productionYear, boolean hasTrailer, double weight, Position pos, World world) {
		super(mark, model, category, carNumber, tsType, productionYear, hasTrailer, weight, pos, world);
	}
}
