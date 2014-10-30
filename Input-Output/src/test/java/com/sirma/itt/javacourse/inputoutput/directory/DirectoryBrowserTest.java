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

		actual.addAll(browser.chekDirectoryOrFile("testFile.txt"));

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

		actual.addAll(browser.chekDirectoryOrFile("SomeFolder"));

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
