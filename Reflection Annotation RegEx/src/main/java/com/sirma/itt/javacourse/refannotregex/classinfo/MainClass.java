package com.sirma.itt.javacourse.refannotregex.classinfo;

/**
 * Main class to run all methods for reflection.
 * 
 * @author Malvina Makarieva
 */
public class MainClass {
	/**
	 * Run all reflection methods and get info for SomeClass class.
	 * 
	 * @param args
	 * @throws NoSuchFieldException
	 *             getSomeClassPakege
	 * @throws SecurityException
	 *             Thrown by the security manager to indicate a security violation.
	 * @throws IllegalArgumentException
	 *             Thrown to indicate that a method has been passed an illegal or inappropriate
	 *             argument.
	 * @throws IllegalAccessException
	 *             Thrown to indicate that a method has been passed an illegal or inappropriate
	 *             argument.
	 */
	public static void main(String[] args) throws NoSuchFieldException, SecurityException,
			IllegalArgumentException, IllegalAccessException {

		ReflectionFunction reflection = new ReflectionFunction();
		SomeClass instanceOfSomeClass = new SomeClass();

		String pakcege = reflection.getSomeClassPakege(instanceOfSomeClass);
		System.out.println("Packege - " + pakcege);
		System.out.println("Methods are: ");
		System.out.println(reflection.getMethodInfo(instanceOfSomeClass));
		System.out.println("Constructor/s are:");
		System.out.println(reflection.getClassConstructor(instanceOfSomeClass));
		System.out.println("Field modificators, names and value");
		System.out.println(reflection.fieldValue(instanceOfSomeClass));

	}

}
