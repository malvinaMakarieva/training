package com.sirma.itt.javacourse.refannotregex.annotation;

import java.util.Arrays;

/**
 * Class describes the order of classes whit annotation SerialNumber.
 * 
 * @author Malvina Makarieva
 */
public class NumberedSorter {
	/**
	 * Default constructor.
	 */
	public NumberedSorter() {

	}

	/**
	 * The method sort array of instance.
	 * 
	 * @param classArray
	 *            array of some classes instance.
	 * @return sort array.
	 */
	public SuperClass[] sortArray(SuperClass[] classArray) {
		Arrays.sort(classArray);
		return classArray;
	}
}
