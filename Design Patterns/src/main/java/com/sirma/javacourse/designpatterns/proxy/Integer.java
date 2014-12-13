package com.sirma.javacourse.designpatterns.proxy;

/**
 * Real class of Integer.
 * 
 * @author Malvina Makarieva
 */
public class Integer implements IntegerNumber {

	private int data = 100;

	/**
	 * Default constructor.
	 */
	public Integer() {

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
	 * Override method to get number form this class. {@inheritDoc}
	 */
	public int getRealIntegerNumber() {
		return getData();
	}

}
