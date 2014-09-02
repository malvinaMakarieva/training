package com.sirma.itt.javacourse.exceptions.readnumberconsole;

/**
 * Class that run reading from console.
 * 
 * @author Malvina Makarieva
 */
public class RunConsoleReader {
	/**
	 * Main method.
	 * 
	 * @param args
	 * @throws IncorectInputAreaException
	 *             Class describing custom exception. An exception will be thrown when entering a
	 *             number is out of range.
	 */
	public void main(String[] args) throws IncorectInputAreaException {
		ConsolReader consoleReader = new ConsolReader();
		consoleReader.readFromConsoleNumbers();
	}

}
