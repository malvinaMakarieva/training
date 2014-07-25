package com.sirma.itt.javacourse.intro.gcd;

import java.util.Scanner;

/**
 * This class read from console and running methods for greatest common divisor and least common
 * multiple
 * 
 * @author Malvina Makarieva
 */
public class CalculationGcmAndLcm {
	/**
	 * Main method that run methods form classes LeastCommonMultiple and GreatestCommonDivisor
	 * 
	 * @param args
	 */

	public static void main(String[] args) {

		int firstNumber;
		int secondNumber;

		Scanner input = new Scanner(System.in);

		System.out.println("Enter two numbers to find a GCD and LCM");

		System.out.print("First number = ");
		firstNumber = input.nextInt();

		System.out.print("Second number = ");
		secondNumber = input.nextInt();

		GreatestCommonDivisor gcd = new GreatestCommonDivisor();

		int calculatedGreatestCommonDivisor = gcd.greatestCommonDivisorCalculation(firstNumber,
				secondNumber);
		System.out.println("GCP is " + calculatedGreatestCommonDivisor);

		LeastCommonMultiple lcm = new LeastCommonMultiple();
		int calculatedLeastCommonMultiple = lcm.leastCommonMultipleCalculation(firstNumber,
				secondNumber);
		System.out.println("LCM is " + calculatedLeastCommonMultiple);

		if (input != null) {
			input.close();
		}
	}
}
