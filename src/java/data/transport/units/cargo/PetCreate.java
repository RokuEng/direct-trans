package data.transport.units.cargo;

import data.transport.units.passanger.Human;
import data.transport.units.passanger.Pet;
import logic.Position;

public class PetCreate extends Goods {
	private Pet pet;

	public PetCreate(double weight, Human owner, Position pos, Pet pet) {
		super(weight, owner, pos);
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
