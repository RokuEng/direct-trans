package data.passanger;

public abstract class Creature {
	private String name;

	private int age;

	private double weight;

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public double getWeight() {
		return weight;
	}

	public Creature(String name, int age, double weight) {
		this.name = name;
		this.age = age;
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Creature{" +
			"name='" + name + '\'' +
			", age=" + age +
			", weight=" + weight +
			'}';
	}
}
