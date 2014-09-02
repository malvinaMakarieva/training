package com.sirma.itt.javacourse.exceptions.readnumberconsole;

/**
 * Class describing custom exception. An exception will be thrown when entering a number is out of
 * range.
 * 
 * @author Malvina Makarieva
 */
public class IncorectInputAreaException extends Exception {

	/**
	 * Automatic generate serialVersionUID.
	 */
	private static final long serialVersionUID = 5547529901572293853L;

	/**
	 * Constructor.
	 * 
	 * @param msg
	 *            message for exception.
	 */
	public IncorectInputAreaException(String msg) {
		super(msg);
	}

}
