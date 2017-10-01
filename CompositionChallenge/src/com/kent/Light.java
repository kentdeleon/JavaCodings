package com.kent;

public class Light {
	
	private String manufacturer;
	private boolean isTurnOn = false;
	
	public Light(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	
	public static Light createLight(String manufacturer) {
		return new Light(manufacturer);
	}
	
	public void turnOnLight() {
		if(!isTurnOn) {
		System.out.println("Light turn on");
		
		}else {
			System.out.println("Light turn off");
		}
		this.isTurnOn = !this.isTurnOn;
	}

	public String getManufacturer() {
		return manufacturer;
	}
	
	

}
