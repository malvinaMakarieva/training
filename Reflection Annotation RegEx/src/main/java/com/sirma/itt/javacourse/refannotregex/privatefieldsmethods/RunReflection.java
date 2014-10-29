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
	 * @throws InstantiationException
	 * @throws ClassNotFoundException
	 */
	public static void main(String[] args) throws NoSuchFieldException, IllegalArgumentException,
			IllegalAccessException, NoSuchMethodException, SecurityException,
			InvocationTargetException, ClassNotFoundException, InstantiationException {

		Class<ClassWithPrivateData> instanceOfClass = ClassWithPrivateData.class;

		ClassWithPrivateData instance = new ClassWithPrivateData();

		ReflectionFunctions reflectionMethods = new ReflectionFunctions();

		System.out.println("Field and value.");
		System.out.println(reflectionMethods.fieldValue(instanceOfClass, instance));
		Object privateField = reflectionMethods.getMethodValues(instanceOfClass,
				"getPrivateString", instance);
		System.out.println("getPrivateString return valie = " + privateField);
		privateField = reflectionMethods.getMethodValues(instanceOfClass, "getPrivateFloat",
				instance);
		System.out.println("getPrivateFloat return valie = " + privateField);
		privateField = reflectionMethods.getMethodValues(instanceOfClass, "getPrivateInteger",
				instance);
		System.out.println("getPrivateInteger return valie = " + privateField);
		privateField = reflectionMethods.getMethodValues(instanceOfClass, "print", instance);
		System.out.println("print return valie = " + privateField);
	}
}
