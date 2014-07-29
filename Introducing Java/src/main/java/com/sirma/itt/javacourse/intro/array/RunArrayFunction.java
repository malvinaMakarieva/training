package com.sirma.itt.javacourse.intro.array;

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
		float array[];

		Array arrayFunction = new Array();

		array = arrayFunction.readArrayFromConsolFloat();

		System.out.println("Array elemets are " + arrayFunction.print(array));

		System.out.println("Minimal element is " + arrayFunction.getMinElement(array));

		System.out.println("Sum is " + arrayFunction.sum(array));

	}

}
