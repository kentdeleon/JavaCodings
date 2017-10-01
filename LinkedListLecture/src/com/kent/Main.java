package com.kent;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> placeToVisit = new LinkedList<>();
		
		addInOrder(placeToVisit,"Sydney");
		addInOrder(placeToVisit,"Melbourne");
		addInOrder(placeToVisit,"Brisbane");
		addInOrder(placeToVisit,"Perth");
		addInOrder(placeToVisit,"Canberra");
		addInOrder(placeToVisit,"Adelaiede");
		addInOrder(placeToVisit,"Darwin");
		
		printList(placeToVisit);
		visit(placeToVisit);
		
	}
	
	public static void printList(LinkedList<String> linkedList) {
		Iterator<String> i = linkedList.iterator();
		
		while(i.hasNext()) {
			System.out.println("Now visiting " + i.next());
		}
		
		System.out.println("=======================");
	}
	
	public static void visit(LinkedList<String> cities) {
		Scanner scanner = new Scanner(System.in);
		boolean quit = false;
		boolean forward = true;
		
		ListIterator<String> listIterator = cities.listIterator();
		
		if(cities.isEmpty()) {
			System.out.println("No cities in itenerary");
			scanner.close();
			return;
		}else {
			System.out.println("Now visiting " + listIterator.next());
			printMenu();
		
		}
		
		while(!quit) {
			System.out.println("Enter action");
			int action = scanner.nextInt();
			scanner.nextLine();
			
			switch(action) {
				case 1:
					System.out.println("Holiday is over" );
					quit = true;
					break;
				case 2:
					if(!forward) {
						if(listIterator.hasNext()) {
							listIterator.next();
						}
						forward = true;
						
					}
					if(listIterator.hasNext()) {
							System.out.println("Now visiting " + listIterator.next());
							
					}else {
							System.out.println("We are the end of the list");
							forward = false;
					}
					
					
					break;
				case 3:
					if(forward) {
						if(listIterator.hasPrevious()) {
							listIterator.previous();	
						}
						forward = false;
					}
						if(listIterator.hasPrevious()) {
							System.out.println("Now visiting " + listIterator.previous());
							
						}else {
							System.out.println("Currently we are at the start of the list");
							forward = true;
						}
					
				
					break;
				case 4:
					printMenu();
					break;

			}
		}
		scanner.close();
	}
	
	
	public static void printMenu() {
		System.out.println("\n Enter action: ");
		System.out.println("\t [1] to Quit");
		System.out.println("\t [2] to move forward");
		System.out.println("\t [3] to move backward");
		System.out.println("\t [4] to print Actions");
	}
	public static boolean addInOrder(LinkedList<String> linkedList, String newCity) {
		ListIterator<String> listIterator = linkedList.listIterator();
		
		
		while(listIterator.hasNext()) {
			int comparison = listIterator.next().compareTo(newCity);
	
			if(comparison == 0) {
				//equal, do not add
				return false;
			}else if(comparison > 0) {
				//current value pointing in list iterator is greater than the input parameter(newCity)
				//add input parameter before the current value pointing in the list iterator
				//i.e. currently pointing to Brisbane, input parameter is equal to Adelaide
				//Adelaide should point first to Brisbane.
				
				listIterator.previous();
				listIterator.add(newCity);
				return true;
			}else if(comparison < 0) {
				//do nothing and move to the next city
			}
		}

		listIterator.add(newCity);
		return true;
		
	}

}
