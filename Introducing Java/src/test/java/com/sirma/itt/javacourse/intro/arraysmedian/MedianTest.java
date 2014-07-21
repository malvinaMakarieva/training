package com.sirma.itt.javacourse.intro.arraysmedian;

import org.junit.Assert;
import org.junit.Test;

/**
 * Class that testing methods form class Median
 * 
 * @author Malvina Makarieva
 */
public class MedianTest {
	Median m = new Median();

	/**
	 * Testing summing the elements of an array of initial to final element.
	 */
	@Test
	public void testSum() {
		int array[] = { 1, 3, 6, 5 };
		Assert.assertEquals(9, m.sum(array, 1, 4));
		Assert.assertEquals(0, m.sum(array, 1, 1));
		Assert.assertEquals(10, m.sum(array, 0, 4));
		Assert.assertEquals(3, m.sum(array, 1, 3));
	}

	/**
	 * Testing finding a median
	 */
	@Test
	public void testFindMedian() {
		int array2[] = { 1, 2, 3, 4, 5 };
		int array3[] = { 4, 5, 99, -1, 5, 6 };

		Assert.assertEquals(3, m.findMedian(array2));
		Assert.assertEquals(3, m.findMedian(array3));

	}

}
