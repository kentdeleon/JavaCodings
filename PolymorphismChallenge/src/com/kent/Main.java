package com.kent;

public class Main {
	
	public static void main(String[] args) {
		Car baseCar = new Car("Base", "V3", 4,4,4);
		baseCar.startEngine();
		Car ferrari = new Ferrari();
		ferrari.startEngine();
	}
	
	
	

	
}

class Car {
	private String name;
	private String engine;
	private int cyclinders;
	private int wheels;
	private int doors;
	private int currentSpeed;
	
	
	public Car(String name, String engine, int cyclinders, int wheels, int doors) {
		this.name = name;
		this.engine = engine;
		this.cyclinders = cyclinders;
		this.wheels = wheels;
		this.doors = doors;
		this.currentSpeed = 0;
	}
	
	public void startEngine() {
		System.out.println("Car starting engine");
	}
	
	public void accelerate(int rate) {
		System.out.println("Car accelerating at the rate of " + rate);
		this.currentSpeed += rate;
		System.out.println("New speed is " + getCurrentSpeed());
		
	}
	
	
	public void brake(int breakAmount) {
		System.out.println("Car is braking and losing some speed at the rate of " + breakAmount);
		
		this.currentSpeed -= breakAmount;
		System.out.println("New speed is " + getCurrentSpeed());
	}
	
	public int getCurrentSpeed() {
		return currentSpeed;
	}
	public String getName() {
		return name;
	}
	public String getEngine() {
		return engine;
	}


	public int getCyclinders() {
		return cyclinders;
	}


	public int getWheels() {
		return wheels;
	}


	public int getDoors() {
		return doors;
	}

}