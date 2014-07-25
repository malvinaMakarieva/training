package com.sirma.itt.javacourse.intro.array;

import java.util.Scanner;

/**
 * Class that run methods from Array class
 * 
 * @author Malvina Makarieva
 */
public class RunArrayFunction {

	/**
	 * Main method for run methods form class Array and read form console
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int element = 0;

		Scanner input = new Scanner(System.in);
		System.out.print("Length of array = ");
		int length = input.nextInt();

		float[] array = new float[length];

		for (int i = 0; i < length; i++) {
			System.out.print("array[" + i + "] = ");
			element = input.nextInt();
			array[i] = element;
		}

		Array arrayFunction = new Array();

		System.out.println("Array elemets are " + arrayFunction.print(array));

		System.out.println("Minimal element is " + arrayFunction.getMinElement(array));

		System.out.println("Sum is " + arrayFunction.sum(array));

		if (input != null) {
			input.close();
		}
	}

}
