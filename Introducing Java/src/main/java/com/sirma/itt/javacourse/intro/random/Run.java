package com.sirma.itt.javacourse.intro.random;

import java.util.Scanner;

/**
 * This class running method generateString(int n) from class GenerateRandomString
 * 
 * @author Malvina Makarieva
 */
public class Run {
	/**
	 * Main netoda read from the console and execute the method generateString(int n).
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Length of string = ");
		int length = input.nextInt();

		GenerateRandomString gs = new GenerateRandomString();
		System.out.println("Random string is " + GenerateRandomString.generateString(length));
	}

}
