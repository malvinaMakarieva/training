package com.sirma.itt.javacourse.intro.quicsortarray;

import com.sirma.itt.javacourse.intro.array.Array;

/**
 * This class read from console and running method
 * 
 * @author Malvina Makarieva
 */
public class RunSorting {
	/**
	 * Method that reads from the console and perform the quickSort(int arr[], int left, int right)
	 * and print(int arr[], int left, int right) methods of the class QuickSort.
	 * 
	 * @param args
	 */

	public static void main(String[] args) {

		Array arrayFunction = new Array();
		int[] inputArray;
		inputArray = arrayFunction.readArrayFromConsole();

		QuickSort sort = new QuickSort();

		String printInputArray = sort.print(inputArray);
		System.out.println(printInputArray);
		sort.quickSort(inputArray, 0, inputArray.length - 1);
		String printSortArray = sort.print(inputArray);
		System.out.println(printSortArray);
	}
}
