package com.sirma.javacourse.designpatterns.singleton;

/**
 * Class that run Singleton class methods.
 * 
 * @author Malvina Makarieva
 */
public class RunSingleton {
	/**
	 * Main method.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Singleton firstObject = Singleton.getInstance();
		Singleton secondObject = Singleton.getInstance();
		System.out.println(firstObject);
		System.out.println(secondObject);
	}

}
