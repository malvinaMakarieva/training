package com.sirma.itt.javacourse.refannotregex.annotation;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.Test;

/**
 * Test class testing the SortNumberedClasses class.
 * 
 * @author Malvina Makarieva
 */
public class NumberSorterTest {

	NumberedSorter sort = new NumberedSorter();

	/**
	 * Test sorting the array of instances of classes
	 */
	@Test
	public void testSortArray() {
		SubClassOne firstChild = new SubClassOne();
		SubClassTwo secondChild = new SubClassTwo();
		SubClassThree thirdChild = new SubClassThree();

		SuperClass[] sortInputArray = sort.sortArray(new SuperClass[] { thirdChild, firstChild,
				secondChild });
		SuperClass[] resultArray = { firstChild, secondChild, thirdChild };
		assertTrue(Arrays.equals(sortInputArray, resultArray));
	}
}
