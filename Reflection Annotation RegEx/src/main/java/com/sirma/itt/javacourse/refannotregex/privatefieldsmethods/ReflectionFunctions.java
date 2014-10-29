package com.sirma.itt.javacourse.refannotregex.privatefieldsmethods;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

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
	public List<String> fieldValue(Class<?> classInstance, Object instance)
			throws NoSuchFieldException, IllegalArgumentException, IllegalAccessException {

		// ClassWithPrivateData instanceOfClassForReflaction = new ClassWithPrivateData();
		Field[] field = classInstance.getDeclaredFields();
		List<String> list = new ArrayList<String>();

		String nameOfField = null;
		for (int i = 0; i < field.length; i++) {
			nameOfField = field[i].getName();
			Field privateStringField = ClassWithPrivateData.class.getDeclaredField(nameOfField);
			privateStringField.setAccessible(true);
			Object fieldValue = privateStringField.get(instance);
			list.add(nameOfField + " = " + fieldValue);
		}
		return list;
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
	public Object getMethodValues(Class<?> classInstance, String methodName, Object instance)
			throws NoSuchMethodException, SecurityException, IllegalAccessException,
			IllegalArgumentException, InvocationTargetException {
		// ClassWithPrivateData instanceOfClassWithPrivateData = new ClassWithPrivateData();

		Method privateStringMethod = ClassWithPrivateData.class.getDeclaredMethod(methodName, null);
		privateStringMethod.setAccessible(true);
		Object returnValue = privateStringMethod.invoke(instance, null);

		return returnValue;
	}
}
