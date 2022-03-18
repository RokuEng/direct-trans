package data;

import java.util.*;

public enum Type {
	EMPTY(""),
	GENERAL_PURPOSE_CAR("Легковой автомобиль общего назначения"),
	SPECIAL_PASSENGER_CAR("Специальный легковой автомобиль"),
	GENERAL_PURPOSE_TRUCK("Грузовой автомобиль общего назначения"),
	SPECIAL_TRUCK("Специальный грузовой автомобиль"),
	UTILITY_VEHICLE("Грузопассажирский автомобиль"),
	TRACTOR_VEHICLE("Автомобиль-тягач"),
	TRUCK_TRACTOR("Седельный тягач"),
	GENERAL_PURPOSE_BUS("Автобус общего назначения"),
	SPECIAL_BUS("Специальный автобус"),
	ARTICULATED_BUS("Сочлененный автобус"),
	MINIBUS("Микроавтобус"),
	OTHER("Прочее");

	private final String text;

	public String getText() {
		return text;
	}

	private Type(String text) {
		this.text = text;
	}

	private static List<Type> types = Arrays.asList(Type.class.getEnumConstants());
	private static HashMap<String, Type> map = new HashMap<>();

	static {
		for (Type type : types) {
			map.put(type.getText(), type);
		}
	}

	public static List<Type> getTypes() {
		return Collections.unmodifiableList(types);
	}

	public static Type getType(String text) {
		return map.get(text.equals("null") ? "" : text);
	}
}
