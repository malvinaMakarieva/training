package com.sirma.itt.javacourse.intro.quicsortarray;


/**
 * Class that run qSort(float array[], int lenth).
 * 
 * @author Malvina Makarieva
 */
public class Run {

	/**
	 * Main function that run method form class QuickSort.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// int i;
		// int element = 0;
		//
		// Scanner input = new Scanner(System.in);
		// System.out.print("Length of array = ");
		// int length = input.nextInt();
		//
		// int[] array = new int[length];
		//
		// for (i = 0; i < length; i++) {
		// System.out.print("array[" + i + "] = ");
		// element = input.nextInt();
		// array[i] = element;
		// }

		int[] array1 = { 1, 3, 2 };
		QuickSort qs = new QuickSort();

		int[] arraySortReault = qs.quickSort(array1, 0, array1.length);

		qs.print(arraySortReault);

	}

}
