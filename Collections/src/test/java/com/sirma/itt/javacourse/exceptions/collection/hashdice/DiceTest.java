package com.sirma.itt.javacourse.exceptions.collection.hashdice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author mmakarieva
 */
public class DiceTest {
	Dice diceFunction = new Dice();

	/**
	 * Test whether the method includes the values of the parties.
	 */
	@Test
	public void testRollDice() {
		String actual = diceFunction.rollDice(1);
		Assert.assertEquals("1, 1", actual);
	}

	/**
	 * Tested method of putting statistics.
	 */
	@Test
	public void testRollStatistic() {
		Map<String, List<Integer>> actualResult = new HashMap<String, List<Integer>>();
		actualResult = diceFunction.rollStatistic(1, 3);
		Map<String, List<Integer>> expectedResult = new HashMap<String, List<Integer>>();
		List<Integer> listRolls = new ArrayList<Integer>();
		listRolls.add(1);
		listRolls.add(2);
		listRolls.add(3);
		expectedResult.put("1, 1", listRolls);

		Assert.assertEquals(expectedResult, actualResult);

	}
}
