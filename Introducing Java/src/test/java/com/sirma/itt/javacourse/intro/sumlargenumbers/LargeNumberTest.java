package com.sirma.itt.javacourse.intro.sumlargenumbers;

import org.junit.Assert;
import org.junit.Test;

import com.sirma.itt.javacourse.intro.sumlargenumbers.LargeNumber;

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
		LargeNumber lg = new LargeNumber();
		Assert.assertEquals("1254892040790802",
				lg.summingLargeNumbers("1254885458545254", "6582245548"));
		Assert.assertEquals("356625821500", lg.summingLargeNumbers("265945", "356625555555"));
		Assert.assertEquals("0", lg.summingLargeNumbers("0", "0"));
		Assert.assertEquals("025", lg.summingLargeNumbers("013", "12"));
		Assert.assertEquals("15", lg.summingLargeNumbers("13", "02"));

	}

}
