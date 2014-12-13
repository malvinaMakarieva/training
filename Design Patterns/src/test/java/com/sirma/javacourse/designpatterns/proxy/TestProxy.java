package com.sirma.javacourse.designpatterns.proxy;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test class.
 * 
 * @author Malvina Makarieva
 */
public class TestProxy {
	/**
	 * Test taking real data through a proxy.
	 */
	@Test
	public void getIntegerFromProxyClass() {
		IntegerFactory proxy = new IntegerFactory();
		Assert.assertEquals(100, proxy.createInstance().getRealIntegerNumber());
	}

}
