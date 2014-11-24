package com.sirma.itt.javacourse.inputoutput.inputfile;

import java.io.ByteArrayInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Class test methods from WriteInFile class.
 * 
 * @author Malvina Makarieva
 */
public class WriteInFileTest {
	private WriteInFile writeInFile = new WriteInFile();

	final String TEST_ACTUAL_FILE = "src\\test\\resources\\actualFile.txt";
	final String TEST_EXPECTED_FILE = "src\\test\\resources\\expectedFile.txt";

	/**
	 * Before the test file is cleared, lest there be multiple rewriting.
	 * 
	 * @throws IOException
	 */
	@Before
	public void restorFile() throws IOException {
		FileWriter fileWriter = new FileWriter(TEST_ACTUAL_FILE, false);
		fileWriter.close();
	}

	/**
	 * Test write() method from WriteInFile class.
	 * 
	 * @throws IOException
	 */
	@Test
	public void testFileWrite() throws IOException {

		String actualData = TEST_ACTUAL_FILE + "\r\n tra la la \r\n tra \r\n.";
		String exprctedData = " tra la la  tra ";

		writeInFile.setInput(new ByteArrayInputStream(actualData.getBytes()));
		writeInFile.write();

		List<String> actual = null;
		actual = Files.readAllLines(Paths.get(TEST_EXPECTED_FILE), StandardCharsets.UTF_8);

		FileWriter fileWriter = new FileWriter(TEST_EXPECTED_FILE);
		fileWriter.append(exprctedData);
		fileWriter.close();

		List<String> expected = null;
		expected = Files.readAllLines(Paths.get(TEST_EXPECTED_FILE), StandardCharsets.UTF_8);

		Assert.assertEquals(expected, actual);
	}

}
