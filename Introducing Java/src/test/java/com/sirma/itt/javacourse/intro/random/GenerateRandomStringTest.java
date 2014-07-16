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
		GenerateRandomString g = new GenerateRandomString();

		Assert.assertEquals(8, g.generateString(8).length());
		Assert.assertEquals(20, g.generateString(20).length());
		Assert.assertEquals(0, g.generateString(0).length());
		Assert.assertEquals(50, g.generateString(50).length());
		Assert.assertNotEquals(30, g.generateString(10).length());
	}

}
