package com.sirma.itt.javacourse.refannotregex.privatefieldsmethods;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Class that contain some method using reflection.
 * 
 * @author Malvina Makarieva
 */
public class ReflectionFunctions {

	/**
	 * Method displays the names and values ​​of fields of one class.
	 * 
	 * @param classInstance
	 *            instance of class SomeClass.
	 * @throws NoSuchFieldException
	 * @throws IllegalArgumentException
	 * @throws IllegalAccessException
	 */
	public void fieldValue(Class<?> classInstance) throws NoSuchFieldException,
			IllegalArgumentException, IllegalAccessException {

		ClassWithPrivateData someClassInstance = new ClassWithPrivateData();
		Field[] field = classInstance.getDeclaredFields();

		String nameOfField = null;
		System.out.println("Field and value.");
		for (int i = 0; i < field.length; i++) {

			nameOfField = field[i].getName();
			Field privateStringField = ClassWithPrivateData.class.getDeclaredField(nameOfField);
			privateStringField.setAccessible(true);
			Object fieldValue = privateStringField.get(someClassInstance);
			System.out.println(nameOfField + " = " + fieldValue);
		}
	}

	/**
	 * Method return value of one method.
	 * 
	 * @param classInstance
	 *            instance of class SomeClass.
	 * @param methodName
	 *            name of method by string.
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 */
	public void getMethodValues(Class<?> classInstance, String methodName)
			throws NoSuchMethodException, SecurityException, IllegalAccessException,
			IllegalArgumentException, InvocationTargetException {
		ClassWithPrivateData instanceOfClassWithPrivateData = new ClassWithPrivateData();

		Method privateStringMethod = ClassWithPrivateData.class.getDeclaredMethod(methodName, null);
		privateStringMethod.setAccessible(true);
		Object returnValue = privateStringMethod.invoke(instanceOfClassWithPrivateData, null);

		System.out.println(methodName + " return value = " + returnValue);
	}
}
