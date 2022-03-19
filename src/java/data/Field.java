package data;

import io.Access;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public enum Field {
	MARK(Access.getFieldString("mark")),
	MODEL(Access.getFieldString("model")),
	CATEGORY(Access.getFieldString("category")),
	CAR_NUMBER(Access.getFieldString("car_number")),
	TS_TYPE(Access.getFieldString("ts_type")),
	PRODUCTION_YEAR(Access.getFieldString("production_year")),
	HAS_TRAILER(Access.getFieldString("has_trailer")),
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
