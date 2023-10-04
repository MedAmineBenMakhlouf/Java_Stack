package com.amine;

public class Driver extends Car {

	public Driver(int gas) {
		super(gas);
	}

	public Driver() {

	}

	int old = getGas();

	public void driving() {
		setGas(getGas() - 5);
		System.out.println("your gas decrease by 1: " + getGas() + "/" + old);
	}

	public void booster() {
		if (getGas() < 3) {
			System.out.println("Not allow to boost ");
		} else {
			setGas(getGas() - 3);
			System.out.println("your gas decrease by 1: " + getGas() + "/" + old);
		}
	}

	public void refuel() {
		if(getGas()>8)
		{
			System.out.println("not allowed to boost");
		}
		setGas(getGas() + 2);
		System.out.println("your gas decrease by 1: " + getGas() + "/" + old);
	}

}
