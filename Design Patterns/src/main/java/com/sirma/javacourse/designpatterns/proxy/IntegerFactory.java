package com.sirma.javacourse.designpatterns.proxy;

/**
 * Class to create IntegerProxt instance.
 * 
 * @author Malvina Makarieva
 */
public class IntegerFactory {
	/**
	 * Constructor.
	 */
	public IntegerFactory() {

	}

	/**
	 * Create new instance.
	 * 
	 * @return instance of IntegerProxy.
	 */
	public IntegerProxy createInstance() {
		return new IntegerProxy();
	}

}
