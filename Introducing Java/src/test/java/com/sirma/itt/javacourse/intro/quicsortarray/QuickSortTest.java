package com.sirma.itt.javacourse.intro.quicsortarray;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author Malvina Makarieva
 */
public class QuickSortTest {
	QuickSort qs = new QuickSort();
	int[] testArrayNoSort = { 2, 8, 6, 4 };
	int[] arr = { 5, 20, -45, 0, 35 };

	@Test
	public void testPartition() {
		int tetsPartOne = qs.partition(testArrayNoSort, 0, 3);
		int testPartTwo = qs.partition(testArrayNoSort, 1, 3);
		int testPartThree = qs.partition(testArrayNoSort, 0, 2);
		int testPartFoure = qs.partition(testArrayNoSort, 2, 3);

		Assert.assertEquals(3, tetsPartOne);
		Assert.assertEquals(3, testPartTwo);
		Assert.assertEquals(2, testPartThree);
		Assert.assertEquals(3, testPartFoure);
	}

	@Test
	public void testPrint() {
		String testPrintSortArray = qs.print(testArrayNoSort);
		Assert.assertEquals("[2 8 6 4 ]", testPrintSortArray);

		String testPrintSortArrayTwo = qs.print(arr);
		Assert.assertEquals("[5 20 -45 0 35 ]", testPrintSortArrayTwo);
	}
}
