package com.kent;

public class Chair {
	
	private String size;
	private String color;
	
	public Chair(String size, String color) {
		this.size = size;
		this.color = color;
	}
	
	public static Chair createChair(String size, String color) {
		return new Chair(size, color);
	}
	
	public void loadChair() {
		System.out.println("Loading " + this.size + " " + this.color +" chair... " );
	}
	
	public void moveChair(int x, int y) {
		System.out.println("Moving chair to position x: " + x + " y: " + y);
	}

	public String getSize() {
		return size;
	}

	public String getColor() {
		return color;
	}
	
	
}
