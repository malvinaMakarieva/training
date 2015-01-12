package com.sirma.javacourse.designpatterns.calculator;

/**
 * Class perform mathematical function - multiplication.
 * 
 * @author Malvina Makarieva
 */
public class MultiplicationCommand implements Command {
	private static final String STAR = "\\*";

	/**
	 * Method calculated multiplying the numbers. {@inheritDoc}
	 */
	public double execute(String input) {
		String[] numbers = input.split(STAR);
		double result = Double.parseDouble(numbers[0]);
		for (int i = 1; i < numbers.length; i++) {
			result *= Double.parseDouble(numbers[i]);
		}
		return result;
	}

}
