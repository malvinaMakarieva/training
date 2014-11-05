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
		Object currentInstance = classInstance.newInstance();

		for (int i = 0; i < field.length; i++) {
			Field currentField = field[i];
			currentField.setAccessible(true);
			list.add(currentField.getName() + " = " + currentField.get(currentInstance));
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

		Method privateStringMethod = classInstance.getDeclaredMethod(methodName);
		privateStringMethod.setAccessible(true);
		privateStringMethod.invoke(classInstance.newInstance());
		return privateStringMethod.invoke(classInstance.newInstance());
	}
}
