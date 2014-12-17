package com.sirma.itt.javacourse.refannotregex.instanceclass;

import java.util.ArrayList;
import java.util.List;

/**
 * Class create instance from a class, and get some information about this class.
 *
 * @author Malvina Makarieva
 */
public class InstanceOfClass {
	/**
	 * Makes an instance of the class name.
	 *
	 * @param className
	 *            the full name of the class - includes the package name and class name.
	 * @return instance of a class in object type.
	 * @throws ClassNotFoundException
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public Object getInstansByNameOfClass(String className) throws ClassNotFoundException,
			InstantiationException, IllegalAccessException {
		Class<?> clazz = null;
		clazz = Class.forName(className);
		return clazz.newInstance();

	}

	/**
	 * Take the name of the super class.
	 *
	 * @param classInstance
	 *            instance of the class.
	 * @return string whit superclass name.
	 */
	public String getSuperclassName(Object classInstance) {
		return classInstance.getClass().getSuperclass().getName();
	}

	/**
	 * Take the name of the implements interfaces.
	 *
	 * @param classInstance
	 *            instance of the class.
	 * @return list of all interfaces.
	 */

	public List<String> getInterfaceName(Object classInstance) {

		Class<?>[] interfaces = classInstance.getClass().getInterfaces();
		List<String> interfacesList = new ArrayList<String>(interfaces.length);
		for (int i = 0; i < interfaces.length; i++) {
			interfacesList.add(interfaces[i].getName());
		}
		return interfacesList;

	}
}
