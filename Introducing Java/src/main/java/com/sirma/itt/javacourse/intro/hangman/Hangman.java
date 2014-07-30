package com.sirma.itt.javacourse.intro.hangman;

import java.util.Random;

/**
 * Class that contains methods for game performance
 * 
 * @author Malvina Makarieva
 */
public class Hangman {
	private final String[] allWords = { "java", "moon", "eclipse", "luna", "kepler" };

	/**
	 * A method method returns a random word from an array of predefined words.
	 * 
	 * @return random word from String type
	 */
	public String chooseRandomWord() {
		int index = -1;
		Random randmWord = new Random();
		index = randmWord.nextInt(allWords.length);
		return allWords[index];
	}

	/**
	 * Method covered with "***" selected word
	 * 
	 * @param word
	 *            This must be the word that is randomly selected from the method
	 * @return string with "***" which are equal to the letters in the word
	 */
	public String hideWord(String word) {
		int longWord;
		String secretWord = "";
		for (longWord = 0; longWord < word.length(); longWord++) {
			secretWord += "*";
		}
		return secretWord;
	}

	/**
	 * Method searches the user input point whether there is in the word. If there is a string
	 * returned by the letter of the relevant places and "*" to other places where the letters are
	 * not known.
	 * 
	 * @param secretWord
	 *            It is the word that is randomly generated and is not known to the user
	 * @param letter
	 *            letter entered by the user
	 * @param starWord
	 *            Encoded with "*" word
	 * @return string of "*" and the familiar letters until now
	 */
	public String searchLetterInWord(String secretWord, String letter, String starWord) {
		char data[];
		String userLetterString = "";
		data = secretWord.toCharArray();
		StringBuilder ss = new StringBuilder(starWord);

		for (int i = 0; i < data.length; i++) {
			userLetterString = Character.toString(data[i]);
			if (userLetterString.compareToIgnoreCase(letter) == 0) {
				ss.delete(i, i + 1);
				ss.insert(i, letter);
			}
		}
		return ss.toString();
	}
}
