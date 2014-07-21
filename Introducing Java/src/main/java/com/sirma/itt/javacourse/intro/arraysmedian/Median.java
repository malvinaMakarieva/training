package com.sirma.itt.javacourse.intro.arraysmedian;

/**
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
		int sum1 = 0;
		int sum2 = 0;
		float k = 999999;
		int index = 0;
		int medIndex = 0;

		for (i = 0; i < array.length - 1; i++) {
			sum1 = sum(array, 0, index);
			sum2 = sum(array, index, array.length);
			if (Math.abs(sum1 - sum2) < k) {
				k = Math.abs(sum1 - sum2);
				medIndex = index;

			}
			index++;
		}
		return medIndex++;
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
		for (i = start; i < finish - 1; i++) {
			sum += array[i];
		}
		return sum;
	}
}
