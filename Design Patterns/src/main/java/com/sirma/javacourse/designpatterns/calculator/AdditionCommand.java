package com.sirma.javacourse.designpatterns.calculator;

/**
 * Class perform mathematical function - addition.
 * 
 * @author Malviana Makarieva
 */
public class AdditionCommand implements Command {

	private static final String PLUS = "\\+";

	/**
	 * Method calculate the amount of numbers. {@inheritDoc}
	 */
	public double execute(String input) {

		String[] numbers = input.split(PLUS);
		double result = Double.parseDouble(numbers[0]);
		for (int i = 1; i < numbers.length; i++) {
			result += Double.parseDouble(numbers[i]);
		}
		return result;
	}
}
