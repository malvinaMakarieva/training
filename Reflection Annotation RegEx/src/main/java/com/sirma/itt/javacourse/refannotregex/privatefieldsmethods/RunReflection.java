package com.sirma.itt.javacourse.refannotregex.privatefieldsmethods;

import java.lang.reflect.InvocationTargetException;

/**
 * Class that run reflection methods for one class.
 * 
 * @author Malvina Makarieva
 */
public class RunReflection {
	/**
	 * Main class
	 * 
	 * @param args
	 * @throws NoSuchFieldException
	 * @throws IllegalArgumentException
	 * @throws IllegalAccessException
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws InvocationTargetException
	 */
	public static void main(String[] args) throws NoSuchFieldException, IllegalArgumentException,
			IllegalAccessException, NoSuchMethodException, SecurityException,
			InvocationTargetException {
		Class<ClassWithPrivateData> instanceOfClass = ClassWithPrivateData.class;
		ReflectionFunctions reflectionMethods = new ReflectionFunctions();

		reflectionMethods.fieldValue(instanceOfClass);
		reflectionMethods.getMethodValues(instanceOfClass, "getPrivateString");
		reflectionMethods.getMethodValues(instanceOfClass, "getPrivateInteger");
		reflectionMethods.getMethodValues(instanceOfClass, "getPrivateFloat");
		reflectionMethods.getMethodValues(instanceOfClass, "print");
	}

}
