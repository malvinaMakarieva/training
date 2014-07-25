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
	 * @param array
	 *            read the console mass
	 */
	public final void reverseElemntsInArray(float array[]) {
		float leftElememt;

		for (int i = 0; i < array.length / 2; i++) {
			leftElememt = array[i];
			array[i] = array[(array.length - 1) - i];
			array[(array.length - 1) - i] = leftElememt;
		}

	}

}
