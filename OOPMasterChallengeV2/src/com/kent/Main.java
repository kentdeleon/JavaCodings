package com.kent;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hamburger hb = new Hamburger("Regular", "sausage", "white rye", 2.56);
		hb.addItem1("Egg", 1.10);
		hb.addItem2("Cheese", 1.0);
		System.out.println("Total price: " + hb.itemizeBurger());
		
		
		HealthyBurger healthyB = new HealthyBurger("Bacon", 5.55);
		healthyB.addItem1("Ham", 1.5);
		healthyB.addOn1("Lentils", 2.76);
		System.out.println("Total price: " + healthyB.itemizeBurger());
		
		DeluxeBurger db = new DeluxeBurger();
		db.addItem1("Cheese", 1);
		System.out.println("Total Price: " + db.itemizeBurger());

	}

}
