package com.sirma.itt.javacourse.intro.gcd;

import org.junit.Assert;
import org.junit.Test;

/**
 * Class that testing GCD class
 * 
 * @author Malvina Makarieva
 */
public class GreatestCommonDivisionTest {

	/**
	 * Method, testing the functionality of the GCD class, greatestCommonDivisorCalculation method.
	 */
	@Test
	public void testGreatestCommonDivisorCalculation() {

		GreatestCommonDivisor testGcd = new GreatestCommonDivisor();
		int testGcdOne = testGcd.greatestCommonDivisorCalculation(21, 180);
		int testGcdTwo = testGcd.greatestCommonDivisorCalculation(5, 10);
		int testGcdTree = testGcd.greatestCommonDivisorCalculation(37, 77);
		int testGcdFour = testGcd.greatestCommonDivisorCalculation(30, 77);

		Assert.assertEquals(3, testGcdOne);
		Assert.assertEquals(5, testGcdTwo);
		Assert.assertEquals(1, testGcdTree);
		Assert.assertNotEquals(4, testGcdFour);
	}
}
