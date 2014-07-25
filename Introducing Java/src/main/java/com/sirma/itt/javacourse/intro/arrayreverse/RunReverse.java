package com.sirma.itt.javacourse.intro.arrayreverse;

import java.util.Scanner;

import com.sirma.itt.javacourse.intro.array.Array;

/**
 * Class that running method reverseElemntsInArray(float array[]) from class ReverseArray
 * 
 * @author Malvina Makarieva
 */
public class RunReverse {

	/**
	 * Main method that read array form console and run reverseElemntsInArray(float array[])
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int i;
		int element = 0;

		Scanner input = new Scanner(System.in);
		System.out.print("Length of array = ");
		int length = input.nextInt();

		float[] array = new float[length];

		for (i = 0; i < length; i++) {
			System.out.print("array[" + i + "] = ");
			element = input.nextInt();
			array[i] = element;
		}

		ReverseArray arrayFunction = new ReverseArray();
		Array p = new Array();

		String inputElements = p.print(array);
		System.out.println("Array elemets are " + inputElements);
		arrayFunction.reverseElemntsInArray(array);
		String reversElements = p.print(array);
		System.out.println("Exchanged elements of the array looks like " + reversElements);

		if (input != null) {
			input.close();
		}

	}
}
