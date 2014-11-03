package com.sirma.itt.javacourse.inputoutput.reversefile;

import java.io.IOException;

import org.junit.Assert;
import org.junit.Test;

/**
 * Class that test ReverseFile class.
 * 
 * @author Malvina Makarieva
 */
public class ReverseFileTest {
	ReverseFile reverse = new ReverseFile();

	/**
	 * Method test addReverseLine() from class ReverseFile.
	 * 
	 * @throws IOException
	 */
	@Test
	public void addReverseLineTest() throws IOException {
		StringBuilder actual;
		actual = reverse.addReverseLine("reverseTestFile.txt");
		StringBuilder expected = new StringBuilder("\n3\n2\n1");

		Assert.assertEquals(expected.toString(), actual.toString());
	}
}
