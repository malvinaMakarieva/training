package com.sirma.itt.javacourse.intro.random;

import java.util.Random;

/**
 * Class which contains a method of randomly generating a string of a given length
 * 
 * @author Malvina Makarieva
 */
public class GenerateRandomString {

	private static Random random = new Random();

	/**
	 * @param n
	 *            size of the string
	 * @return string of random numbers, uppercase and lowercase characters specified length - n
	 */
	public String generateString(int n) {

		String characters = "1234567890abcdefghijklmnopqrstuvwxyzABCDEIFGHIJKLMOPQRSTUVWXYZ";
		String result = "";

		for (int i = 0; i < n; i++) {
			result += characters.charAt(random.nextInt(characters.length()));
		}

		return result;
	}

}
