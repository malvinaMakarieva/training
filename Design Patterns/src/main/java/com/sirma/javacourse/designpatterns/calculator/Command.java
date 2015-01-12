package com.sirma.javacourse.designpatterns.calculator;

/**
 * Interface provide one method to excecute all matematic action.
 * 
 * @author Malvina Makarieva
 */
public interface Command {
	/**
	 * Method calculate result from numbers in input string.
	 * 
	 * @param input
	 *            string from console with numbers and sign (+ - / * ^).
	 * @return double result from matematic action.
	 */
	public double execute(String input);
}
