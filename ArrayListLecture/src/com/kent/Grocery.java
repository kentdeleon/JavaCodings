package com.kent;

import java.util.ArrayList;

public class Grocery {
	
	private ArrayList<String> groceryList = new ArrayList<>();
	
	public Grocery() {
		
	}
	
	public boolean addItem(String name) {
		int position = findItem(name);
		if(position < 0) {
			groceryList.add(name);
			return true;
		} 
		System.out.println("Item " + name + " already exists in grocery list");
		return false;
	}
	
	public boolean deleteItem(String name) {
		int position = findItem(name);
		if(position >= 0) {
			groceryList.remove(position);
			return true;
		}
		System.out.println("Item " + name + " does not exists in groceryList");
		return false;
		
	}
	
	public boolean updateItem(String name, String newItem) {
		int position = findItem(name);
		if(position >= 0) {
			groceryList.set(position, newItem);
			return true;
		}
		System.out.println("Item " + name + " does not exists in groceryList to be updated");
		return false;
	}
	
	public void displayItems() {
		System.out.println("There are " + groceryList.size() + " items in grocery list");
		for(int i = 0 ; i < groceryList.size(); i++) {
			System.out.println((i+1) + ".  " + groceryList.get(i));
		}
	}
	
	public boolean onFile(String name) {
		int position = findItem(name);
		if(position >= 0) {
			return true;
		}
		return false;
	}
	public String queryItem(int position) {
		position -= 1;
		if((position) >= groceryList.size()) {
			return "Index range is out of bounds";
		}else if(position == 0 && groceryList.size() == 0) {
			return "Grocery list does not have any item yet";
		}else {
			String item = groceryList.get(position);
			if(item != null) {
				return "Successfuly find " + item;
			}
		}
		 
	
		return null;
	}
	private int findItem(String name) {
		return groceryList.indexOf(name);
		
	}
}
