package com.sirma.itt.javacourse.refannotregex.classinfo;


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

}
