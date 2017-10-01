package com.kent;

public class HealthyBurger extends Hamburger {

	private String healthy1AddOn;
	private double healthy1Price;
	
	private String healthy2AddOn;
	private double healthy2Price;
	
	
	public HealthyBurger(String meat,  double basePrice) {
		super("Healthy Burger", meat, "Brown rye", basePrice);
		// TODO Auto-generated constructor stub
	}

	
	public void addOn1(String name, double price) {
		this.healthy1AddOn = name;
		this.healthy1Price = price;
	}
	
	public void addOn2(String name, double price) {
		this.healthy2AddOn = name;
		this.healthy2Price = price;
	}


	/* (non-Javadoc)
	 * @see com.kent.Hamburger#itemizeBurger()
	 */
	@Override
	public double itemizeBurger() {
		// TODO Auto-generated method stub
		double totalPrice = super.itemizeBurger();
		
		if(this.healthy1AddOn != null) {
			totalPrice += this.healthy1Price;
			System.out.println("Added healthy extra " + this.healthy1AddOn + " for a price of Php " + this.healthy1Price);
		}
		if(this.healthy2AddOn != null) {
			totalPrice += this.healthy2Price;
			System.out.println("Added healthy extra " + this.healthy2AddOn + " for a price of Php " + this.healthy2Price);
		}
		
		return totalPrice;
	}
	
	

}
