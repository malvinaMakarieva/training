package com.sirma.itt.javacourse.intro.arraysmedian;

import org.junit.Assert;
import org.junit.Test;

/**
 * Class that testing methods form class Median
 * 
 * @author Malvina Makarieva
 */
public class MedianTest {
	Median median = new Median();

	/**
	 * Testing summing the elements of an array of initial to final element.
	 */
	@Test
	public void testSum() {
		int array[] = { 1, 3, 6, 5 };
		int testSumOne = median.sum(array, 1, 4);
		int testSumTwo = median.sum(array, 1, 1);
		int testSumTree = median.sum(array, 0, 4);
		int testSumFour = median.sum(array, 1, 3);

		Assert.assertEquals(9, testSumOne);
		Assert.assertEquals(0, testSumTwo);
		Assert.assertEquals(10, testSumTree);
		Assert.assertEquals(3, testSumFour);
	}

	/**
	 * Testing finding a median
	 */
	@Test
	public void testFindMedian() {
		int array2[] = { 1, 2, 3, 4, 5 };
		int array3[] = { 4, 5, 99, -1, 5, 6 };

		int testFindingMedianSecondArray = median.findMedian(array2);
		int testFindingMedianThirdArray = median.findMedian(array3);

		Assert.assertEquals(3, testFindingMedianSecondArray);
		Assert.assertEquals(3, testFindingMedianThirdArray);

	}

}
