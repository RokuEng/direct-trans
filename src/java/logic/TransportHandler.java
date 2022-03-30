package logic;

import data.Unit;
import data.transport.traits.Driveable;
import data.transport.traits.other.Plane;
import data.transport.traits.special.Bulldozer;
import data.transport.traits.special.Tractor;

import java.util.Scanner;

public class TransportHandler {

	public static World world = World.WorldFactory.generateWorld(World.WorldType.STANDARD);

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		while (true) {
			printWorld(world);
			try {
				String next = scan.next();

				if (next.equalsIgnoreCase("stop")) {
					break;
				}

				Unit unit = world.getUnit(next.substring(0,1));
				String action = next.substring(2,5);

				switch (action.toLowerCase()) {
					case "drv":
						if (unit instanceof Driveable) {
							Driveable driveable = (Driveable) unit;

							moveByPath(driveable,scan.nextLine());
						}
						break;
					case "fly":
						if (unit instanceof Plane) {
							Plane plane = (Plane) unit;

							plane.flyTo(scan.nextInt(),scan.nextInt());
						}
						break;
					case "dst":
						if (unit instanceof Bulldozer) {
							Bulldozer bulldozer = (Bulldozer) unit;

							destroyByPath(bulldozer, scan.nextLine());
						}
						break;
					case "tow":
						if (unit instanceof Tractor) {
							Tractor tractor = (Tractor) unit;

							tractor.towUnit(getNearUnit(tractor,scan.next()));
						}
						break;
					case "drp":
						if (unit instanceof Tractor) {
							Tractor tractor = (Tractor) unit;

							tractor.dropUnit();
						}
						break;
				}


			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("* * * * * *");
			}
			world.update();
		}

		scan.close();
	}

	private static void moveByPath(Driveable driveable, String string) {
		Scanner scan = new Scanner(string);
		try(scan) {
			while (scan.hasNext()) {
				switch (scan.next().toLowerCase()) {
					case "u":
						driveable.moveUp();
						break;
					case "d":
						driveable.moveDown();
						break;
					case "l":
						driveable.moveLeft();
						break;
					case "r":
						driveable.moveRight();
						break;
					case "ru":
						driveable.moveRightUp();
						break;
					case "rd":
						driveable.moveRightDown();
						break;
					case "lu":
						driveable.moveLeftUp();
						break;
					case "ld":
						driveable.moveLeftDown();
						break;
				}
			}
		}
	}

	private static void destroyByPath(Bulldozer bulldozer, String string) {
		Scanner scan = new Scanner(string);
		try(scan) {
			while (scan.hasNext()) {
				switch (scan.next().toLowerCase()) {
					case "u":
						bulldozer.destroyUp();
						break;
					case "d":
						bulldozer.destroyDown();
						break;
					case "l":
						bulldozer.destroyLeft();
						break;
					case "r":
						bulldozer.destroyRight();
						break;
					case "ru":
						bulldozer.destroyRightUp();
						break;
					case "rd":
						bulldozer.destroyRightDown();
						break;
					case "lu":
						bulldozer.destroyLeftUp();
						break;
					case "ld":
						bulldozer.destroyLeftDown();
						break;
				}
			}
		}
	}

	private static Unit getNearUnit(Unit unit, String direction) {

		int x = unit.getPos().getX();
		int y = unit.getPos().getY();

		switch (direction) {
			case "u":
				return world.getUnits()[y-1][x];
			case "d":
				return world.getUnits()[y+1][x];
			case "l":
				return world.getUnits()[y][x-1];
			case "r":
				return world.getUnits()[y][x+1];
			case "ru":
				return world.getUnits()[y-1][x+1];
			case "rd":
				return world.getUnits()[y+1][x+1];
			case "lu":
				return world.getUnits()[y-1][x-1];
			case "ld":
				return world.getUnits()[y+1][x-1];
		}
		throw new RuntimeException("Unsupported direction exception");
	}

	private static void printWorld(World world) {
		System.out.println(world);
	}
}
