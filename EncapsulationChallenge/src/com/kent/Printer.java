package com.kent;

public class Printer {
	
	private int tonerLevel = 100;
	private int numberOfPagesPrinted;
	private boolean isDuplexPrinter = false;
	
	
	public Printer(int tonerLevel, boolean isDuplexPrinter) {
		this.numberOfPagesPrinted = 0;
		this.tonerLevel = tonerLevel >= 0 && tonerLevel <= 100 ? tonerLevel : 100;
		this.isDuplexPrinter = isDuplexPrinter;
	}
	
	public void fillToner(int additionalToner) {
		this.tonerLevel = tonerLevel >= 0 && tonerLevel <= 100 ? tonerLevel : 100;
		System.out.println("Successfully fill up toner " );
		System.out.println("New toner level is: " + this.tonerLevel);
	}
	
	public int printPage(int pagesToPrint) {
		
		if(isDuplexPrinter) {
			int pagesPrinted = (pagesToPrint/2) + (pagesToPrint%2);
			System.out.println("Printing on duplex printer...");
			this.numberOfPagesPrinted += pagesPrinted;
			return pagesPrinted;
		}else {
			System.out.println("Printing on regular printer...");
			this.numberOfPagesPrinted += pagesToPrint;
			return pagesToPrint;
		}
	}

	public int getTonerLevel() {
		return tonerLevel;
	}

	public int getNumberOfPagesPrinted() {
		return numberOfPagesPrinted;
	}

	public boolean isDuplexPrinter() {
		return isDuplexPrinter;
	}
	
	
	
	
	

}
