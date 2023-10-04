package com.amine;

public class Car {
	private int gas = 10;

	public Car() {
		super();
	}

	public Car(int gas) {
		super();
		this.gas = gas;
	}

	public int getGas() {
		return gas;
	}

	public void setGas(int gas) {
		if (this.gas == 0) {
			System.out.println("Game Over");
		} else {
			this.gas = gas;
		}
	}

	public void display() {
		System.out.println(this.gas);
	}
}
