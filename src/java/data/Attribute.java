package data;

public class Attribute {
	private String data;
	private Field field;

	public Attribute(String string, Field field) {
		this.data = string;
		this.field = field;
	}

	public String getData() {
		return data;
	}

	public Field getField() {
		return field;
	}

	@Override
	public String toString() {
		return "Attribute{" +
			"data='" + data + '\'' +
			", field=" + field +
			'}';
	}
}
