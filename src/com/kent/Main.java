package com.kent;

import java.util.Scanner;

public class Main {
	
	public static Grocery grocery = new Grocery();
	public static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
	 
		boolean quit = false;
		
		while(!quit) {
			int choice = 0;
			
			System.out.println("Enter choice: \t");
			choice = scanner.nextInt();
			scanner.nextLine();
			
			switch(choice) {
				case 0:
					printActions();
					break;
				case 1:
					printGroceryList();
					break;
				case 2:
					addItems();
					break;
				case 3:
					updateItems();
					break;
				case 4:
					deleteItems();
					break;
				case 5:
					searchItems();
					break;
				case 6:
					System.out.println("Application closing....");
					quit = true;
					break;
				
			}
		
		}
	}
	
	public static void printActions() {
		System.out.println("Enter choice: \n");
		System.out.println("\t [0] : Print actions");
		System.out.println("\t [1] : Print grocery list");
		System.out.println("\t [2] : add item to grocery list");
		System.out.println("\t [3] : update existing item to grocery list");
		System.out.println("\t [4] : delete existing item to grocery list");
		System.out.println("\t [5] : search for items in grocery list");
		System.out.println("\t [6] : stop the program");
	}
	
	public static void addItems() {
		
		System.out.println("Input item to add: " );
		String item = scanner.nextLine();
		boolean isAdded = grocery.addItem(item);
		
		if(isAdded) {
			System.out.println("Successfully added " + item );
		}else {
			 System.out.println("Unable to add " + item);
		}

	}
	
	public static void updateItems() {
		System.out.println("Input item to be replace: " );
		String item = scanner.nextLine();
		System.out.println("Input new item: " );
		String newItem = scanner.nextLine();
		boolean isUpdated = grocery.updateItem(item, newItem);
		
		if(isUpdated) {
			System.out.println("Successfully changed existing  " + item + " to  " + newItem );
		}else {
			 System.out.println("Unable to update existing " + item + " to " + newItem);
		}
		
	}
	
	
	public static void deleteItems() {
		System.out.println("Input item to delete: " );
		String item = scanner.nextLine();
		boolean isDeleted = grocery.deleteItem(item);
		
		if(isDeleted) {
			System.out.println("Successfully deleted " + item );
		}else {
			 System.out.println("Unable to delete " + item);
		}
		
	}
	
	public static void searchItems() {
		System.out.println("Search items by entering item number");
		int itemNumber = scanner.nextInt();
		scanner.nextLine();
		String ableToSearch = grocery.queryItem(itemNumber);
		
		if(ableToSearch != null) {
			System.out.println(ableToSearch );
		}else {
			 System.out.println("Unable to find  " + ableToSearch);
		}
	}
	
	public static void printGroceryList() {
		grocery.displayItems();
	}
}
