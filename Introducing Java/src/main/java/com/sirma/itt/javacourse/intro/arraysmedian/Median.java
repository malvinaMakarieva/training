package com.sirma.itt.javacourse.intro.arraysmedian;

/**
 * @author Malvina Makarieva
 */
public class Median {

	/**
	 * @param args
	 * @return
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

	public int sum(int array[], int start, int finish) {
		int sum = 0;
		int start2 = 0;
		for (start2 = start; start2 < finish - 1; start2++) {
			sum += array[start2];
		}
		return sum;
	}
}
