package com.sirma.itt.javacourse.intro.arrayreverse;

import com.sirma.itt.javacourse.intro.array.Array;

/**
 * Class that running method reverseElemntsInArray(float array[]) from class ReverseArray
 * 
 * @author Malvina Makarieva
 */
public class RunReverse {

	/**
	 * Main method that read array form console and run reverseElemntsInArray(float array[])
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		ReverseArray arrayReverseFunction = new ReverseArray();
		Array arrayPrintFunction = new Array();
		float inputArray[];
		inputArray = arrayPrintFunction.readArrayFromConsolFloat();

		String inputElements = arrayPrintFunction.print(inputArray);
		System.out.println("Array elemets are " + inputElements);
		arrayReverseFunction.reverseElemntsInArray(inputArray);
		String reversElements = arrayPrintFunction.print(inputArray);
		System.out.println("Exchanged elements of the array looks like " + reversElements);
	}
}
