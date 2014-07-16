package com.sirma.itt.javacourse.intro.arrayreverse;

import java.util.Scanner;

import com.sirma.itt.javacourse.intro.array.Array;

/**
 * Class that running method reverseElemntsInArray(float array[]) from class ReverseArray
 * 
 * @author Malvina Makarieva
 */
public class Run {

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

		System.out.println("Array elemets are " + p.print(array));
		arrayFunction.reverseElemntsInArray(array);
		System.out.println("Exchanged elements of the array looks like " + p.print(array));

	}
}
