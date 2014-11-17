package com.sirma.itt.javacourse.refannotregex.privatefieldsmethods;

import java.lang.reflect.InvocationTargetException;

/**
 * Class that run reflection methods for one class.
 * 
 * @author Malvina Makarieva
 */
public class RunReflectionFunction {
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
	 * @throws InstantiationException
	 * @throws ClassNotFoundException
	 */
	public static void main(String[] args) throws IllegalAccessException, SecurityException,
			InvocationTargetException, ClassNotFoundException, InstantiationException {

		Class<ClassWithPrivateData> instanceOfClass = ClassWithPrivateData.class;
		ReflectionFunctions reflectionMethods = new ReflectionFunctions();

		System.out.println("Field and value.");
		try {
			System.out.println(reflectionMethods.fieldValue(instanceOfClass));

		} catch (NoSuchFieldException e) {
			e.printStackTrace();
		}
		Object privateField;
		try {
			privateField = reflectionMethods.getMethodValues(instanceOfClass, "getPrivateString");
			System.out.println("getPrivateString return value = " + privateField);
			privateField = reflectionMethods.getMethodValues(instanceOfClass, "getPrivateFloat");
			System.out.println("getPrivateFloat return value = " + privateField);
			privateField = reflectionMethods.getMethodValues(instanceOfClass, "getPrivateInteger");
			System.out.println("getPrivateInteger return value = " + privateField);
			privateField = reflectionMethods.getMethodValues(instanceOfClass, "print");
			System.out.println("print return value = " + privateField);
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}

	}
}
