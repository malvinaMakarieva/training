package com.sirma.itt.javacourse.inputoutput.inputfile;

import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

/**
 * The class contains methods that write in text file.
 * 
 * @author Malvina Makarieva
 */
public class WriteInFile {
	private static Scanner sc = new Scanner(System.in);

	/**
	 * Create file and write in file from console.
	 *
	 * @throws IOException
	 */
	protected void write() throws IOException {
		System.out.print("File name: ");
		String fileName = sc.nextLine();
		FileWriter fileWriter = new FileWriter(fileName, true);

		System.out.println("Input text: ");
		String line = sc.nextLine();
		while (!line.equals(".")) {
			fileWriter.append(line);
			line = sc.nextLine();
		}
		fileWriter.close();
		sc.close();
	}

	/**
	 * Getter method for userInput.
	 *
	 * @return the userInput
	 */
	public Scanner getSc() {
		return sc;
	}

	/**
	 * Setter method for userInput.
	 *
	 * @param userInput
	 *            the userInput to set
	 */
	public void setSc(InputStream stream) {
		WriteInFile.sc = new Scanner(stream);
	}

}
