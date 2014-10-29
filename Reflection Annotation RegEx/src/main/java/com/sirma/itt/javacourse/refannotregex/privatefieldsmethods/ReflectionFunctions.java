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
	 * @throws InstantiationException
	 */
	public List<String> fieldValue(Class<?> classInstance) throws NoSuchFieldException,
			IllegalArgumentException, IllegalAccessException, InstantiationException {

		Field[] field = classInstance.getDeclaredFields();
		List<String> list = new ArrayList<String>();
		String nameOfField = null;

		for (int i = 0; i < field.length; i++) {
			nameOfField = field[i].getName();
			Field privateStringField = classInstance.getDeclaredField(nameOfField);
			privateStringField.setAccessible(true);
			Object fieldValue = privateStringField.get(classInstance.newInstance());
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
	 * @throws InstantiationException
	 */
	public Object getMethodValues(Class<?> classInstance, String methodName)
			throws NoSuchMethodException, SecurityException, IllegalAccessException,
			IllegalArgumentException, InvocationTargetException, InstantiationException {

		Method privateStringMethod = classInstance.getDeclaredMethod(methodName, null);
		privateStringMethod.setAccessible(true);
		Object returnValue = privateStringMethod.invoke(classInstance.newInstance(), null);

		return returnValue;
	}
}
