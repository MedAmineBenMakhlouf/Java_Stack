package com.zookeper;

public class Bat extends Mammal {
//	public Bat(int energyLevel) {
//		super(energyLevel);
//	}
	public Bat() {
		setEnergyLevel(300);
	}
	
	public void attackTown() {
		setEnergyLevel(getEnergyLevel() - 100);
		System.out.println("grilla is attacking El Mourouj and he have " + getEnergyLevel() + " pts");
	}

	public void eatHumans() {
		setEnergyLevel(getEnergyLevel() + 25);
		System.out.println("grilla is eating human and he have " + getEnergyLevel() + " pts");
	}

	public void fly() {
		setEnergyLevel(getEnergyLevel() - 30);
		System.out.println("the bat is fying and he have " + getEnergyLevel() + " pts");
	}

}
