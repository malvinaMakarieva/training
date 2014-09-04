package com.sirma.itt.javacourse.exceptions.sumator;

import org.junit.Assert;
import org.junit.Test;

/**
 * Class that test methods from class Sumator.
 * 
 * @author Malvina Makarieva
 */
public class SumatorTest {

	/**
	 * Test method summingLargeNumbers() from class Sumator.
	 */
	// @Test
	public void summingLargeNumbersTest() {
		Sumator testSumming = new Sumator();

		Assert.assertEquals("100", testSumming.summingLargeNumbers("50", "50"));
		Assert.assertEquals("15720", testSumming.summingLargeNumbers("7589", "8131"));
	}

	/**
	 * Test method readFromConsole() from class Sumator.
	 */
	@Test
	public void readFromConsoleTest() {
		Sumator testRead = new Sumator();
		System.out.println("Enter number 5");
		String testInput = testRead.readFromConsole();
		Assert.assertEquals("5", testInput);

		System.out.println("Enter number 100");
		String testInputSecond = testRead.readFromConsole();
		Assert.assertEquals("100", testInputSecond);

	}
}
