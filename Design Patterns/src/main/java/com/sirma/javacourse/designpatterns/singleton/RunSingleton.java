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
		Singleton object = Singleton.getInstance();
		Singleton object1 = Singleton.getInstance();
		System.out.println(object);
		System.out.println(object1);// ////////////// test
	}

}
