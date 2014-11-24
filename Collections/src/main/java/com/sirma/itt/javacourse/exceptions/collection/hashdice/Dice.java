package com.sirma.itt.javacourse.exceptions.collection.hashdice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

/**
 * Class manages throwing dice and statistics.
 * 
 * @author Malvina Makarieva
 */
public class Dice {
	private Map<String, List<Integer>> statistic = new HashMap<String, List<Integer>>();

	/**
	 * Default constructor.
	 */
	public Dice() {

	}

	/**
	 * Throwing two dice.
	 * 
	 * @param diceSides
	 *            how many sides there are dice.
	 * @return String of numers from 2 dice.
	 */
	public String rollDice(int diceSides) {
		Random random = new Random();
		int resultDiceOne = random.nextInt(diceSides) + 1;
		int resultDiceTwo = random.nextInt(diceSides) + 1;
		return resultDiceOne + ", " + resultDiceTwo;

	}

	/**
	 * Method cretate statistic from roll dice.
	 * 
	 * @param diceSides
	 *            number of sides of dice.
	 * @param series
	 *            number of sets.
	 * @return
	 */
	public Map<String, List<Integer>> rollStatistic(int diceSides, int series) {
		String combination;

		for (int i = 1; i < series + 1; i++) {
			combination = rollDice(diceSides);
			if (statistic.containsKey(combination)) {
				statistic.get(combination).add(i);
			} else {
				List<Integer> rolls = new ArrayList<Integer>();
				rolls.add(i);
				statistic.put(combination, rolls);
			}
		}
		return statistic;
	}
}
