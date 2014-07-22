package com.sirma.itt.javacourse.intro.quicsortarray;

import java.util.Scanner;

/**
 * This class read from console and running method
 * 
 * @author Malvina Makarieva
 */
public class Run {
	/**
	 * Method that reads from the console and perform the quickSort(int arr[], int left, int right)
	 * and print(int arr[], int left, int right) methods of the class QuickSort.
	 * 
	 * @param args
	 */

	public static void main(String[] args) {

		int i;
		int element = 0;

		Scanner input = new Scanner(System.in);
		System.out.print("Length of array = ");
		int length = input.nextInt();

		int[] array = new int[length];
		int[] arrayResult = new int[length];

		for (i = 0; i < length; i++) {
			System.out.print("array[" + i + "] = ");
			element = input.nextInt();
			array[i] = element;
		}

		QuickSort qs = new QuickSort();

		System.out.println(qs.print(array));
		qs.quickSort(array, 0, array.length - 1);
		System.out.println(qs.print(array));
	}
}
