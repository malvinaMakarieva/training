package com.sirma.itt.javacourse.exceptions.sumator;

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
		Sumator summing = new Sumator();

		String firstNumber = null;
		firstNumber = summing.readFromConsole();

		String secondNumber = null;
		secondNumber = summing.readFromConsole();

		String result = summing.summingLargeNumbers(firstNumber, secondNumber);
		System.out.println("Sum of number is " + result);
	}
}