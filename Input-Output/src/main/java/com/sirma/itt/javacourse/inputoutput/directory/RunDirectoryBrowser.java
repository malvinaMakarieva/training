package com.sirma.itt.javacourse.inputoutput.directory;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

/**
 * Class to run method form DirectoryBrowser.
 * 
 * @author Malvina Makarieva
 */
public class RunDirectoryBrowser {
	/**
	 * Main method.
	 * 
	 * @param args
	 * @throws FileNotFoundException
	 */
	public static void main(String[] args) throws FileNotFoundException {
		DirectoryBrowser browser = new DirectoryBrowser();
		List<String> result = new ArrayList<String>();
		result.addAll(browser.chekDirectoryOrFile("E:/GitHub/training"));
		System.out.println(result);
	}
}
