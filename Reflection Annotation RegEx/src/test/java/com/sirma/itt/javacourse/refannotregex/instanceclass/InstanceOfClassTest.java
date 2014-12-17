package com.sirma.itt.javacourse.refannotregex.instanceclass;

import java.util.ArrayList;
import java.util.List;

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
		List<String> actualInterfaceName = instanceByName.getInterfaceName(testInstance);
		List<String> expectedInterfaceName = new ArrayList<String>(1);
		expectedInterfaceName
				.add("com.sirma.itt.javacourse.refannotregex.instanceclass.ProductManagment");

		Assert.assertEquals(expectedInterfaceName, actualInterfaceName);
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
