package com.sirma.itt.javacourse.intro.arrayreverse;

/**
 * Class that contains the method to reverse array.
 * 
 * @author Malvina Makarieva
 */
public class ReverseArray {

	/**
	 * Method that reverse array elements.
	 * 
	 * @param inputArray
	 *            read the console mass
	 */
	public void reverseElemntsInArray(float inputArray[]) {
		float leftElememt;

		for (int i = 0; i < inputArray.length / 2; i++) {
			leftElememt = inputArray[i];
			inputArray[i] = inputArray[(inputArray.length - 1) - i];
			inputArray[(inputArray.length - 1) - i] = leftElememt;
		}

	}

}
