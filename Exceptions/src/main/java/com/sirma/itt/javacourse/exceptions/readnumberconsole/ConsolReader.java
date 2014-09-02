package com.sirma.itt.javacourse.exceptions.readnumberconsole;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * Class that implement read form console.
 * 
 * @author Malvina Makarieva
 */
public class ConsolReader {
	/**
	 * Method read form console numbers in range 0 to 100.
	 * 
	 * @throws IncorectInputAreaException
	 *             custom exception created for this task. Processing is introduced if the numbers
	 *             are not in range.
	 * @throws InputMismatchException
	 *             Thrown by a Scanner to indicate that the token retrieved does not match the
	 *             pattern for the expected type, or that the token is out of range for the expected
	 *             type
	 * @throws NoSuchElementException
	 *             Thrown by the nextElement method of an Enumeration to indicate that there are no
	 *             more elements in the enumeration.
	 */
	public void readFromConsoleNumbers() throws IncorectInputAreaException, InputMismatchException,
			NoSuchElementException {
		System.out
				.println("Enter numbers in the range from 0 to 100 introduction ends with the input of a number outside the range.");
		Scanner input = new Scanner(System.in);
		int userInput;
		while (true) {

			System.out.print("input number = ");
			userInput = input.nextInt();

			if (userInput < 0 || userInput > 100) {
				input.close();
				throw new IncorectInputAreaException(
						"Incorrectly entered number. It must be from 0 to 100");

			}
		}
	}
}
