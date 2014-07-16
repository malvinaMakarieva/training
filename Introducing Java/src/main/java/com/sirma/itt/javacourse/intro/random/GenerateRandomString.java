package com.sirma.itt.javacourse.intro.random;

import java.util.Random;

/**
 * @author Malvina Makarieva
 */
public class GenerateRandomString {

	/**
	 * @param args
	 */
	private static Random random = new Random();

	public static String generateString(int n) {

		String characters = "1234567890abcdefghijklmnopqrstuvwxyzABCDIFGHIJKLMPQRSTUVWXYZ";
		String result = "";

		for (int i = 0; i < n; i++) {
			result += characters.charAt(random.nextInt(characters.length()));
		}

		return result;
	}

}
