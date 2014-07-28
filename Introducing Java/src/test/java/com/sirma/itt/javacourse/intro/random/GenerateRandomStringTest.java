package com.sirma.itt.javacourse.intro.random;

import org.junit.Assert;
import org.junit.Test;

/**
 * Class that testing GenerateString class
 * 
 * @author Malvina Makarieva
 */
public class GenerateRandomStringTest {
	/**
	 * Method, testing the functionality of the method generatesString().
	 */
	@Test
	public void testGenerateString() {
		GenerateRandomString grateRandom = new GenerateRandomString();
		String testStringRandomLenghtEight = grateRandom.generateString(8);
		String testStringRandomLenghtTwenty = grateRandom.generateString(20);
		String testStringRandomLenghtZero = grateRandom.generateString(0);
		String testStringRandomLenghtFifty = grateRandom.generateString(50);
		String testStringRandomLenghtThirty = grateRandom.generateString(10);

		Assert.assertEquals(8, testStringRandomLenghtEight.length());
		Assert.assertEquals(20, testStringRandomLenghtTwenty.length());
		Assert.assertEquals(0, testStringRandomLenghtZero.length());
		Assert.assertEquals(50, testStringRandomLenghtFifty.length());
		Assert.assertNotEquals(30, testStringRandomLenghtThirty.length());
	}
}
