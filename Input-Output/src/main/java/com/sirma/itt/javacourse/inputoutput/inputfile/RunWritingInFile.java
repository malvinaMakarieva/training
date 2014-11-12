package com.sirma.itt.javacourse.inputoutput.inputfile;

import java.io.IOException;

/**
 * Class that run writing on file.
 * 
 * @author Malvina Makarieva
 */
public class RunWritingInFile {
	/**
	 * Main method. Run writing in file.
	 * 
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		WriteInFile fileWriter = new WriteInFile();
		fileWriter.write();
	}
}
