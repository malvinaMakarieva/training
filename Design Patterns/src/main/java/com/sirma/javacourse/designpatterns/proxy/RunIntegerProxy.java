package com.sirma.javacourse.designpatterns.proxy;

/**
 * Class that run IntegerProxy.
 * 
 * @author Malvina Makarieva
 */
public class RunIntegerProxy {
	/**
	 * Main method.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		IntegerFactory proxy = new IntegerFactory();
		System.out.println(proxy.createInstance().getRealIntegerNumber());

	}

}
