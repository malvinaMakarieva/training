package com.sirma.javacourse.designpatterns.calculator;

/**
 * Class perform mathematical function - division.
 * 
 * @author Malvina Makarieva
 */
public class DivisionCommand implements Command {

	private static final String DEVISION = "/";

	/**
	 * Method calculated division of numbers. {@inheritDoc}
	 */
	public double execute(String input) {
		String[] numbers = input.split(DEVISION);
		double result = Double.parseDouble(numbers[0]);
		for (int i = 1; i < numbers.length; i++) {
			result /= Double.parseDouble(numbers[i]);
		}
		return result;
	}

}
