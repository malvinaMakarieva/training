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
	public void getInterfaceNameTest() throws ClassNotFoundException, InstantiationException,
			IllegalAccessException {
		Object testInstance = instanceByName
				.getInstansByNameOfClass("com.sirma.itt.javacourse.refannotregex.instanceclass.SomeClassTest");
		String testInterfaceName = instanceByName.getInterfaceName(testInstance, 0);

		Assert.assertEquals(
				"Interface com.sirma.itt.javacourse.refannotregex.instanceclass.InterfaceTest",
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
	public void getSuperclassNameTest() throws ClassNotFoundException, InstantiationException,
			IllegalAccessException {
		Object testInstance = instanceByName
				.getInstansByNameOfClass("com.sirma.itt.javacourse.refannotregex.instanceclass.SomeClassTest");
		String testSuperClassName = instanceByName.getSuperclassName(testInstance);

		Assert.assertEquals(
				"Super class com.sirma.itt.javacourse.refannotregex.instanceclass.SuperClassForTest",
				testSuperClassName);
	}
}
