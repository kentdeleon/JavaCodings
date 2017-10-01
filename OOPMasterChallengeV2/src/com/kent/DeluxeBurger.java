package com.kent;

public class DeluxeBurger extends Hamburger {

	public DeluxeBurger() {
		super("Deluxe Burger", "Ham & Bacon", "White", 20.55);
		super.addItem1("Chips", 5.56);
		super.addItem2("Drinks", 2.54);

	}

	/* (non-Javadoc)
	 * @see com.kent.Hamburger#addItem1(java.lang.String, double)
	 */
	@Override
	public void addItem1(String name, double price) {
		// TODO Auto-generated method stub
		System.out.println("Unable to add " + name + " to a deluxe burger");
	}

	/* (non-Javadoc)
	 * @see com.kent.Hamburger#addItem2(java.lang.String, double)
	 */
	@Override
	public void addItem2(String name, double price) {
		System.out.println("Unable to add " + name + " to a deluxe burger");
	}

	/* (non-Javadoc)
	 * @see com.kent.Hamburger#addItem3(java.lang.String, double)
	 */
	@Override
	public void addItem3(String name, double price) {
		// TODO Auto-generated method stub
		System.out.println("Unable to add " + name + " to a deluxe burger");
	}

	/* (non-Javadoc)
	 * @see com.kent.Hamburger#addItem4(java.lang.String, double)
	 */
	@Override
	public void addItem4(String name, double price) {
		// TODO Auto-generated method stub
		System.out.println("Unable to add " + name + " to a deluxe burger");
	}
	
	
	
	
}
