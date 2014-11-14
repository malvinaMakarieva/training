package com.sirma.itt.javacourse.refannotregex.classinfo;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * Class contains methods using reflection.
 *
 * @author Malvina Makarieva
 */
public class ReflectionFunction {
	/**
	 * Displays information about package
	 *
	 * @param classInstance
	 *            instance of class SomeClass.
	 * @return String with the full name of the package.
	 */
	public String getSomeClassPakege(Class<?> classInstance) {
		Package Package = classInstance.getPackage();
		return Package.toString();
	}

	/**
	 * @param classInstance
	 *            instance of class SomeClass.
	 * @return list of full name of constructors.
	 */
	public List<String> getClassConstructor(Class<?> classInstance) {
		List<String> listConstructors = new ArrayList<String>();
		Constructor<?>[] constructors = classInstance.getConstructors();
		for (int i = 0; i < constructors.length; i++) {
			listConstructors.add(constructors[i].toString());
		}
		return listConstructors;
	}

	/**
	 * Displays information for all methods in class.
	 *
	 * @param classInstance
	 *            instance of class SomeClass.
	 * @return list of full name of methods.
	 */
	public List<String> getMethodInfo(Class<?> classInstance) {

		List<String> listMethods = new ArrayList<String>();
		Method[] declaredMethods = classInstance.getDeclaredMethods();
		for (int i = 0; i < declaredMethods.length; i++) {
			Method method = declaredMethods[i];
			listMethods.add(method.toString());
		}
		return listMethods;
	}

	/**
	 * Method displays the names and values ​​of fields of one class.
	 *
	 * @param classInstance
	 *            instance of class SomeClass.
	 * @throws NoSuchFieldException
	 * @throws IllegalArgumentException
	 * @throws IllegalAccessException
	 */
	public List<String> fieldValue(Class<?> classInstance) throws NoSuchFieldException,
			IllegalArgumentException, IllegalAccessException {

		Field[] field = classInstance.getDeclaredFields();
		List<String> listFields = new ArrayList<String>();
		Object fieldValue;

		for (int i = 0; i < field.length; i++) {
			Field currerntField = field[i];
			currerntField.setAccessible(true);
			fieldValue = null;
			try {
				fieldValue = currerntField.get(classInstance.newInstance());
			} catch (InstantiationException e) {
				e.printStackTrace();
			}

			listFields.add(field[i].getName() + " = " + fieldValue);
		}
		return listFields;
	}
}
