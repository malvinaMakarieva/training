package com.sirma.itt.javacourse.intro.arraysmedian;

/**
 * Class contains functions for finding the median of an array
 * 
 * @author Malvina Makarieva
 */
public class Median {

	/**
	 * Method which finds the median not sorted array and returns the index of the item
	 * 
	 * @param array
	 *            an array of user-entered numbers
	 * @return index of the array element, which is the median
	 */

	public int findMedian(int[] array) {
		int i;
		int sumRight = 0;
		int sumLeft = 0;
		float differenceBetweenTheTwoSums = sum(array, 0, array.length);
		int index = 0;
		int medianIndex = 0;
		float absSubtraction = 0;

		for (i = 0; i < array.length - 1; i++) {
			sumRight = sum(array, 0, index);
			sumLeft = sum(array, index + 1, array.length);
			absSubtraction = Math.abs(sumLeft - sumRight);
			if (absSubtraction <= differenceBetweenTheTwoSums) {
				differenceBetweenTheTwoSums = absSubtraction;
				medianIndex = index;
			}
			index++;
		}
		return medianIndex++;
	}

	/**
	 * Method which calculates the amount of one side of the selected area to medium
	 * 
	 * @param array
	 *            an array of user-entered numbers
	 * @param start
	 *            Index of the starting element
	 * @param finish
	 *            Index of the final element
	 * @return
	 */

	public int sum(int array[], int start, int finish) {
		int sum = 0;
		int i = 0;
		for (i = start; i < finish; i++) {
			sum += array[i];
		}
		return sum;
	}
}
