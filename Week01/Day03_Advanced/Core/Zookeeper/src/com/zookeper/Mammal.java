package com.zookeper;

public class Mammal {
	private int energyLevel=100;

	public int getEnergyLevel() {
		return energyLevel;
	}

	public void setEnergyLevel(int energyLevel) {
		this.energyLevel = energyLevel;
	}

	public Mammal(int energyLevel) {
		super();
		this.energyLevel = energyLevel;
	}

	public Mammal() {
		super();
	}
	
	public int displayEnergy() {
		System.out.println("This Mammam energy equal to: " + energyLevel);
		return energyLevel;
	}
}
