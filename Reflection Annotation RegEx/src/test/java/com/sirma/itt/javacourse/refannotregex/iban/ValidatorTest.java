package com.sirma.itt.javacourse.refannotregex.iban;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test Validator class.
 * 
 * @author Malvina Makarieva
 */
public class ValidatorTest {
	Validator validator = new Validator();

	/**
	 * Test method ibanValidator.
	 */
	@Test
	public void ibanValidatorTest() {
		String testString = "<bankAccounts>" + "<iban>GR16 0110 1050 0000 1054 7023 795</iban>"
				+ "<iban>GB35 MIBG 4025 3432 1446 70</iban>"
				+ "<iban>SA80 8000 0375 6080 1019 0160</iban>"
				+ "<iban>CH51 0868 6001 2565 1500 1</iban>"
				+ "<iban>BG80 BNBG 9661 1020 3456 7840</iban>"
				+ "<iban>IL30 01BG 0300 0009 6339 234</iban>"
				+ "<iban>AL47 2121 1009 0000 0002 3569 8741</iban>"
				+ "<iban>AZ21 NABZ 0000 0000 1370 1000 1944</iban>"
				+ "<iban>BG80 BNBG 9661 1020 3456 7843</iban>" + "</bankAccounts>";
		String expectedResult = "<bankAccounts>" + "<iban>GR16 0110 1050 0000 1054 7023 795</iban>"
				+ "<iban>GB35 MIBG 4025 3432 1446 70</iban>"
				+ "<iban>SA80 8000 0375 6080 1019 0160</iban>"
				+ "<iban>CH51 0868 6001 2565 1500 1</iban>" + "<iban>****7840</iban>"
				+ "<iban>IL30 01BG 0300 0009 6339 234</iban>"
				+ "<iban>AL47 2121 1009 0000 0002 3569 8741</iban>"
				+ "<iban>AZ21 NABZ 0000 0000 1370 1000 1944</iban>" + "<iban>****7843</iban>"
				+ "</bankAccounts>";
		String testResult = validator.ibanValidator(testString);

		Assert.assertEquals(expectedResult, testResult);
	}
}