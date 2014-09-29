package com.sirma.itt.javacourse.refannotregex.privatefieldsmethods;

/**
 * This is a sample class with sample data.
 * 
 * @author Malvina Makarieva
 */
public class ClassWithPrivateData {
	private String privateString = "bam";
	private float privateFloat = 79.35f;
	private Integer privateInteger = 100;

	/**
	 * Default constructor.
	 */
	public ClassWithPrivateData() {

	}

	/**
	 * Getter method for privateString.
	 *
	 * @return the privateString
	 */
	@SuppressWarnings("unused")
	private String getPrivateString() {
		return privateString;
	}

	/**
	 * Setter method for privateString.
	 *
	 * @param privateString
	 *            the privateString to set
	 */
	@SuppressWarnings("unused")
	private void setPrivateString(String privateString) {
		this.privateString = privateString;
	}

	/**
	 * Getter method for privateFloat.
	 *
	 * @return the privateFloat
	 */
	@SuppressWarnings("unused")
	private float getPrivateFloat() {
		return privateFloat;
	}

	/**
	 * Setter method for privateFloat.
	 *
	 * @param privateFloat
	 *            the privateFloat to set
	 */
	@SuppressWarnings("unused")
	private void setPrivateFloat(float privateFloat) {
		this.privateFloat = privateFloat;
	}

	/**
	 * Getter method for privateInteger.
	 *
	 * @return the privateInteger
	 */
	@SuppressWarnings("unused")
	private Integer getPrivateInteger() {
		return privateInteger;
	}

	/**
	 * Setter method for privateInteger.
	 *
	 * @param privateInteger
	 *            the privateInteger to set
	 */
	@SuppressWarnings("unused")
	private void setPrivateInteger(Integer privateInteger) {
		this.privateInteger = privateInteger;
	}

	/**
	 * Some boolean private method.
	 * 
	 * @return false always.
	 */
	@SuppressWarnings("unused")
	private boolean print() {
		return false;

	}
}
