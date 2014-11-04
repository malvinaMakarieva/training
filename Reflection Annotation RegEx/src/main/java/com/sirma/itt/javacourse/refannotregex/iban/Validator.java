package com.sirma.itt.javacourse.refannotregex.iban;

import java.util.regex.PatternSyntaxException;

/**
 * Class describes the validation of IBAN
 *
 * @author Malvina Makarieva
 */
public class Validator {
	private static final String PATTERN_IBAN_BG = "BG80 [A-Z]{4} [0-9]{4} [0-9]{4} [0-9]{4}.";
	private static final String PATTERN_STARS = "****";

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
		return iban.replaceAll(PATTERN_IBAN_BG, PATTERN_STARS);

	}

}
