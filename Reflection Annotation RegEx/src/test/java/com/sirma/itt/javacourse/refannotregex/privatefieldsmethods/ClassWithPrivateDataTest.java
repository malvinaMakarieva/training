package com.sirma.itt.javacourse.refannotregex.privatefieldsmethods;

/**
 * Class with test data
 * 
 * @author Malvina Makarieva
 */
public class ClassWithPrivateDataTest {
	private String privateStringTest = "java";
	private float privateFloatTest = 20.03f;
	private Integer privateIntegerTest = 255;

	/**
	 * Default constructor.
	 */
	public ClassWithPrivateDataTest() {

	}

	/**
	 * Getter method for privateStringTest.
	 *
	 * @return the privateStringTest
	 */
	@SuppressWarnings("unused")
	private String getPrivateStringTest() {
		return privateStringTest;
	}

	/**
	 * Setter method for privateStringTest.
	 *
	 * @param privateStringTest
	 *            the privateStringTest to set
	 */
	@SuppressWarnings("unused")
	private void setPrivateStringTest(String privateStringTest) {
		this.privateStringTest = privateStringTest;
	}

	/**
	 * Getter method for privateFloatTest.
	 *
	 * @return the privateFloatTest
	 */
	@SuppressWarnings("unused")
	private float getPrivateFloatTest() {
		return privateFloatTest;
	}

	/**
	 * Setter method for privateFloatTest.
	 *
	 * @param privateFloatTest
	 *            the privateFloatTest to set
	 */
	@SuppressWarnings("unused")
	private void setPrivateFloatTest(float privateFloatTest) {
		this.privateFloatTest = privateFloatTest;
	}

	/**
	 * Getter method for privateIntegerTest.
	 *
	 * @return the privateIntegerTest
	 */
	@SuppressWarnings("unused")
	private Integer getPrivateIntegerTest() {
		return privateIntegerTest;
	}

	/**
	 * Setter method for privateIntegerTest.
	 *
	 * @param privateIntegerTest
	 *            the privateIntegerTest to set
	 */
	@SuppressWarnings("unused")
	private void setPrivateIntegerTest(Integer privateIntegerTest) {
		this.privateIntegerTest = privateIntegerTest;
	}

}
