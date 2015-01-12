package com.sirma.javacourse.designpatterns.calculator;

import java.util.Scanner;

/**
 * Class search for propriate command using the factory and executing it.
 * 
 * @author Malvina Makarieva
 */
public class Invoker {
	private final Scanner scanner = new Scanner(System.in);

	/**
	 * Instantiates a new command invoker.
	 * 
	 * @return
	 */
	public Invoker() {

		while (true) {
			System.out.println(execute(scanner.next()));
		}
	}

	private final FactoryCommand factory = new FactoryCommand();

	/**
	 * Method execute one of all mathematic operation.
	 * 
	 * @param input
	 *            the input from console.
	 * @return the double result from calculation.
	 */
	public double execute(String input) {
		return factory.getCommand(input).execute(input);

	}

}
