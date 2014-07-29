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
		int testaArray[] = { 1, 3, 6, 5 };

		int testSumOne = median.sum(testaArray, 0, 0);
		int testSumTwo = median.sum(testaArray, 1, 4);
		int testSumTree = median.sum(testaArray, 0, 2);
		int testSumFour = median.sum(testaArray, 1, 3);

		Assert.assertEquals(0, testSumOne);
		Assert.assertEquals(14, testSumTwo);
		Assert.assertEquals(4, testSumTree);
		Assert.assertEquals(9, testSumFour);

	}

	/**
	 * Testing finding a median
	 */
	@Test
	public void testFindMedian() {
		int testArray2[] = { 1, 2, 3, 4, 5 };
		int testArray3[] = { 7, 6, -8, 2, 6, 4, 3 };

		int testFindingMedianSecondArray = median.findMedian(testArray2);
		int testFindingMedianThirdArray = median.findMedian(testArray3);

		Assert.assertEquals(3, testFindingMedianSecondArray);
		Assert.assertEquals(1, testFindingMedianThirdArray);

	}

}
