package com.sirma.itt.javacourse.refannotregex.classinfo;

/**
 * This is class with random fields and methods. Created for using java reflection.
 * 
 * @author Malvina Makarieva
 */
public class TestClass {
	public String someString = "jumo";
	private int someInt = 10;

	/**
	 * Default constructor.
	 */
	public TestClass() {

	}

	/**
	 * Getter method for someString.
	 *
	 * @return the someString
	 */
	@SuppressWarnings("unused")
	private String getSomeString() {
		return someString;
	}

	/**
	 * Setter method for someString.
	 *
	 * @param someString
	 *            the someString to set
	 */
	@SuppressWarnings("unused")
	private void setSomeString(String someString) {
		this.someString = someString;
	}

	/**
	 * Getter method for someInt.
	 *
	 * @return the someInt
	 */
	@SuppressWarnings("unused")
	private int getSomeInt() {
		return someInt;
	}

	/**
	 * Setter method for someInt.
	 *
	 * @param someInt
	 *            the someInt to set
	 */
	@SuppressWarnings("unused")
	private void setSomeInt(int someInt) {
		this.someInt = someInt;
	}

}
