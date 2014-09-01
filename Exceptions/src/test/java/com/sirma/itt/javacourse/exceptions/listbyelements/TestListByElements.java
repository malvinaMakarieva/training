package com.sirma.itt.javacourse.exceptions.listbyelements;

import org.junit.Assert;
import org.junit.Test;

/**
 * Class that test methods from ListByElements class.
 * 
 * @author Malvina Makarieva
 */
public class TestListByElements {
	/**
	 * Method test print on a console.
	 */
	@Test
	public void testPrintAllElements() {
		ListByElements testArray = new ListByElements();
		testArray.add(6);
		testArray.add("yes");
		testArray.add(9);
		testArray.add("no");

		Assert.assertEquals("[ 6 yes 9 no null ]", testArray.printAllElements());

	}
}
