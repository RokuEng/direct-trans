package data.passanger;

public abstract class Pet extends Creature {

	private String lovedFood;

	private Human owner;

	public abstract void voice();

	public String getLovedFood() {
		return lovedFood;
	}

	public Human getOwner() {
		return owner;
	}

	public Pet(String name, int age, double weight, String lovedFood, Human owner) {
		super(name, age, weight);
		this.lovedFood = lovedFood;
		this.owner = owner;
	}
}
