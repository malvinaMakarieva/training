package com.sirma.itt.javacourse.intro.arrayreverse;

import org.junit.Test;

/**
 * Class that testing method reverseElementInArray form class ReverseArray
 * 
 * @author Malvina Makarieva
 */
public class ReverseArrayTest {
	/**
	 * Method, testing the functionality of the method reverseElementInArray.
	 */

	ReverseArray r = new ReverseArray();

	@Test
	public void testReverseElemntsInArray() {

		float arr[] = { 1, 2, 3, 4 };
		float resultArray[] = { 4, 3, 2, 1 };
		r.reverseElemntsInArray(arr);

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == resultArray[i]) {
				System.out.println("good");
			} else {
				System.out.println("fail");
			}
		}

	}
}
