package com.sirma.itt.javacourse.refannotregex.classinfo;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * SomeClass is class with random fields and methods. Created for using java reflection.
 * 
 * @author Malvina Makarieva
 */
public class SomeClass {
	public String someString = "juno";
	public char someChar = 'a';
	private String privateString = "luna";
	private int someInt;

	/**
	 * Default constructor.
	 */
	public SomeClass() {

	}

	/**
	 * Constructor of SomeClass.
	 *
	 * @param currentString
	 *            some string.
	 * @param currentPrivateString
	 *            some sting.
	 */
	public SomeClass(String currentString, String currentPrivateString) {
		this.someString = currentString;
		this.privateString = currentPrivateString;

	}

	/**
	 * Getter method for someString.
	 *
	 * @return the someString
	 */
	public String getSomeString() {
		return someString;
	}

	/**
	 * Setter method for someString.
	 *
	 * @param someString
	 *            the someString to set
	 */
	public void setSomeString(String someString) {
		this.someString = someString;
	}

	/**
	 * Getter method for privateString.
	 *
	 * @return the privateString
	 */
	public String getPrivateString() {
		return privateString;
	}

	/**
	 * Setter method for privateString.
	 *
	 * @param privateString
	 *            the privateString to set
	 */
	public void setPrivateString(String privateString) {
		this.privateString = privateString;
	}

	/**
	 * Getter method for someInt.
	 *
	 * @return the someInt
	 */
	public int getSomeInt() {
		return someInt;
	}

	/**
	 * Setter method for someInt.
	 *
	 * @param someInt
	 *            the someInt to set
	 */
	public void setSomeInt(int someInt) {
		this.someInt = someInt;
	}

	/**
	 * Exemplary method of boolean type.
	 * 
	 * @return true in any case.
	 */
	@SuppressWarnings("unused")
	private boolean someBooleanMethod() {
		return true;
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
	public void fieldValue(Class<?> classInstance) throws NoSuchFieldException,
			IllegalArgumentException, IllegalAccessException {

		SomeClass someClassInstance = new SomeClass();
		System.out.println("Field modificators and names.");
		Field[] field = classInstance.getDeclaredFields();
		for (int i = 0; i < field.length; i++) {
			System.out.println(field[i]);
		}

		String nameOfField = null;
		System.out.println();
		System.out.println("Field and value.");
		for (int i = 0; i < field.length; i++) {

			nameOfField = field[i].getName();
			Field privateStringField = SomeClass.class.getDeclaredField(nameOfField);

			privateStringField.setAccessible(true);
			Object fieldValue = privateStringField.get(someClassInstance);
			System.out.println(nameOfField + " = " + fieldValue);
		}
	}

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
	 * Displays information for all methods and constructors in class.
	 * 
	 * @param classInstance
	 *            instance of class SomeClass.
	 */
	public void getSomeClassMethodsAndConstructors(Class<?> classInstance) {
		Method[] allMethod = classInstance.getMethods();
		for (int i = 0; i < allMethod.length; i++) {
			System.out.println(allMethod[i]);
		}

		System.out.println("Constructor/s");
		Constructor<?>[] constructors = classInstance.getConstructors();
		for (int i = 0; i < constructors.length; i++) {
			System.out.println(constructors[i]);
		}

	}

}
