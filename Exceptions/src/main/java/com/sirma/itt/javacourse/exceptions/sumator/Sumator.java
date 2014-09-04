package com.sirma.itt.javacourse.exceptions.sumator;

import java.util.Scanner;

/**
 * A class that contains a method for summing large numbers. They are read from the console and
 * recorded in strings
 * 
 * @author Malvina Makarieva
 */
public class Sumator {
	/**
	 * A a method that summing large number just like
	 * 
	 * @param firstNum
	 *            is a number entered by the user via the console
	 * @param secondNum
	 *            is a second number entered by the user via the console
	 * @return sum of two numbers
	 */

	public String summingLargeNumbers(String firstNum, String secondNum) {

		String result = "";
		int length;
		int transfer;
		int digit;

		if (firstNum.length() < secondNum.length()) {
			while (firstNum.length() != secondNum.length()) {
				firstNum = "0" + firstNum;
			}
		} else if (firstNum.length() > secondNum.length()) {
			while (firstNum.length() != secondNum.length()) {
				secondNum = "0" + secondNum;
			}
		}

		transfer = 0;
		length = firstNum.length();
		for (int i = length - 1; i > -1; i--) {
			try {
				Integer.parseInt(Character.toString(firstNum.charAt(i)));
				Integer.parseInt(Character.toString(secondNum.charAt(i)));
			} catch (NumberFormatException e) {
				System.out.println("Input contains characters!");
				e.printStackTrace();
				System.exit(0);
			}
			digit = (firstNum.charAt(i) - '0') + ((secondNum.charAt(i) - '0')) + transfer;

			if (digit > 9) {
				transfer = digit / 10;
				digit = digit % 10;
			} else {
				transfer = 0;
			}
			result = String.valueOf(digit) + result;
		}
		if (transfer > 0) {
			result = String.valueOf(transfer) + result;
		}
		return result;
	}

	public String readFromConsole() {
		Scanner userInput = new Scanner(System.in);
		System.out.print("Input number  = ");
		String number = userInput.next();
		return number;

	}
}
