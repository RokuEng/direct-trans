package data;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public enum Field {
	MARK("transport_mark"),
	MODEL("transport_model"),
	CATEGORY("transport_category"),
	CAR_NUMBER("transport_carNumber"),
	TS_TYPE("transport_tsType"),
	PRODUCTION_YEAR("transport_productionYear"),
	HAS_TRAILER("transport_hasTrailer"),
	;

	private static List<Field> fields = Arrays.asList(Field.class.getEnumConstants());
	private static HashMap<String, Field> map = new HashMap<>();

	static {
		for (Field field : fields) {
			map.put(field.getString(), field);
		}
	}

	private String string;

	Field(String s) {
		this.string = s;
	}

	public String getString() {
		return string;
	}
}
