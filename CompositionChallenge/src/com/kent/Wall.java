package com.kent;

public class Wall {
	
	private Dimensions dimensions;
	private String color;
	private String design;
	
	public Wall(String color, String design, Dimensions dimensions) {
		this.color = color;
		this.design = design;
		this.dimensions = dimensions;
	}
	
	public static Wall createWall(String color, String design, Dimensions dimensions) {
		return new Wall(color, design, dimensions);
	}
	
	public void loadWall() {
		System.out.println("Loading wall with color " + this.color + " and design " + this.design);
		System.out.println("With Dimensions");
		 dimensions.displayDimensions();
	}
}
