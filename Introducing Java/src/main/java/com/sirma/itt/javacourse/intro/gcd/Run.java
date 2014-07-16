package com.sirma.itt.javacourse.intro.gcd;

import java.util.Scanner;

/**
 * This class read from console and running two methods -gcd for from user to calculated least
 * common multiple and lcm for
 * 
 * @author Malvina Makarieva
 */
public class Run {
	/**
	 * Main method that run gcd() and lcm() metods
	 * 
	 * @param args
	 */

	public static void main(String[] args) {

		int firstNumber;
		int secondNumber;

		Scanner input = new Scanner(System.in);

		System.out.println("Enter two numbers to find a GCD and LCM");

		System.out.print("First number = ");
		firstNumber = input.nextInt();

		System.out.print("Second number = ");
		secondNumber = input.nextInt();

		GCD gcd = new GCD();
		System.out.println("GCP is " + gcd.gcd(firstNumber, secondNumber));

		LCM lcm = new LCM();
		System.out.println("LCM is " + lcm.lcm(firstNumber, secondNumber));

	}
}
