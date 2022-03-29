package data.cargo;

import data.passanger.Human;
import data.passanger.Pet;

public class PetCreate extends Goods {
	private Pet pet;

	public PetCreate(String cargo, double weight, Human owner, Pet pet) {
		super(cargo, weight, owner);
		this.pet = pet;
	}

	public PetCreate putPet(Pet pet) {
		this.pet = pet;
		return this;
	}

	public Pet extractPet() {
		Pet toReturn = pet;
		pet = null;
		return toReturn;
	}

	public boolean hasPet() {
		return pet != null ? true : false;
	}
}
