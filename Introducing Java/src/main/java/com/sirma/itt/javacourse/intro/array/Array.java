package com.sirma.itt.javacourse.intro.array;

/**
 * Class that contains methods for minimum elements of an array, sum of the elements of the array
 * and output array
 * 
 * @author Malvina Makarieva
 */
public class Array {
	/**
	 * A public float method that returns the index of the element with minimum value
	 * 
	 * @param array
	 *            array entered by the user, which will search for items
	 * @return minElement - element with minimum value
	 */
	public float getMinElement(float[] array) {
		float minElement = array[0];

		for (int i = 1; i < array.length; i++) {
			if (array[i] < minElement) {
				minElement = array[i];
			}
		}
		return minElement;
	}

	/**
	 * A public float method that returns the sum of all elements in the array
	 * 
	 * @param array
	 *            array entered by the user, which will search for items
	 * @return sum - sum of all elements in the array
	 */
	public float sum(float[] array) {
		float sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		return sum;
	}

	/**
	 * A public string method that prints the array's elements to screen
	 * 
	 * @param array
	 *            array entered by the user, which will search for items
	 * @return array element in format "[1, 2, 4, 5,]"
	 */
	public String print(float array[]) {
		String result = "[";
		for (int i = 0; i < array.length; i++) {
			result += array[i] + ", ";
		}
		return result += "]";
	}
}