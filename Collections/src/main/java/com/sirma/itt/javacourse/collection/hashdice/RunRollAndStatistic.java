package com.sirma.itt.javacourse.collection.hashdice;

/**
 * Running class.
 * 
 * @author Malvina Makarieva
 */
public class RunRollAndStatistic {
	/**
	 * Main method.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Dice dice = new Dice();

		System.out.println("Combination = [roll]");
		System.out.println(dice.rollStatistic(6, 6));

	}
}
