package com.sirma.itt.javacourse.intro.hangman;

import java.util.Scanner;

/**
 * Class which assembles all the game logic and the methods of class Hangman
 * 
 * @author Malvina Makarieva
 */
public class Game {
	/**
	 * Method describes the whole game using methods of class Nangmen. It describes the conditions
	 * for the lodge and the loss of the player.
	 */
	public void play() {
		Hangman h = new Hangman();
		String secretWord = h.chooseRandomWord();
		String starWord = h.hideWord(secretWord);
		Scanner userInput = new Scanner(System.in);
		String letter = "";
		String guessingLetters = "";
		String misses = "";
		String temporaryStarWord;
		System.out.println(starWord);

		int lives = 0;
		int wrongLeters = 0;

		while (wrongLeters != 6) {
			System.out.print("Input a char ");
			letter = userInput.next();

			h.searchLetterInWord(secretWord, letter, starWord);

			temporaryStarWord = h.searchLetterInWord(secretWord, letter, starWord);
			if (temporaryStarWord.equals(starWord)) {
				wrongLeters++;
				misses += letter + " ";
				starWord = temporaryStarWord;
			} else {
				starWord = temporaryStarWord;
				starWord = temporaryStarWord;

				guessingLetters += letter + "";

			}
			lives = 6 - wrongLeters;
			starWord = h.searchLetterInWord(secretWord, letter, starWord);
			System.out.println("Word: " + starWord);
			System.out.println("Guess: " + guessingLetters);
			System.out.println("Misses: " + misses);
			System.out.println("Lives: " + lives);

			if (secretWord.compareToIgnoreCase(starWord) == 0) {
				System.out.println("Game over! You're a winner!!!");
				break;
			}

			if (wrongLeters == 6) {
				System.out.println("Game over! You're dead");
			}
		}

	}
}
