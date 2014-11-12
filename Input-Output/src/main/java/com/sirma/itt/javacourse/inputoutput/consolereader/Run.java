package com.sirma.itt.javacourse.inputoutput.consolereader;

/**
 * Main class to run methods from ReadFromConsole class.
 * 
 * @author Malvina Makarieva
 */
public class Run {
	/**
	 * Main method. Input some data from console.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.print("Input string: ");
		System.out.println(ReadFromConsole.readString());

		System.out.print("Input integer: ");
		System.out.println(ReadFromConsole.readInt());

		System.out.print("Input char: ");
		System.out.println(ReadFromConsole.readChar());

		System.out.print("Input float: ");
		System.out.println(ReadFromConsole.readFloat());
	}
}
