package com.sirma.itt.javacourse.intro.sumlargenumbers;

import java.util.Scanner;

/**
 * This class read from console and running method summingLargeNumbers(String firstNum, String
 * secondNum)
 * 
 * @author Malvina Makarieva
 */
public class RunSumming {
	/**
	 * Main method that running summingLargeNumbers from class LargeNumber
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Firs large number  = ");
		String firstNumber = input.next();

		System.out.print("Second large number  = ");
		String secondNumber = input.next();

		LargeNumber largeNumber = new LargeNumber();
		String sum = largeNumber.summingLargeNumbers(firstNumber, secondNumber);
		System.out.println("Sum is " + sum);

		if (input != null) {
			input.close();
		}

	}

}
