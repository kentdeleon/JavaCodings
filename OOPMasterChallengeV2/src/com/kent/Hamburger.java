package com.kent;

public class Hamburger {
	
	private String name;
	private String meat;
	private String rollType;
	private double basePrice;
	
	private String additional1Extra;
	private double additional1Price;
	
	private String additional2Extra;
	private double additional2Price;
	
	private String additional3Extra;
	private double additional3Price;
	
	private String additional4Extra;
	private double additional4Price;
	
	public Hamburger(String name, String meat, String rollType, double basePrice) {
		this.name = name;
		this.meat = meat;
		this.rollType = rollType;
		this.basePrice = basePrice;
	}
	
	public void addItem1(String name, double price) {
		this.additional1Extra = name;
		this.additional1Price = price;
	}
	
	public void addItem2(String name, double price) {
		this.additional2Extra = name;
		this.additional2Price = price;
	}
	
	public void addItem3(String name, double price) {
		this.additional3Extra = name;
		this.additional3Price = price;
	}
	
	public void addItem4(String name, double price) {
		this.additional4Extra = name;
		this.additional4Price = price;
	}
	
	public double itemizeBurger() {
		double totalPrice = getBasePrice();
		System.out.println("Ordered " + getName() + " burger on a " + getRollType() + " with " + getMeat() + " for a price of Php " + getBasePrice());
		if(this.additional1Extra != null) {
			totalPrice += this.additional1Price;
			System.out.println("Added an exta " + this.additional1Extra + " for a price of Php " + this.additional1Price);
		}
		if(this.additional2Extra != null) {
			totalPrice += this.additional2Price;
			System.out.println("Added an exta " + this.additional2Extra + " for a price of Php " + this.additional2Price);
		}
		if(this.additional3Extra != null) {
			totalPrice += this.additional3Price;
			System.out.println("Added an exta " + this.additional3Extra + " for a price of Php " + this.additional3Price);
		}
		if(this.additional4Extra != null) {
			totalPrice += this.additional4Price;
			System.out.println("Added an exta " + this.additional4Extra + " for a price of Php " + this.additional4Price);
		}
		
		return totalPrice;
	}

	public String getName() {
		return name;
	}

	public String getMeat() {
		return meat;
	}

	public String getRollType() {
		return rollType;
	}

	public double getBasePrice() {
		return basePrice;
	}
	
	
	
	
}
