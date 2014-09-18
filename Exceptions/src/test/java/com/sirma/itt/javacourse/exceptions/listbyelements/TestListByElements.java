package com.sirma.itt.javacourse.exceptions.listbyelements;

import org.junit.Assert;
import org.junit.Test;

/**
 * Class that test methods from ListByElements class.
 * 
 * @author Malvina Makarieva
 */
public class TestListByElements {
	ListByElements testArray = new ListByElements();

	/**
	 * Method test print on a console.
	 */
	@Test
	public void testPrintAllElements() {
		testArray.add(6);
		testArray.add("more");
		testArray.add(9);
		testArray.add("no");

		Assert.assertEquals("6 more 9 no null ", testArray.printAllElements());
	}

	/**
	 * Test whether the method correctly remove items from the list.
	 */
	@Test
	public void RemoveElementFromListTest() {
		testArray.add(6);
		testArray.add("more");
		testArray.add(9);
		testArray.add("no");
		testArray.remove();

		String result = testArray.printAllElements();
		Assert.assertEquals("6 more 9 null null ", result);
		testArray.remove();
		result = testArray.printAllElements();
		Assert.assertEquals("6 more null null null ", result);
		testArray.remove();
		testArray.remove();
		result = testArray.printAllElements();
		Assert.assertEquals("null null null null null ", result);
	}

	/**
	 * Method tests whether the correct elements are added to the list.
	 */
	@Test
	public void AddElemelntInListTest() {
		testArray.add(6);

		String result = testArray.printAllElements();
		Assert.assertEquals("6 null null null null ", result);
		testArray.add("bau");
		testArray.add("mau");
		result = testArray.printAllElements();
		Assert.assertEquals("6 bau mau null null ", result);
		testArray.add(1);
		testArray.add(8);
		result = testArray.printAllElements();
		Assert.assertEquals("6 bau mau 1 8 ", result);

	}

	/**
	 * Method that tested exception - NullPointerException.
	 */
	@Test(expected = NullPointerException.class)
	public void deleteFromEmptyList() {
		testArray.remove();

	}

	/**
	 * Method that tested exception - ArrayIndexOutOfBoundsException.
	 */
	@Test(expected = ArrayIndexOutOfBoundsException.class)
	public void listIsFull() {
		testArray.add(1);
		testArray.add(2);
		testArray.add(3);
		testArray.add(4);
		testArray.add(5);
		testArray.add(6);

	}
}
