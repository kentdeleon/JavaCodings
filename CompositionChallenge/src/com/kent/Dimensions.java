package com.kent;

public class Dimensions {
	
	private int width;
	private int height;
	private int length;
	
	
	public Dimensions(int width, int height, int length) {
	
		this.width = width;
		this.height = height;
		this.length = length;
	}

	public static Dimensions createDimensions(int width, int height, int length) {
		return new Dimensions(width,height,length);
	}
	public int getWidth() {
		return width;
	}


	public int getHeight() {
		return height;
	}


	public int getLength() {
		return length;
	}
	
	public void displayDimensions() {
		System.out.println("Height: " + this.height + " Length: " + this.length + " Width: " + this.width);
	}
	
	
	
	
}
