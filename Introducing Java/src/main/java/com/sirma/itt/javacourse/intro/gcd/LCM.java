package com.sirma.itt.javacourse.intro.gcd;

/**
 * This class contains the function for least common multiple
 * 
 * @author Malvina Makarieva
 */
public class LCM {

	/**
	 * A public method that calculates least common multiple of two numbers entered by the user
	 * 
	 * @param firstNumber
	 *            First enter number from user to calculated least common multiple
	 * @param secondNumber
	 *            Second enter number from user to calculated least common multiple
	 * @return least common multiple
	 */
	public int lcm(int firstNumber, int secondNumber) {
		GCD gcd = new GCD();

		return ((firstNumber * secondNumber) / gcd.gcd(firstNumber, secondNumber));
	}
}