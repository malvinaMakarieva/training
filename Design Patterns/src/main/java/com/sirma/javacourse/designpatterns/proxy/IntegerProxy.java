package com.sirma.javacourse.designpatterns.proxy;

/**
 * Proxy class for Integer class.
 * 
 * @author Malvina Makarieva
 */
public class IntegerProxy implements IntegerNumber {

	private Integer realInteger = null;

	/**
	 * Default constructor.
	 */
	public IntegerProxy() {
	}

	/**
	 * Override method to get number form Integer class. {@inheritDoc}
	 */
	public int getRealIntegerNumber() {
		if (realInteger == null) {
			realInteger = new Integer();
		}
		return realInteger.getRealIntegerNumber();

	}

}
