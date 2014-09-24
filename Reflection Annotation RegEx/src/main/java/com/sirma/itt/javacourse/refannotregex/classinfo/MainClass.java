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

		SomeClass someClassInstance = new SomeClass();
		Class<SomeClass> instanceOfSomeClass = SomeClass.class;

		String pakcege = someClassInstance.getSomeClassPakege(instanceOfSomeClass);
		System.out.println("Packege - " + pakcege);
		System.out.println("Methods are: ");
		someClassInstance.getSomeClassMethodsAndConstructors(instanceOfSomeClass);
		System.out.println();
		someClassInstance.fieldValue(instanceOfSomeClass);

	}

}
