package com.sirma.itt.javacourse.refannotregex.instanceclass;

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
		String supperClassName = classInstance.getClass().getSuperclass().getName();
		return "Super class " + supperClassName;
	}

	/**
	 * Take the name of the implements interfaces.
	 * 
	 * @param classInstance
	 *            instance of the class.
	 * @param numberOfInterface
	 *            order number of the interface implementation, starting from zero.
	 * @return
	 */
	public String getInterfaceName(Object classInstance, int numberOfInterface) {
		String interfeces = classInstance.getClass().getInterfaces()[numberOfInterface].getName();
		return "Interface " + interfeces;
	}
}
