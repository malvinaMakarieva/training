package com.sirma.itt.javacourse.intro.sumlargenumbers;

import org.junit.Assert;
import org.junit.Test;

/**
 * Class that contains method summingLargeNumbers(String firstNum, String secondNum) from class
 * LargeNumber
 * 
 * @author Malvina Makarieva
 */
public class LargeNumberTest {
	/**
	 * A method that testing a summing for large numbers from strings
	 */
	@Test
	public void testSumLargeNumbers() {
		LargeNumber testLargeNumber = new LargeNumber();
		String sumOfLargeNumberOne = testLargeNumber.summingLargeNumbers("1254885458545254",
				"6582245548");
		String sumOfLargeNumberTwo = testLargeNumber.summingLargeNumbers("265945", "356625555555");
		String sumOfLargeNumberThree = testLargeNumber.summingLargeNumbers("0", "0");
		String sumOfLargeNumberFour = testLargeNumber.summingLargeNumbers("013", "12");
		String sumOfLargeNumberFive = testLargeNumber.summingLargeNumbers("13", "02");

		Assert.assertEquals("1254892040790802", sumOfLargeNumberOne);
		Assert.assertEquals("356625821500", sumOfLargeNumberTwo);
		Assert.assertEquals("0", sumOfLargeNumberThree);
		Assert.assertEquals("025", sumOfLargeNumberFour);
		Assert.assertEquals("15", sumOfLargeNumberFive);

	}
}
