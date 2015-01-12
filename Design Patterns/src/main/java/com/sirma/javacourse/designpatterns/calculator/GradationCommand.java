package com.sirma.javacourse.designpatterns.calculator;

/**
 * Class perform mathematical function - gradation.
 * 
 * @author Malvina Makarieva
 */
public class GradationCommand implements Command {

	private static final String DEGREE = "\\^";

	/**
	 * Method raises a number of degree. {@inheritDoc}
	 */
	public double execute(String input) {
		String[] numbers = input.split(DEGREE);
		return (int) Math.pow(Integer.parseInt(numbers[0]), Integer.parseInt(numbers[1]));
	}

}
