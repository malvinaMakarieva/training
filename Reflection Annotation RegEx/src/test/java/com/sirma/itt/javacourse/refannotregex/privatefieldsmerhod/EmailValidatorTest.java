package com.sirma.itt.javacourse.refannotregex.privatefieldsmerhod;

import org.junit.Assert;
import org.junit.Test;

/**
 * Class that test validation of email.
 * 
 * @author Malvina Makarieva
 */
public class EmailValidatorTest {
	EmailValidator validator = new EmailValidator();

	/**
	 * Test validateEmail();
	 */
	@Test
	public void validateEmailTest() {
		String testEmailOne = "malvina.v.m@gmial.com";
		String testEmailTwo = "h1ello@sirma999.com";
		String testEmailThree = "test@sirma.com";

		String testNotEmailOne = "eclipse.com";
		String testNotEmailTwo = "@_malvina_";
		String testNotEmailTree = "mimoza_90@abv";

		boolean validateEmailOne = validator.validateEmail(testEmailOne);
		boolean validateEmailTwo = validator.validateEmail(testEmailTwo);
		boolean validateEmailThree = validator.validateEmail(testEmailThree);

		boolean validateNotEmailOne = validator.validateEmail(testNotEmailOne);
		boolean validateNotEmailTwo = validator.validateEmail(testNotEmailTwo);
		boolean validateNotEmailThree = validator.validateEmail(testNotEmailTree);

		Assert.assertEquals(true, validateEmailOne);
		Assert.assertEquals(true, validateEmailTwo);
		Assert.assertEquals(true, validateEmailThree);
		Assert.assertEquals(false, validateNotEmailOne);
		Assert.assertEquals(false, validateNotEmailTwo);
		Assert.assertEquals(false, validateNotEmailThree);

	}
}
