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
			MapFactory.generateMap(10,
				0, 0, 1, 1, 1, 3, 3, 3, 1, 1,
				2, 2, 1, 1, 3, 3, 3, 1, 1, 1,
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
				add(new LightCar("","","","", Type.GENERAL_PURPOSE_CAR, 0, false,
					1000, new Position(0,0), null));
				add(new Boulder(new Position(0,4), 1000));
				add(new Boulder(new Position(0,5), 1000));
				add(new Boulder(new Position(0,6), 1000));
				add(new Boulder(new Position(1,5), 1000));
				add(new Boulder(new Position(1,6), 1000));
				add(new LightTractor("","","","", Type.GENERAL_PURPOSE_CAR, 0, false,
					1000, new Position(1,0), null));
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
			}
			throw new RuntimeException("Cant find object with specific id");
		}
	}
}
