package com.sirma.itt.javacourse.exceptions.listbyelements;

/**
 * In the class creates a list. Added and removed from it.
 * 
 * @author Malvina Makarieva
 */
public class RunListFromElements {
	/**
	 * Main class
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		ListByElements listElements = new ListByElements();

		listElements.add(5);
		listElements.add("yes");
		listElements.add(7.55);
		listElements.add("no");

		System.out.println("All elements are - " + listElements.printAllElements());

		listElements.remove();
		System.out.println("After remove elements are - " + listElements.printAllElements());

	}
}
