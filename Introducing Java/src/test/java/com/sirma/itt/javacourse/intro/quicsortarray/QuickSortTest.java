package com.sirma.itt.javacourse.intro.quicsortarray;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author Malvina Makarieva
 */
public class QuickSortTest {
	QuickSort qs = new QuickSort();
	int[] arr = { 2, 8, 6, 4 };

	@Test
	public void testPartition() {
		Assert.assertEquals(3, qs.partition(arr, 0, 3));
		Assert.assertEquals(3, qs.partition(arr, 1, 3));
		Assert.assertEquals(2, qs.partition(arr, 0, 2));
		Assert.assertEquals(3, qs.partition(arr, 2, 3));
	}

	@Test
	public void testPrint() {
		Assert.assertEquals("[2, 8, 6, 4]", qs.print(arr));
	}
}
