package com.sirma.itt.javacourse.intro.hangman;

import org.junit.Assert;
import org.junit.Test;

/**
 * Class that testing Hangman class
 * 
 * @author Malvina Makarieva
 */
public class HangmanTest {
	Hangman h = new Hangman();

	/**
	 * Method, testing the functionality of the hideWord(String word) method.
	 */
	@Test
	public void testHideWord() {
		Assert.assertEquals("****", h.hideWord("java"));
		Assert.assertEquals("************", h.hideWord("bambambambam"));
		Assert.assertEquals("****", h.hideWord("JAVA"));
		Assert.assertEquals("***", h.hideWord("123"));
	}

	/**
	 * Method, testing the functionality of the searchLetterInWord(String secretWord, String letter,
	 * String starWord) method.
	 */
	@Test
	public void testSearchLetterInWord() {
		Assert.assertEquals("*a*a", h.searchLetterInWord("java", "a", "****"));
		Assert.assertEquals("**v*", h.searchLetterInWord("java", "v", "****"));
		Assert.assertEquals("*ava", h.searchLetterInWord("java", "v", "*a*a"));
		Assert.assertEquals("*aVa", h.searchLetterInWord("java", "V", "*a*a"));
		Assert.assertEquals("****", h.searchLetterInWord("java", "1", "****"));

	}
}
