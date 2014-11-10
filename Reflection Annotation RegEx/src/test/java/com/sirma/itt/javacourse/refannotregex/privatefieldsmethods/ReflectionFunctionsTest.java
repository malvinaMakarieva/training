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
	Class<ClassWithPrivateDataTest> instanceOfClass = ClassWithPrivateDataTest.class;
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
		List<String> expectedList = new ArrayList<String>();
		expectedList.add("privateStringTest = java");
		expectedList.add("privateFloatTest = 20.03");
		expectedList.add("privateIntegerTest = 255");

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
				"getPrivateStringTest");
		Object floatFieldMethod = reflectionMethods.getMethodValues(instanceOfClass,
				"getPrivateFloatTest");
		Object integerFieldMethod = reflectionMethods.getMethodValues(instanceOfClass,
				"getPrivateIntegerTest");

		Assert.assertEquals("java", stringFieldMethod);
		Assert.assertEquals(20.03f, floatFieldMethod);
		Assert.assertEquals(255, integerFieldMethod);
	}

}
