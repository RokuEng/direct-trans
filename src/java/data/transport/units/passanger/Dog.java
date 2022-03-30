package data.transport.units.passanger;

public class Dog extends Pet {

	public Dog(String name, int age, double weight, String lovedFood, Human owner) {
		super(name, age, weight, lovedFood, owner);
	}

	@Override
	public void voice() {
		System.out.println("Bark! Bark!");
	}
}
