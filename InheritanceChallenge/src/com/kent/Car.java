package com.kent;

public class Car extends Vehicle {
	
	private int currentGear;
	private int numberOfWheels;
	private int numberOfDoors;
	private boolean isManual;
	
	public Car(String name, String size, int currentGear, int numberOfWheels, int numberOfDoors, boolean isManual) {
		super(name, size);
		this.currentGear = currentGear;
		this.numberOfWheels = numberOfWheels;
		this.numberOfDoors = numberOfDoors;
		this.isManual = isManual;
	}
	
	public void changeGear(int newGear) {
		this.currentGear = newGear;
		System.out.println("Car.changeGear() to new gear " + this.currentGear);
	}
	
	public void changeVelocity(int speed) {
		System.out.println("Car.changeVelocity() " +  speed);
		move(speed, getCurrentDirection());
	}
	
	
	public int getCurrentGear() {
		return currentGear;
	}

	public int getNumberOfWheels() {
		return numberOfWheels;
	}

	public int getNumberOfDoors() {
		return numberOfDoors;
	}

	public boolean isManual() {
		return isManual;
	}
	
	
	
}
