package logic;

import data.Unit;
import data.transport.traits.Driveable;
import data.transport.traits.other.Plane;
import data.transport.traits.special.Bulldozer;
import data.transport.traits.special.Tractor;
import data.transport.units.border.Boulder;
import data.transport.units.playable.*;
import logic.worldobjects.*;

import java.util.Scanner;

public class TransportHandler {

	public static World world = World.WorldFactory.generateWorld(World.WorldType.STANDARD);

	public static void main(String[] args) {

		System.out.println("____________________Направления____________________");
		System.out.println("u - Вверх");
		System.out.println("d - Вниз");
		System.out.println("l - Влево");
		System.out.println("lu - Влево вверх");
		System.out.println("ld - Влево вниз");
		System.out.println("r - Вправо");
		System.out.println("ru - Вправо вверх");
		System.out.println("rd - Вправо вниз");
		System.out.println();
		System.out.println("____________________Управление____________________");
		System.out.println("Для управления техникой нужно ввести символ техники, двоеточие и команду, пример: ");
		System.out.println("C:drv r r r r r - Легковой автомобиль попытается поехать вправо пять раз");
		System.out.println();
		System.out.println("____________________Общие команды____________________");
		System.out.println("*:drv [Направление1] ... [НаправлениеN]");
		System.out.println();
		System.out.println("____________________Мир____________________");
		System.out.println("| " + new Asphalt().getSymbol() + " | - Дорога (для любых транспортных средств)");
		System.out.println("| " + new Dirt().getSymbol() + " | - Земля (только для внедорожников)");
		System.out.println("| " + new Water().getSymbol() + " | - Вода (непреодолимая преграда)");
		System.out.println("| " + new Bridge().getSymbol() + " | - Мост (аналог Дороги для движения над водой)");
		System.out.println("| " + new Land().getSymbol() + " | - Абсолютная позиция");
		System.out.println("| " + new Runway().getSymbol() + " | - Взлётно-посадочная полоса");
		System.out.println();
		System.out.println("____________________Объекты____________________");
		System.out.println("| " + new Boulder(null,0).getSymbol() + " | - Булыжник, мешает передвижению");
		System.out.println("| " + LightCar.symbol + " | - Легковой автомобиль");
		System.out.println("| " + OffroadCar.symbol + " | - Внедорожный автомобиль");
		System.out.println("| " + LightBus.symbol + " | - Автобус");
		System.out.println("| " + LightBulldozer.symbol + " | - Бульдозер ");
		System.out.println(LightBulldozer.symbol + ":dst [Направление1] ... [НаправлениеN] - уничтожить объект");
		System.out.println("| " + LightPlane.symbol + " | - Самолёт (Требует взлётно-посадочную полосу для перелёта)");
		System.out.println(LightPlane.symbol + ":fly [x] [y] - Перелететь на точку {x;y}. Отсчёт от левого верхнего края {1;1}");
		System.out.println("| " + LightTractor.symbol + " | - Трактор");
		System.out.println(LightTractor.symbol + ":tow [Направление] - подцепить объект по направлению");
		System.out.println(LightTractor.symbol + ":drp - отцепить объект");
		System.out.println();

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
