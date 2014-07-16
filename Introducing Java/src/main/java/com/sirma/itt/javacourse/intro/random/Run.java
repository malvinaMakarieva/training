package com.sirma.itt.javacourse.intro.random;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Length of string = ");
		int length = input.nextInt();

		GenerateRandomString gs = new GenerateRandomString();
		System.out.println("Random string is " + GenerateRandomString.generateString(length));
	}

}
