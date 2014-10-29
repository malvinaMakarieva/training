package com.sirma.itt.javacourse.refannotregex.emailvalidator;

/**
 * Class describes the validation email
 * 
 * @author Malvina Makarieva
 */
public class EmailValidator {
	/**
	 * Default constructor.
	 */
	public EmailValidator() {

	}

	/**
	 * Checks whether the email is valid.
	 * 
	 * @param email
	 *            string with full email.
	 * @return true if email is valid.
	 */
	public boolean validateEmail(String email) {
		if (email.matches("[a-zA-Z][a-zA-Z0-9.-]+@[a-zA-Z0-9.-]+\\.[a-z]*")) {
			return true;
		}
		return false;
	}
}
