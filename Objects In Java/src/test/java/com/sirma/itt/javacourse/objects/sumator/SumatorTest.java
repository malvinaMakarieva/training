package com.sirma.itt.javacourse.objects.sumator;

import java.math.BigDecimal;
import java.math.BigInteger;

import org.junit.Assert;
import org.junit.Test;

/**
 * Class that testing methods from class Sumator.
 * 
 * @author Malvina Makarieva
 */
public class SumatorTest {

	Sumator testSumming = new Sumator();

	/**
	 * Test the functionality of the method - sum(int a, int b).
	 */
	@Test
	public void testSumInteger() {
		Assert.assertEquals(10, testSumming.sum(5, 5));
		Assert.assertEquals(5, testSumming.sum(10, -5));
		Assert.assertEquals(-5, testSumming.sum(-10, 5));
		Assert.assertEquals(-250, testSumming.sum(-200, -50));
	}

	/**
	 * Test the functionality of the method - sum(float a, float b).
	 */
	@Test
	public void testSumFloat() {
		Assert.assertEquals(10.5, testSumming.sum(5.5, 5.0), 0);
		Assert.assertEquals(-100.2, testSumming.sum(-200, 99.8), 0);
		Assert.assertEquals(100.2, testSumming.sum(200, -99.8), 0);
		Assert.assertEquals(-299.8, testSumming.sum(-200, -99.8), 0);
	}

	/**
	 * Test the functionality of the method - sum(double a, double b).
	 */
	@Test
	public void testSumDouble() {
		Assert.assertEquals(10.356, testSumming.sum(10.0, 0.356), 0);
		Assert.assertEquals(9.644, testSumming.sum(10.0, -0.356), 0);
		Assert.assertEquals(-9.644, testSumming.sum(-10.0, 0.356), 0);
		Assert.assertEquals(-10.356, testSumming.sum(-10.0, -0.356), 0);
	}

	/**
	 * Test the functionality of the method - sum(String a, String b).
	 */
	@Test
	public void testSumString() {
		Assert.assertEquals("66664456", testSumming.sum("12", "66664444"));
		Assert.assertEquals("236596", testSumming.sum("236584", "12"));
		Assert.assertEquals("66901028", testSumming.sum("236584", "66664444"));
	}

	/**
	 * Test the functionality of the method - sum(BigInteger a, BigInteger b).
	 */
	@Test
	public void testSumBigInteger() {
		Assert.assertEquals(new BigInteger("512"),
				testSumming.sum(new BigInteger("256"), new BigInteger("256")));
		Assert.assertEquals(new BigInteger("744"),
				testSumming.sum(new BigInteger("-256"), new BigInteger("1000")));
		Assert.assertEquals(new BigInteger("-744"),
				testSumming.sum(new BigInteger("256"), new BigInteger("-1000")));
		Assert.assertEquals(new BigInteger("-1256"),
				testSumming.sum(new BigInteger("-256"), new BigInteger("-1000")));
	}

	/**
	 * Test the functionality of the method - sum(BigDecimal a, BigDecimal b)
	 */
	@Test
	public void testSumBigDecimal() {
		Assert.assertEquals(new BigDecimal("1457.533"),
				testSumming.sum(new BigDecimal("562.213"), new BigDecimal("895.320")));
		Assert.assertEquals(new BigDecimal("333.107"),
				testSumming.sum(new BigDecimal("-562.213"), new BigDecimal("895.320")));
		Assert.assertEquals(new BigDecimal("-1457.533"),
				testSumming.sum(new BigDecimal("-562.213"), new BigDecimal("-895.320")));

	}
}
