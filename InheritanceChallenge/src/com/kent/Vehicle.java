package com.kent;

public class Vehicle {

	private String name;
	private String size;
	private int currentSpeed;
	private int currentDirection;
	
	public Vehicle(String name, String size) {
		this.name = name;
		this.size = size;
		this.currentDirection = 0;
		this.currentSpeed = 0;
	}
	
	public String getName() {
		return name;
	}
	
	public String getSize() {
		return size;
	}
	
	public int getCurrentSpeed() {
		return currentSpeed;
	}
	
	public void setCurrentDirection(int newDirection) {
		this.currentDirection = newDirection;
	}
	public int getCurrentDirection() {
		return currentDirection;
	}
	
	public void move(int speed, int direction) {
		this.currentSpeed = speed;
		this.currentDirection = direction;
		System.out.println("Vehicle.move() moving at speed of " + getCurrentSpeed() + " in direction " + getCurrentDirection() + " degrees");
	}
	
	public void stop() {
		this.currentSpeed = 0;
		System.out.println("Vehicle.stop() stop ");
	}
	
	public void Steer(int direction) {
		System.out.println("Vehicle steer to " + direction + " degreess");
		this.currentDirection += direction;
	}
}
