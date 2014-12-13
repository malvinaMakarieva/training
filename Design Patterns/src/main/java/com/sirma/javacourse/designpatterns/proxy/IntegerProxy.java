package com.sirma.javacourse.designpatterns.proxy;

/**
 * Proxy class for Integer class.
 * 
 * @author Malvina Makarieva
 */
public class IntegerProxy implements IntegerNumber {

	private Integer realInteger = new Integer();
	private int data = 16;

	/**
	 * Default constructor.
	 */
	public IntegerProxy() {
	}

	/**
	 * Getter method for data.
	 *
	 * @return the data
	 */
	public int getData() {
		return data;
	}

	/**
	 * Setter method for data.
	 *
	 * @param data
	 *            the data to set
	 */
	public void setData(int data) {
		this.data = data;
	}

	/**
	 * Override method to get number form Integer class. {@inheritDoc}
	 */
	public int getRealIntegerNumber() {
		return realInteger.getRealIntegerNumber();

	}

}
