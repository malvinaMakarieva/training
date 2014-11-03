package com.sirma.itt.javacourse.inputoutput.reversefile;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Class implements the logic for turning the contents of the file.
 * 
 * @author Malvina Makarieva
 */
public class ReverseFile {
	/**
	 * Default constructor.
	 */
	public ReverseFile() {

	}

	/**
	 * Method reads fail, reverse its content and writes it back in the same file.
	 * 
	 * @param path
	 *            file name and path
	 * @return String Builder with reverse content.
	 * @throws IOException
	 */
	public StringBuilder addReverseLine(String path) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
		String line;
		StringBuilder tmp = new StringBuilder();
		line = bufferedReader.readLine();
		while (line != null) {
			tmp.append(line + '\n');

			line = bufferedReader.readLine();
		}
		StringBuilder reverseFile = tmp.reverse();
		bufferedReader.close();
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path));
		bufferedWriter.append(reverseFile);

		bufferedWriter.close();
		return reverseFile;

	}
}
