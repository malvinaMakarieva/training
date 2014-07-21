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
		Assert.assertEquals(20, testArray.getMinElement(new float[] { 60, 20 }), 0.1);
		Assert.assertEquals(-10, testArray.getMinElement(new float[] { 20, 30, (-10) }), 0.1);
		Assert.assertEquals(0, testArray.getMinElement(new float[] { 0, 0, 0, 0 }), 0.1);
		Assert.assertNotEquals(1, testArray.getMinElement(new float[] { 0, 0, 0, 0, 0, 1 }), 0.1);

	}

	/**
	 * Method, testing the functionality of the Array class, sum(float[] array) method.
	 */
	@Test
	public void testSum() {
		Assert.assertEquals(20, testArray.sum(new float[] { 10, 10 }), 0.1);
		Assert.assertEquals(107, testArray.sum(new float[] { 10, -20, 100, 8, 9 }), 0.1);
		Assert.assertEquals(32.5, testArray.sum(new float[] { 1, (float) 2.5, 3, 4, 22 }), 0.1);
		Assert.assertNotEquals(101, testArray.sum(new float[] { 10, 10, 10, 20, 50 }), 0.1);
	}

	/**
	 * Method, testing the functionality of the Array class, print(float[] array) method.
	 */
	@Test
	public void testPrint() {
		Assert.assertEquals("[1.0, 2.5, 3.0, 4.0, 5.0]",
				testArray.print(new float[] { 1, (float) 2.5, 3, 4, 5 }));
		Assert.assertEquals("[0.0, 0.0, 0.0, 0.0, 0.0, 0.0]",
				testArray.print(new float[] { 0, 0, 0, 0, 0, 0 }));
		Assert.assertEquals("[-7.0, 0.0, 33.0, -105.0]",
				testArray.print(new float[] { (-7), 0, 33, -105 }));

	}
}
