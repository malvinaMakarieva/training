package com.sirma.itt.javacourse.exceptions.readnumberconsole;

import org.junit.Test;

/**
 * Class that tests ConsoleReader class.
 * 
 * @author Malvina Makarieva
 */
public class ConsoleReaderTest {
	ConsoleReader readNumber = new ConsoleReader();

	/**
	 * Method that tested exception.
	 */
	@Test(expected = IncorectInputAreaException.class)
	public void ExceptionTest() {
		readNumber.checkRange(200);
	}
}
