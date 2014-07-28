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
		String testJavaWord = h.hideWord("java");
		String testBamWord = h.hideWord("bambambambam");
		String testUpercaseJavaWord = h.hideWord("JAVA");
		String testNumbers = h.hideWord("123");

		Assert.assertEquals("****", testJavaWord);
		Assert.assertEquals("************", testBamWord);
		Assert.assertEquals("****", testUpercaseJavaWord);
		Assert.assertEquals("***", testNumbers);
	}

	/**
	 * Method, testing the functionality of the searchLetterInWord(String secretWord, String letter,
	 * String starWord) method.
	 */
	@Test
	public void testSearchLetterInWord() {
		String testSearchAInJavaWord = h.searchLetterInWord("java", "a", "****");
		String testSearchVInJavaWord = h.searchLetterInWord("java", "v", "****");
		String testSearchVInJavaWordWhitA = h.searchLetterInWord("java", "v", "*a*a");
		String testSearchUpperVInJavaWordWhitA = h.searchLetterInWord("java", "V", "*a*a");
		String testSearchNumberInWordJava = h.searchLetterInWord("java", "1", "****");

		Assert.assertEquals("*a*a", testSearchAInJavaWord);
		Assert.assertEquals("**v*", testSearchVInJavaWord);
		Assert.assertEquals("*ava", testSearchVInJavaWordWhitA);
		Assert.assertEquals("*aVa", testSearchUpperVInJavaWordWhitA);
		Assert.assertEquals("****", testSearchNumberInWordJava);

	}
}
