package com.sirma.itt.javacourse.intro.hangman;

/**
 * This class running method play() from class Game.
 * 
 * @author Malvina Makarieva
 */
public class RunHangmanGame {

	/**
	 * Main method that run play()
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Game startGame = new Game();

		System.out.print("Hi, the game begins. Your word is: ");

		startGame.play();

	}

}
