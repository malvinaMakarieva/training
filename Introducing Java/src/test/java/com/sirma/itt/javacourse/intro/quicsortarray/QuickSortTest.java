package com.sirma.itt.javacourse.intro.quicsortarray;

import org.junit.Assert;
import org.junit.Test;

/**
 * Class that testing QuickSoer class
 * 
 * @author Malvina Makarieva
 */
public class QuickSortTest {
	QuickSort testSort = new QuickSort();
	int[] testArrayNoSort = { 2, 8, 6, 4 };
	int[] testInputArrat = { 5, 20, -45, 0, 35 };

	/**
	 * Method, testing the functionality of testPartition method.
	 */
	@Test
	public void testPartition() {
		int tetsPartOne = testSort.partition(testArrayNoSort, 0, 3);
		int testPartTwo = testSort.partition(testArrayNoSort, 1, 3);
		int testPartThree = testSort.partition(testArrayNoSort, 0, 2);
		int testPartFoure = testSort.partition(testArrayNoSort, 2, 3);

		Assert.assertEquals(3, tetsPartOne);
		Assert.assertEquals(3, testPartTwo);
		Assert.assertEquals(2, testPartThree);
		Assert.assertEquals(3, testPartFoure);
	}

	/**
	 * Method, testing the functionality of the QuickSort class, testPrint method.
	 */
	@Test
	public void testPrint() {
		String testPrintSortArray = testSort.print(testArrayNoSort);
		Assert.assertEquals("[2 8 6 4 ]", testPrintSortArray);

		String testPrintSortArrayTwo = testSort.print(testInputArrat);
		Assert.assertEquals("[5 20 -45 0 35 ]", testPrintSortArrayTwo);
	}
}
