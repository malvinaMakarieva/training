package com.sirma.itt.javacourse.intro.quicsortarray;

/**
 * Class that contains three methods. some sort of parts of the array, a recursive call of the
 * method for sorting and ordering one array.
 * 
 * @author Malvina Makarieva
 */
public class QuickSort {
	/**
	 * @param arr
	 *            input array form user
	 * @param left
	 *            index of left element
	 * @param right
	 *            index of right element
	 * @return index of left margin
	 */
	int partition(int arr[], int left, int right) {
		int i = left, j = right;
		int tmp;
		int pivot = arr[(left + right) / 2];

		while (i <= j) {
			while (arr[i] < pivot)
				i++;
			while (arr[j] > pivot)
				j--;
			if (i <= j) {
				tmp = arr[i];
				arr[i] = arr[j];
				arr[j] = tmp;
				i++;
				j--;
			}
		}
		return i;
	}

	/**
	 * Recursively invokes sorting
	 * 
	 * @param arr
	 *            input array from user
	 * @param left
	 *            index of first element form array.
	 * @param right
	 *            index of last element from array.
	 */
	public void quickSort(int arr[], int left, int right) {
		int index = partition(arr, left, right);
		if (left < index - 1)
			quickSort(arr, left, index - 1);
		if (index < right)
			quickSort(arr, index, right);
	}

	/**
	 * A public string method that prints the array's elements to screen
	 *
	 * @param array
	 *            array entered by the user, which will search for items
	 * @return array element in format "[1, 2, 4, 5]"
	 */
	public String print(int array[]) {
		String result = "[";
		for (int i = 0; i < array.length - 1; i++) {
			result += array[i] + ", ";
		}
		return (result += array[array.length - 1] + "]");
	}
}
