package com.sirma.itt.javacourse.intro.arrayreverse;

import java.util.Arrays;

import org.junit.Assert;
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

	ReverseArray transformationArray = new ReverseArray();

	@Test
	public void testReverseElemntsInArray() {

		float testInputArray[] = { 1, 2, 3, 4 };
		float testResultArray[] = { 4.0f, 3.0f, 2.0f, 1.0f };

		boolean arrayEquals;
		arrayEquals = Arrays.equals(transformationArray.reverseElemntsInArray(testInputArray),
				testResultArray);
		Assert.assertTrue(arrayEquals);

	}
}
