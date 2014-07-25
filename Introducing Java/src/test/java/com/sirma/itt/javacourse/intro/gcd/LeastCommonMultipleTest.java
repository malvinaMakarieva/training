package com.sirma.itt.javacourse.intro.gcd;

import org.junit.Assert;
import org.junit.Test;

/**
 * Class that testing LCM class
 * 
 * @author Malvina Makarieva
 */
public class LeastCommonMultipleTest {
	/**
	 * Method, testing the functionality of the LCM class, lcm method.
	 */
	@Test
	public void testLCM() {
		LeastCommonMultiple testLcm = new LeastCommonMultiple();

		int testLcmOne = testLcm.leastCommonMultipleCalculation(21, 180);
		int testLcmTwo = testLcm.leastCommonMultipleCalculation(5, 10);
		int testLcmTree = testLcm.leastCommonMultipleCalculation(37, 77);
		int testLcmFour = testLcm.leastCommonMultipleCalculation(77, 77);

		Assert.assertEquals(1260, testLcmOne);
		Assert.assertEquals(10, testLcmTwo);
		Assert.assertEquals(2849, testLcmTree);
		Assert.assertNotEquals(2849, testLcmFour);
	}
}
