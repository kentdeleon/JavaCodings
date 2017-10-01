package com.kent;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int pagesPrinted;
		Printer printer = new Printer(200, true);
		System.out.println(printer.getTonerLevel());
		pagesPrinted = printer.printPage(5);
		System.out.println("Printer printed pages: " + pagesPrinted + " Total of pages printed " + printer.getNumberOfPagesPrinted());
		pagesPrinted = printer.printPage(2);
		System.out.println("Printer printed pages: " + pagesPrinted + " Total of pages printed " + printer.getNumberOfPagesPrinted());

	}

}
