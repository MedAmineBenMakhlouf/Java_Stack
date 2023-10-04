package com.zookeper;

public class Gorilla extends Mammal {

//	public Gorilla(int energyLevel) {
//		super(energyLevel);
//	}

//	public Gorilla() {
//
//	}

	public void throwThings() {
		setEnergyLevel(getEnergyLevel() - 5);
		System.out.println("grilla is throwing things at people and he have " + getEnergyLevel() + " pts");
	}

	public void eatBananas() {
		setEnergyLevel(getEnergyLevel() + 10);
		System.out.println("grilla is eating banana and he have " + getEnergyLevel() + " pts");
	}

	public void climb() {
		setEnergyLevel(getEnergyLevel() - 10);
		System.out.println("grilla is climbing and he have " + getEnergyLevel() + " pts");
	}

}
