package com.sirma.itt.javacourse.inputoutput.reversefile;

import java.io.IOException;

/**
 * Class that run methods.
 * 
 * @author Malvina Makarieva
 */
public class RunReverse {
	/**
	 * Method run methods from class ReverseFile.
	 * 
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {

		ReverseFile rv = new ReverseFile();
		rv.addReverseLine("src\\main\\resources\\abc.txt");

	}
}
