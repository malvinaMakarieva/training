package com.sirma.itt.javacourse.intro.random;

/**
 * Class which contains a method of randomly generating a string of a given length
 * 
 * @author Malvina Makarieva
 */
public class GenerateRandomString {
	/**
	 * Method generates a random string of characters specified length
	 * 
	 * @param n
	 *            size of the string
	 * @return string of random numbers, uppercase and lowercase characters specified length - n
	 */
	public String generateString(int n) {

		String characters = "1234567890abcdefghijklmnopqrstuvwxyzABCDEIFGHIJKLMOPQRSTUVWXYZ";
		String result = "";
		int lenftOfCharecters = characters.length();

		for (int i = 0; i < n; i++) {
			int randomSymbol = (int) (Math.random() * lenftOfCharecters);
			result += characters.charAt(randomSymbol);
		}

		return result;
	}
}
