package data.transport.units.passanger;

import java.util.List;

public class Human extends Creature {

	private boolean canDrive;

	private String lovedMark;

	private List<Pet> pets;

	public Human(String name, int age, double weight, boolean canDrive, String lovedMark) {
		super(name, age, weight);
		this.canDrive = canDrive;
		this.lovedMark = lovedMark;
	}

	public Human addPet(Pet pet) {
		pets.add(pet);
		return this;
	}

	public boolean canDrive() {
		return canDrive;
	}

	public void drive() {
		System.out.println(canDrive ? "Driving. . ." : " Sorry, i cant drive");
	}

	public void talk() {
		System.out.println("My name is " + getName() + "i like " + lovedMark + " transport mark, i " + (canDrive ? "can drive" : "cant drive"));
	}
}
