package com.sirma.itt.javacourse.refannotregex.instanceclass;

/**
 * The class create instance of class by name and get information about that class.
 *
 * @author Malvina Makarieva
 */
public class RunReflection {
	/**
	 * Main class to run all function.
	 *
	 * @param args
	 * @throws ClassNotFoundException
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException,
			IllegalAccessException {
		InstanceOfClass instance = new InstanceOfClass();

		Object classInstance = instance
				.getInstansByNameOfClass("com.sirma.itt.javacourse.refannotregex.instanceclass.Foodstuffs");

		String className = classInstance.getClass().getName();
		System.out.println("Class " + className);

		String superClassName = instance.getSuperclassName(classInstance);
		System.out.println("Super class " + superClassName);

		String interfeces = instance.getInterfaceName(classInstance, 0);
		System.out.println("Interface " + interfeces);

	}

}
