package com.sirma.itt.javacourse.inputoutput.reversefile;

import java.io.FileWriter;
import java.io.IOException;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Class that test ReverseFile class.
 * 
 * @author Malvina Makarieva
 */
public class ReverseFileTest {
	ReverseFile reverse = new ReverseFile();
	final static String TEST_REVERSE_FILE = "src\\test\\resources\\reverseTestFile.txt";

	/**
	 * Prepare the file before the test
	 * 
	 * @throws IOException
	 */
	@Before
	public void preparationFile() throws IOException {
		FileWriter fileWriter = new FileWriter(TEST_REVERSE_FILE, false);
		fileWriter.append("1\n2\n3\n");
		fileWriter.close();

	}

	/**
	 * Method test addReverseLine() from class ReverseFile.
	 * 
	 * @throws IOException
	 */
	@Test
	public void testAddReverseLine() throws IOException {
		StringBuilder actual;
		actual = reverse.addReverseLine(TEST_REVERSE_FILE);
		StringBuilder expected = new StringBuilder("\n3\n2\n1");

		Assert.assertEquals(expected.toString(), actual.toString());
	}

}
