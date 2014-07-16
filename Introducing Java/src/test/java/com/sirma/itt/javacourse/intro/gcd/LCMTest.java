package com.sirma.itt.javacourse.intro.gcd;

import org.junit.Assert;
import org.junit.Test;

/**
 * Class that testing LCM class
 * 
 * @author Malvina Makarieva
 */
public class LCMTest {
	/**
	 * Method, testing the functionality of the LCM class, lcm method.
	 */
	@Test
	public void testLCM() {
		LCM testLcm = new LCM();
		Assert.assertEquals(1260, testLcm.lcm(21, 180));
		Assert.assertEquals(10, testLcm.lcm(5, 10));
		Assert.assertEquals(2849, testLcm.lcm(37, 77));
		Assert.assertNotEquals(2849, testLcm.lcm(77, 77));
	}

}
