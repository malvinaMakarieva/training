package com.sirma.itt.javacourse.inputoutput.consolereader;

import java.io.ByteArrayInputStream;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test methods from class ReadFromConsole.
 * 
 * @author Malvina Makarieva
 */
public class ReadFromConsoleTest {
	/**
	 * Test readStrung() method.
	 */
	@Test
	public void readStringTest() {
		String someString = "some string";
		ReadFromConsole.setUserInput(new ByteArrayInputStream(someString.getBytes()));
		Assert.assertEquals("some string", ReadFromConsole.readString());
	}

	/**
	 * Test readInt() method.
	 */
	@Test
	public void readIntTest() {
		String someInt = "20";
		ReadFromConsole.setUserInput(new ByteArrayInputStream(someInt.getBytes()));
		Assert.assertSame(20, ReadFromConsole.readInt());
	}

	/**
	 * Test readChar() method.
	 */
	@Test
	public void readCharTest() {
		String someChar = "c";
		ReadFromConsole.setUserInput(new ByteArrayInputStream(someChar.getBytes()));
		Assert.assertSame('c', ReadFromConsole.readChar());
	}

	/**
	 * Test readFloat() method.
	 */
	@Test
	public void readFloatTest() {
		String someFloat = "56,20";
		ReadFromConsole.setUserInput(new ByteArrayInputStream(someFloat.getBytes()));
		Assert.assertEquals(56.20, ReadFromConsole.readFloat(), 0.9);
	}
}
