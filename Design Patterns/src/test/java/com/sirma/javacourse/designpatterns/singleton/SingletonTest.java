package com.sirma.javacourse.designpatterns.singleton;

import org.junit.Assert;
import org.junit.Test;

/**
 * Class that test Singleton class.
 * 
 * @author Malvina Makarieva
 */
public class SingletonTest {
	/**
	 * Method test instantiation only one instance
	 */
	@Test
	public void chekInstance() {
		Singleton singletonOne = Singleton.getInstance();
		Singleton singletonTwo = Singleton.getInstance();
		Assert.assertEquals(singletonOne, singletonTwo);
	}

}