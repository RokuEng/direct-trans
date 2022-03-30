package data.transport.units.playable;

import data.Type;
import data.transport.units.SimpleDriveable;
import data.transport.units.cargo.Goods;
import data.transport.units.passanger.Creature;
import data.transport.traits.normal.Bus;
import logic.Position;
import logic.World;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LightBus extends SimpleDriveable implements Bus {

	public static final String symbol = "B";

	List<Creature> passengers = new ArrayList<>();
	List<Goods> goods = new ArrayList<>();

	@Override
	public void addAllPassengers(Creature... passenger) {
		this.passengers.addAll(Arrays.asList(passenger));
	}

	@Override
	public void addAllGoods(Goods... goods) {
		this.goods.addAll(Arrays.asList(goods));
	}

	@Override
	public List<Creature> getPassengers() {
		return Collections.unmodifiableList(passengers);
	}

	@Override
	public List<Goods> getGoods() {
		return Collections.unmodifiableList(goods);
	}

	@Override
	public String getSymbol() {
		return symbol;
	}

	public LightBus(String mark, String model, String category, String carNumber, Type tsType, int productionYear, boolean hasTrailer, double weight, Position pos, World world) {
		super(mark, model, category, carNumber, tsType, productionYear, hasTrailer, weight, pos, world);
	}
}
