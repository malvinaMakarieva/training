package com.sirma.itt.javacourse.intro.array;

import org.junit.Assert;
import org.junit.Test;

/**
 * Class that testing Array class
 * 
 * @author Malvina Makarieva
 */
public class ArrayTest {
	Array testArray = new Array();

	/**
	 * Method, testing the functionality of the Array class, getMinElement(float[] array) method.
	 */
	@Test
	public void testGetMinElement() {
		float[] testArrayOne = new float[] { 60, 20 };
		float[] testArrayTwo = new float[] { 20, 30, -10f };
		float[] testArrayTree = new float[] { 0, 0, 0, 0 };
		float[] testArrayFour = new float[] { 0, 0, 0, 0, 0, 1 };

		float testMinElementOne = testArray.getMinElement(testArrayOne);
		float testMinElementTwo = testArray.getMinElement(testArrayTwo);
		float testMinElementTree = testArray.getMinElement(testArrayTree);
		float testMinElementFour = testArray.getMinElement(testArrayFour);

		Assert.assertEquals(20, testMinElementOne, 0.1);
		Assert.assertEquals(-10, testMinElementTwo, 0.1);
		Assert.assertEquals(0, testMinElementTree, 0.1);
		Assert.assertNotEquals(1, testMinElementFour, 0.1);

	}

	/**
	 * Method, testing the functionality of the Array class, sum(float[] array) method.
	 */
	@Test
	public void testSum() {
		float[] testArrayForSumOne = new float[] { 10, 10 };
		float[] testArrayForSumTwo = new float[] { 10, -20, 100, 8, 9 };
		float[] testArrayForSumTree = new float[] { 1, 2.5f, 3, 4, 22 };
		float[] testArrayForSumFour = new float[] { 10, 10, 10, 20, 50 };

		float testSumOne = testArray.sum(testArrayForSumOne);
		float testSumTwo = testArray.sum(testArrayForSumTwo);
		float testSumTree = testArray.sum(testArrayForSumTree);
		float testSumFour = testArray.sum(testArrayForSumFour);

		Assert.assertEquals(20, testSumOne, 0.1);
		Assert.assertEquals(107, testSumTwo, 0.1);
		Assert.assertEquals(32.5, testSumTree, 0.1);
		Assert.assertNotEquals(101, testSumFour, 0.1);
	}

	/**
	 * Method, testing the functionality of the Array class, print(float[] array) method.
	 */
	@Test
	public void testPrint() {
		float[] testArrayForPrintOne = new float[] { 1, 2.5f, 3, 4, 5 };
		float[] testArrayForPrintTwo = new float[] { 0, 0, 0, 0, 0, 0 };
		float[] testArrayForPrintTree = new float[] { -7, 0, 33, -105 };

		String testPrintOne = testArray.print(testArrayForPrintOne);
		String testPrintTwo = testArray.print(testArrayForPrintTwo);
		String testPrintTree = testArray.print(testArrayForPrintTree);

		Assert.assertEquals("[1.0 2.5 3.0 4.0 5.0 ]", testPrintOne);
		Assert.assertEquals("[0.0 0.0 0.0 0.0 0.0 0.0 ]", testPrintTwo);
		Assert.assertEquals("[-7.0 0.0 33.0 -105.0 ]", testPrintTree);

	}
}
