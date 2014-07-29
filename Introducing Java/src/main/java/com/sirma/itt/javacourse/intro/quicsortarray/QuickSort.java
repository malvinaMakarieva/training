package com.sirma.itt.javacourse.intro.quicsortarray;

/**
 * Class that contains methods - some sort of parts of the array, a recursive call of the method for
 * sorting and ordering one array.
 * 
 * @author Malvina Makarieva
 */
public class QuickSort {
	/**
	 * @param imputArray
	 *            input array form user
	 * @param leftIndex
	 *            index of left element
	 * @param rightIndex
	 *            index of right element
	 * @return index of left margin
	 */
	int partition(int imputArray[], int leftIndex, int rightIndex) {
		int i = leftIndex, j = rightIndex;
		int tmp;
		int pivot = imputArray[(leftIndex + rightIndex) / 2];

		while (i <= j) {
			while (imputArray[i] < pivot)
				i++;
			while (imputArray[j] > pivot)
				j--;
			if (i <= j) {
				tmp = imputArray[i];
				imputArray[i] = imputArray[j];
				imputArray[j] = tmp;
				i++;
				j--;
			}
		}
		return i;
	}

	/**
	 * Recursively invokes sorting
	 * 
	 * @param array
	 *            input array from user
	 * @param left
	 *            index of first element form array.
	 * @param right
	 *            index of last element from array.
	 */
	public void quickSort(int array[], int left, int right) {
		int index = partition(array, left, right);
		if (left < index - 1)
			quickSort(array, left, index - 1);
		if (index < right)
			quickSort(array, index, right);
	}

	/**
	 * A public string method that prints the array's elements to screen
	 *
	 * @param array
	 *            array entered by the user, which will search for items
	 * @return array element in format "[1 2 4 5]"
	 */
	public String print(int array[]) {
		String result = "[";
		for (int i = 0; i < array.length; i++) {
			result += array[i] + " ";
		}
		return result += "]";
	}
}
