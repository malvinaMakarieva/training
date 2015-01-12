package com.sirma.javacourse.designpatterns.calculator;

/**
 * Class perform mathematical function -subtraction.
 * 
 * @author Malvina Makarieva
 */
public class SubtractionCommand implements Command {
	private static final String MINUS = "-";

	/**
	 * Method calculates the subtraction in numbers. {@inheritDoc}
	 */
	public double execute(String input) {
		String[] numbers = input.split(MINUS);
		double result = Double.parseDouble(numbers[0]);
		for (int i = 1; i < numbers.length; i++) {
			result -= Double.parseDouble(numbers[i]);
		}
		return result;
	}
}
