package com.sirma.itt.javacourse.refannotregex.annotation;

import java.util.Arrays;

/**
 * @author Malvina Makarieva
 */
public class RunAlignmentAnnotation {
	/**
	 * In the method creates an array of instances of classes successor and sorted.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		SuperClass[] subClassesArray = new SuperClass[3];

		SubClassOne one = new SubClassOne();
		SubClassTwo two = new SubClassTwo();
		SubClassThree three = new SubClassThree();

		subClassesArray[0] = three;
		subClassesArray[1] = one;
		subClassesArray[2] = two;

		Arrays.sort(subClassesArray);
		print(subClassesArray);

	}

	/**
	 * Method print array.
	 * 
	 * @param array
	 *            array whit some class instance.
	 */
	public static void print(SuperClass array[]) {
		for (int i = 0; i < array.length; i++) {
			System.out.println("subClassArray = " + array[i].getClass().getName());
		}
	}

}
