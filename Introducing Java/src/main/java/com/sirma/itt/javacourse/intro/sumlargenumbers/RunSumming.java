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

		Scanner userInput = new Scanner(System.in);
		System.out.print("Firs large number  = ");
		String firstNumber = userInput.next();

		System.out.print("Second large number  = ");
		String secondNumber = userInput.next();

		LargeNumber largeNumber = new LargeNumber();
		String sum = largeNumber.summingLargeNumbers(firstNumber, secondNumber);
		System.out.println("Sum is " + sum);

		if (userInput != null) {
			userInput.close();
		}

	}

}
