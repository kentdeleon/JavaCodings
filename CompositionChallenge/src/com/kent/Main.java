package com.kent;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Room room1 = new Room(Chair.createChair("small", "blue"), 
				Light.createLight("LG"), Wall.createWall("yellow", 
			    "block-design", Dimensions.createDimensions(10, 20, 30)));
		
		room1.LoadRoom();
		room1.getTheLight().turnOnLight();
		room1.getTheLight().turnOnLight();
		room1.getTheLight().turnOnLight();

	}

}
;