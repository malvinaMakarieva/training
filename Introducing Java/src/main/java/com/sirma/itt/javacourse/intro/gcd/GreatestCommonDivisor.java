package com.sirma.itt.javacourse.intro.gcd;


/**
 * This class contains the function for greatest common divisor
 * 
 * @author Malvina Makarieva
 */
public class GreatestCommonDivisor {

	/**
	 * A public method that calculates greatest common divisor of two numbers entered by the user
	 * 
	 * @param firstNumber
	 *            First enter number from user to calculated greatest common divisor
	 * @param secondNumber
	 *            Second enter number from user calculated greatest common divisor
	 * @return greatest common divisor for two numbers
	 */
	public int greatestCommonDivisorCalculation(int firstNumber, int secondNumber) {
		int bufferNumber;

		while (firstNumber != secondNumber) {
			if (firstNumber > secondNumber) {
				bufferNumber = firstNumber - secondNumber;
				firstNumber = bufferNumber;
			} else {
				bufferNumber = secondNumber - firstNumber;
				secondNumber = bufferNumber;
			}
		}
		return firstNumber;
	}
}
