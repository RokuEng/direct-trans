package data.transport;

import data.Type;
import data.cargo.Goods;
import data.passanger.Creature;
import data.passanger.Human;
import data.transport.traits.normal.Bus;
import data.transport.traits.normal.Car;
import data.transport.traits.normal.SimpleCar;
import data.transport.units.GeneralPurposeCar;
import data.transport.units.Minibus;

import java.util.ArrayList;
import java.util.Arrays;

public class TransportHandler {
	public static void main(String[] args) {

		Human driver = new Human("Alex", 18,70.0,true, "Toyota");
		Human passenger = new Human("Jones", 17,65.0,false, "Lada");
		Human passenger2 = new Human("Billy", 23,80.0,true, "Kamaz");
		Human passenger3 = new Human("Zet", 14,40.0,false, "Kia");

		Car car = new GeneralPurposeCar(
			"Toyota",
			"Gate",
			"L1",
			"A111AA",
			Type.GENERAL_PURPOSE_CAR,
			1990,
			false,
			10,
			null,
			new double[]{0,0},
			null,
			null
		);

		Bus bus = new Minibus(
			"Toyota",
			"Gate",
			"L1",
			"A111AA",
			Type.MINIBUS,
			1990,
			false,
			10,
			null,
			new double[]{0,0},
			new ArrayList<>(),
			new ArrayList<>()
		);

		bus.addDriver(driver);
		System.out.println(bus.getPassengers());
		bus.addAllPassengers(passenger, passenger2, passenger3);
		System.out.println(bus.getPassenger());
	}
}
