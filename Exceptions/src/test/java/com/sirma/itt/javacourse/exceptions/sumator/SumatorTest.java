package com.sirma.itt.javacourse.exceptions.sumator;

import org.junit.Assert;
import org.junit.Test;

/**
 * Class that test methods from class Sumator.
 * 
 * @author Malvina Makarieva
 */
public class SumatorTest {
	Sumator testSumming = new Sumator();

	/**
	 * Test method summingLargeNumbers() from class Sumator.
	 */
	@Test
	public void summingLargeNumbersTest() {
		Assert.assertEquals("Sum is 100", testSumming.summingStrings("50", "50"));
		Assert.assertEquals("Sum is 15720", testSumming.summingStrings("7589", "8131"));
	}

	/**
	 * Method that tested exception.
	 */
	@Test(expected = NumberFormatException.class)
	public void testException() {
		testSumming.summingStrings("50", "abc");

	}

}
