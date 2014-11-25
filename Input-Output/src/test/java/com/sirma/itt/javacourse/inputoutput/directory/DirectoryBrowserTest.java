package com.sirma.itt.javacourse.inputoutput.directory;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

/**
 * Class test methods from DirectoryBrowser class
 * 
 * @author Malvina Makarieva
 */
public class DirectoryBrowserTest {
	DirectoryBrowser browser = new DirectoryBrowser();
	final static String TEST_FILE_DIRECTORY = "src\\test\\resources\\testFile.txt";
	final static String FOLDER_ADDRESS = "src\\test\\resources\\SomeFolder";

	/**
	 * Method that test whether if submitted file will recognize it.
	 * 
	 * @throws FileNotFoundException
	 */
	@Test
	public void findFile() throws FileNotFoundException {
		List<String> expected = new ArrayList<String>();
		List<String> actual = new ArrayList<String>();
		expected.add("This is file");

		actual.addAll(browser.chekDirectoryOrFile(TEST_FILE_DIRECTORY));

		Assert.assertEquals(expected, actual);
	}

	/**
	 * Method that test whether if you submit directory will be displayed in the directory list to
	 * it
	 * 
	 * @throws FileNotFoundException
	 */
	@Test
	public void findDirectory() throws FileNotFoundException {
		List<String> expected = new ArrayList<String>();
		List<String> actual = new ArrayList<String>();
		expected.add("directory1");
		expected.add("directory2");
		expected.add("test.txt");

		actual.addAll(browser.chekDirectoryOrFile(FOLDER_ADDRESS));

		Assert.assertEquals(expected, actual);

	}

	/**
	 * Method that test exception.
	 * 
	 * @throws FileNotFoundException
	 */
	@Test(expected = FileNotFoundException.class)
	public void ExceptionTest() throws FileNotFoundException {
		browser.chekDirectoryOrFile("asd");
	}
}
