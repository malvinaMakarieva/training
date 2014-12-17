package com.sirma.itt.javacourse.refannotregex.privatefieldsmethods;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

/**
 * Class that test methods from class ReflectionFunction.
 * 
 * @author Malvina Makarieva
 */
public class ReflectionFunctionsTest {
	ClassWithPrivateData instanceOfClass = new ClassWithPrivateData();
	ReflectionFunctions reflectionMethods = new ReflectionFunctions();

	/**
	 * Method that test method filedValue()
	 * 
	 * @throws NoSuchFieldException
	 * @throws IllegalArgumentException
	 * @throws IllegalAccessException
	 * @throws IOException
	 * @throws InstantiationException
	 */
	@Test
	public void testFieldValue() throws NoSuchFieldException, IllegalArgumentException,
			IllegalAccessException, IOException, InstantiationException {

		List<String> actualList = reflectionMethods.fieldValue(instanceOfClass);
		List<String> expectedList = new ArrayList<String>(3);
		expectedList.add("privateString = bam");
		expectedList.add("privateFloat = 79.35");
		expectedList.add("privateInteger = 100");

		Assert.assertEquals(expectedList, actualList);

	}

	/**
	 * Method that test getMethodValues()
	 * 
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 * @throws InstantiationException
	 */
	@Test
	public void testGetMethodValues() throws NoSuchMethodException, SecurityException,
			IllegalAccessException, IllegalArgumentException, InvocationTargetException,
			InstantiationException {

		Object stringFieldMethod = reflectionMethods.getMethodValues(instanceOfClass,
				"getPrivateString");
		Object floatFieldMethod = reflectionMethods.getMethodValues(instanceOfClass,
				"getPrivateFloat");
		Object integerFieldMethod = reflectionMethods.getMethodValues(instanceOfClass,
				"getPrivateInteger");

		Assert.assertEquals("bam", stringFieldMethod);
		Assert.assertEquals(79.35f, floatFieldMethod);
		Assert.assertEquals(100, integerFieldMethod);
	}

}
