package com.sirma.itt.javacourse.inputoutput.consolereader;

import java.io.InputStream;
import java.util.Scanner;

/**
 * Class contains methods for reading from the console.
 * 
 * @author Malvina Makarieva
 */
public final class ReadFromConsole {
	private static Scanner userInput = new Scanner(System.in);

	/**
	 * Getter method for userInput.
	 *
	 * @return the userInput
	 */
	public static Scanner getUserInput() {
		return userInput;
	}

	/**
	 * Setter method for userInput.
	 *
	 * @param userInput
	 *            the userInput to set
	 */
	public static void setUserInput(InputStream userInput) {
		ReadFromConsole.userInput = new Scanner(userInput);
	}

	/**
	 * Read from console string.
	 * 
	 * @return read string in string.
	 */
	public static String readString() {
		return userInput.nextLine();
	}

	/**
	 * Read from console integer
	 * 
	 * @return read integer.
	 */
	public static Integer readInt() {
		return userInput.nextInt();
	}

	/**
	 * Read from console char.
	 * 
	 * @return char of input char.
	 */
	public static char readChar() {
		char someChar = userInput.next(".").charAt(0);
		return someChar;
	}

	/**
	 * Read from console float.
	 * 
	 * @return float number.
	 */
	public static float readFloat() {
		return userInput.nextFloat();

	}
}
