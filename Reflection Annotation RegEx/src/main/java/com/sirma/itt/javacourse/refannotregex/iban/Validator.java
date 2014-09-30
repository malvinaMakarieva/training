package com.sirma.itt.javacourse.refannotregex.iban;

import java.util.regex.PatternSyntaxException;

/**
 * @author Malvina Makarieva
 */
public class Validator {
	/**
	 * Default constructor.
	 */
	public Validator() {

	}

	/**
	 * Replaced the first part of Bulgarian /BG80.../ valid IBAN number with '****'.
	 * 
	 * @param iban
	 *            string of ibans.
	 * @return new string replacement of GB80 with ****.
	 * @throws PatternSyntaxException
	 */
	public String ibanValidator(String iban) throws PatternSyntaxException {
		String pattern = "BG80 [A-Z]{4} [0-9]{4} [0-9]{4} [0-9]{4}.";
		String newIban = iban.replaceAll(pattern, "****");
		return newIban;
	}

}
