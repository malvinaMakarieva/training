package com.sirma.itt.javacourse.exceptions.sumator;

/**
 * This class read from console and running method summingStrings(String firstNum, String secondNum)
 * 
 * @author Malvina Makarieva
 */
public class RunSumming {
	/**
	 * Main method that running summingLargeNumbers from class Sumator
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Sumator summing = new Sumator();

		String firstNumber = null;
		firstNumber = summing.readFromConsole();

		String secondNumber = null;
		secondNumber = summing.readFromConsole();

		String result = summing.summingStrings(firstNumber, secondNumber);
		System.out.println("Sum is " + result);
	}
}