package com.sirma.itt.javacourse.refannotregex.instanceclass;

import org.junit.Assert;
import org.junit.Test;

/**
 * Class that test methods from class InstanceOfClass.
 * 
 * @author Malvina Makarieva
 */
public class InstanceOfClassTest {
	InstanceOfClass instanceByName = new InstanceOfClass();

	/**
	 * Test if name of interface is this.
	 * 
	 * @throws ClassNotFoundException
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	@Test
	public void testGetInterfaceName() throws ClassNotFoundException, InstantiationException,
			IllegalAccessException {
		Object testInstance = instanceByName
				.getInstansByNameOfClass("com.sirma.itt.javacourse.refannotregex.instanceclass.Foodstuffs");
		String testInterfaceName = instanceByName.getInterfaceName(testInstance, 0);

		Assert.assertEquals(
				"com.sirma.itt.javacourse.refannotregex.instanceclass.ProductManagment",
				testInterfaceName);
	}

	/**
	 * Test if name of super class is this.
	 * 
	 * @throws ClassNotFoundException
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	@Test
	public void testGetSuperclassName() throws ClassNotFoundException, InstantiationException,
			IllegalAccessException {
		Object testInstance = instanceByName
				.getInstansByNameOfClass("com.sirma.itt.javacourse.refannotregex.instanceclass.Foodstuffs");
		String testSuperClassName = instanceByName.getSuperclassName(testInstance);

		Assert.assertEquals("com.sirma.itt.javacourse.refannotregex.instanceclass.Products",
				testSuperClassName);
	}
}
