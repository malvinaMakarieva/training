package com.sirma.itt.javacourse.intro.gcd;

import org.junit.Assert;
import org.junit.Test;

/**
 * Class that testing GCD class
 * 
 * @author Malvina Makarieva
 */
public class GCDTest {

	/**
	 * Method, testing the functionality of the GCD class, gcd method.
	 */
	@Test
	public void testGCD() {
		GCD testGcd = new GCD();
		Assert.assertEquals(3, testGcd.gcd(21, 180));
		Assert.assertEquals(5, testGcd.gcd(5, 10));
		Assert.assertEquals(1, testGcd.gcd(37, 77));
		Assert.assertNotEquals(4, testGcd.gcd(30, 77));
	}

}
