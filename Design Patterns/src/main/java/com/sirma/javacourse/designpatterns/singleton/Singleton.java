package com.sirma.javacourse.designpatterns.singleton;

/**
 * Class that describes singleton pattern.
 * 
 * @author Malvina Makarieva
 */
public class Singleton {
	private static Singleton INSTANCE = null;

	/**
	 * Constructor.
	 */
	private Singleton() {
		System.out.println("Singleton created");
	}

	/**
	 * Getter method for INSTANCE.
	 *
	 * @return the INSTANCE
	 */
	public static Singleton getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new Singleton();
		}
		return INSTANCE;
	}
}
