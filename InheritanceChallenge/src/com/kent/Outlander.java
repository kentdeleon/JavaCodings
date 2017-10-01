package com.kent;

public class Outlander extends Car {
	
	private int currentVelocity;
	private int numberOfServiceMonths;
	
	
	public Outlander(int numberOfServiceMonths) {
		super("Outlander", "4WD", 1, 5, 5, false);
		this.currentVelocity = 0;
		this.numberOfServiceMonths = numberOfServiceMonths;
	
	}
		
	
	public int getNumberOfServiceMonths() {
		return numberOfServiceMonths;
	}
	

	public void accelerate(int rate) {
		int newSpeed = 0;
		this.currentVelocity = getCurrentSpeed() + rate;
		newSpeed = this.currentVelocity;
		
		
		
		if(this.currentVelocity <= 0) {
			stop();
			changeGear(0);
		}else if( this.currentVelocity > 10 && this.currentVelocity <= 20) {
			
			changeGear(1);
			changeVelocity(newSpeed);
		}else if( this.currentVelocity > 20 && this.currentVelocity <= 30) {
			changeGear(2);
			changeVelocity(newSpeed);
		}else if(this.currentVelocity > 31 && this.currentVelocity <= 40) {
			changeGear(3);
			changeVelocity(newSpeed);
		}else {
			changeGear(4);
			changeVelocity(newSpeed);
		}
	}

}

