package com.kent;

public class Room {
	
	private Chair theChair;
	private Light theLight;
	private Wall theWall;
	
	public Room(Chair theChair, Light theLight, Wall theWall) {
		this.theChair = theChair;
		this.theLight = theLight;
		this.theWall = theWall;
	}
	
	public void LoadRoom() {
		System.out.println("Loading room.. " );
		theWall.loadWall();
		theChair.loadChair();
		
	}
	
	public Light getTheLight() {
		return theLight;
	}
}
