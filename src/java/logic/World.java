package logic;

import data.Type;
import data.Unit;
import data.transport.units.border.Boulder;
import data.transport.units.playable.*;
import logic.worldobjects.*;

import java.util.ArrayList;

public class World {
	private WorldObject[][] map;

	private Unit[][] units;

	private boolean canFly;

	private World(WorldObject[][] map, Unit[][] units, boolean canFly) {
		this.map = map;
		this.units = units;
		this.canFly = canFly;
	}

	public WorldObject[][] getMap() {
		return map;
	}

	public Unit[][] getUnits() {
		return units;
	}

	public boolean isCanFly() {
		return canFly;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < map.length; i++) {
			sb.append("\n");
			for (int j = 0; j < map[0].length; j++) {
				if (units[i][j] != null) {
					sb.append(" " + units[i][j].getSymbol() + " ");
				} else {
					sb.append(" " + map[i][j].getSymbol() + " ");
				}
			}
		}

//		for (WorldObject[] line : map) {
//			sb.append("\n");
//			for (WorldObject object : line) {
//				sb.append(" " + object.getSymbol() + " ");
//			}
//		}

		return sb.toString();
	}

	public String toUnits() {
		StringBuilder sb = new StringBuilder();

		for (Unit[] line : units) {
			sb.append("\n");
			for (Unit unit : line) {
				if (unit != null) {
					sb.append(" " + unit.getSymbol() + " ");
				} else  {
					sb.append(" " + "." + " ");
				}
			}
		}

		return sb.toString();
	}

	public Unit getUnit(String symbol) {
		for (Unit[] line : units) {
			for (Unit unit : line) {
				if (unit != null) {
					if (unit.getSymbol().equals(symbol)) {
						return unit;
					}
				}
			}
		}
		throw new RuntimeException("Cannot find specific unit");
	}

	public void update() {
		Unit[][] toSet = new Unit[units.length][units[0].length];
		for (int i = 0; i < units.length; i++) {
			for (int j = 0; j < units[i].length; j++) {
				Unit unit = units[i][j];
				if (unit != null) {
					toSet[unit.getPos().getY()][unit.getPos().getX()] = unit;
				}
			}
		}
		units = toSet;
	}

	enum WorldType {
		STANDARD(
			MapFactory.generateMap(20,
				0, 0, 2, 2, 1, 3, 3, 3, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 3, 3,
				2, 2, 2, 2, 4, 4, 4, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 3, 3, 3,
				5, 5, 2, 2, 3, 3, 3, 1, 1, 2, 1, 1, 1, 1, 3, 3, 3, 3, 3, 1,
				5, 5, 2, 3, 3, 3, 1, 1, 1, 1, 2, 1, 3, 3, 3, 3, 3, 1, 1, 1,
				5, 5, 1, 3, 3, 3, 1, 1, 1, 1, 3, 4, 3, 3, 3, 1, 1, 1, 1, 1,
				1, 1, 1, 3, 3, 3, 1, 1, 3, 3, 3, 3, 2, 1, 1, 1, 1, 1, 1, 1,
				1, 1, 1, 1, 3, 3, 3, 3, 3, 3, 1, 1, 2, 1, 1, 1, 1, 1, 1, 1,
				3, 1, 1, 1, 3, 3, 3, 3, 3, 1, 1, 1, 2, 1, 1, 1, 1, 1, 1, 1,
				3, 3, 1, 1, 3, 3, 3, 3, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1, 1, 1,
				1, 3, 4, 3, 3, 3, 3, 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1, 1, 1,
				1, 1, 4, 3, 3, 3, 3, 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1, 1, 1,
				1, 1, 1, 3, 3, 3, 3, 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1, 1, 1,
				1, 1, 1, 1, 3, 3, 3, 3, 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1, 1,
				1, 1, 1, 1, 1, 3, 3, 3, 3, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1, 1,
				1, 1, 1, 1, 1, 1, 3, 3, 3, 1, 1, 1, 1, 2, 2, 2, 2, 1, 1, 1,
				1, 1, 1, 1, 1, 1, 3, 3, 3, 1, 1, 1, 1, 2, 1, 1, 1, 2, 2, 1,
				1, 1, 1, 1, 1, 1, 4, 4, 4, 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 2,
				1, 1, 1, 1, 1, 1, 1, 3, 3, 3, 1, 1, 1, 1, 2, 1, 5, 5, 1, 2,
				1, 0, 1, 1, 1, 1, 3, 3, 3, 3, 3, 1, 1, 1, 2, 2, 5, 5, 2, 2,
				0, 0, 1, 1, 1, 3, 3, 3, 3, 3, 3, 3, 1, 1, 2, 2, 5, 5, 2, 2
				),
			new ArrayList<>() {{
				add(new LightCar("","","","", Type.GENERAL_PURPOSE_CAR, 0, false,
					1000, new Position(0,0), null));
				add(new LightBus("","","","", Type.GENERAL_PURPOSE_CAR, 0, false,
					1000, new Position(1,0), null));
				add(new LightPlane("","","","", Type.GENERAL_PURPOSE_CAR, 0, false,
					1000, new Position(0,2), null));
				add(new OffroadCar("","","","", Type.GENERAL_PURPOSE_CAR, 0, false,
					1000, new Position(0,19), null));
				add(new LightTractor("","","","", Type.GENERAL_PURPOSE_CAR, 0, false,
					1000, new Position(1,19), null));
				add(new LightBulldozer("","","","", Type.GENERAL_PURPOSE_CAR, 0, false,
					1000, new Position(1,18), null));

				add(new Boulder(new Position(5,16), 1000));
				add(new Boulder(new Position(6,16), 1000));
				add(new Boulder(new Position(7,16), 1000));
				add(new Boulder(new Position(8,16), 1000));
				add(new Boulder(new Position(8,15), 1000));
				add(new Boulder(new Position(8,17), 1000));
				add(new Boulder(new Position(9,16), 1000));

				add(new Boulder(new Position(0,5), 1000));
				add(new Boulder(new Position(0,6), 1000));
				add(new Boulder(new Position(1,6), 1000));

				add(new Boulder(new Position(7,3), 1000));
				add(new Boulder(new Position(7,4), 1000));

				add(new Boulder(new Position(2,11), 1000));
				add(new Boulder(new Position(1,11), 1000));
				add(new Boulder(new Position(1,12), 1000));
				add(new Boulder(new Position(2,12), 1000));

				add(new Boulder(new Position(13,13), 1000));

			}},
			true
		),
		STANDARD_BUS(
			MapFactory.generateMap(10,
				0, 1, 1, 1, 1, 3, 3, 3, 1, 1,
				2, 1, 1, 1, 3, 3, 3, 1, 1, 1,
				2, 1, 1, 1, 3, 3, 3, 1, 1, 1,
				2, 1, 1, 3, 3, 3, 1, 1, 1, 1,
				2, 1, 1, 3, 3, 3, 1, 1, 1, 1,
				2, 1, 1, 3, 3, 3, 1, 1, 1, 1,
				1, 2, 1, 1, 3, 3, 3, 1, 2, 2,
				1, 1, 2, 2, 4, 4, 4, 2, 1, 1,
				1, 1, 1, 1, 3, 3, 3, 1, 1, 1,
				1, 1, 1, 3, 3, 3, 1, 1, 1, 1
			),
			new ArrayList<>() {{
				add(new LightBus("", "", "", "", Type.GENERAL_PURPOSE_BUS, 0, false,
					1000, new Position(0, 0), null) {
				});
			}},
			true
		),
		STANDARD_PLANE(
			MapFactory.generateMap(10,
				0, 1, 1, 1, 1, 3, 3, 3, 1, 1,
				2, 1, 1, 1, 3, 3, 3, 1, 1, 1,
				2, 1, 1, 1, 3, 3, 3, 1, 1, 1,
				2, 1, 1, 3, 3, 3, 1, 1, 1, 1,
				2, 1, 1, 3, 3, 3, 1, 1, 1, 1,
				2, 1, 1, 3, 3, 3, 1, 1, 1, 1,
				1, 2, 1, 1, 3, 3, 3, 1, 2, 2,
				1, 1, 2, 2, 4, 4, 4, 2, 1, 1,
				1, 1, 1, 1, 3, 3, 3, 1, 1, 1,
				1, 1, 1, 3, 3, 3, 1, 1, 1, 1
			),
			new ArrayList<>() {{
				add(new LightPlane("", "", "", "", Type.GENERAL_PURPOSE_BUS, 0, false,
					1000, new Position(0, 0), null) {
				});
			}},
			true
		),
		;

		private WorldObject[][] map;

		private Unit[][] units;

		private boolean canFly;

		WorldType(WorldObject[][] map, ArrayList<Unit> units, boolean canFly) {
			this.map = map;

			this.units = new Unit[map.length][map[0].length];

			for (Unit unit : units) {
				this.units[unit.getPos().getY()][unit.getPos().getX()] = unit;
			}

			this.canFly = canFly;
		}
	}

	static class WorldFactory {
		public static  World generateWorld(WorldType type) {

			World world = new World(type.map, type.units, type.canFly);

			for (Unit[] line : world.units) {
				for (Unit unit : line) {
					if (unit != null) {
						unit.setWorld(world);
					}
				}
			}

			return world;
		}
	}

	static class MapFactory {
		public static WorldObject[][] generateMap(int... objectId) {
			WorldObject[][] map = new WorldObject[objectId[0]][objectId[0]];

			int counter = 1;
			boolean sideSkipped = false;

			for (int i = 0; i < map.length; i++) {
				WorldObject[] line = map[i];
				for (int j = 0; j < line.length; j++) {
					line[j] = getObjectById(objectId[counter]);
					counter++;
				}
			}

			return map;
		}

		private static WorldObject getObjectById(int id) {
			switch (id) {
				case Land.ID:
					return new Land();
				case Dirt.ID:
					return new Dirt();
				case Asphalt.ID:
					return new Asphalt();
				case Water.ID:
					return new Water();
				case Bridge.ID:
					return new Bridge();
				case Runway.ID:
					return new Runway();
			}
			throw new RuntimeException("Cant find object with specific id");
		}
	}
}
