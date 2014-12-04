package com.sirma.itt.javacourse.collection.exmessagemenager;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Test class
 * 
 * @author Malvina Makarieva
 */
public class ExceptionMessageManagerTest {

	Map<String, String> exception = new HashMap<String, String>();

	/**
	 * Method fills exception list before each test.
	 */
	@Before
	public void setMessages() {
		exception.put("007", "IOExceptions");
		exception.put("100", "No Such Element Exception");
		exception.put("5", "Runtime Exception");
		exception.put("302", "Null Point Exception");
	}

	/**
	 * Test search for the error message in the list.
	 */
	@Test
	public void testAddExceptionMessage() {
		Assert.assertEquals(true, exception.containsValue("Runtime Exception"));
		Assert.assertEquals(false, exception.containsValue("Runtime"));
	}

	/**
	 * Test search for the error message code in the list
	 */
	@Test
	public void testAddExceptionMessageUsingCode() {
		Assert.assertEquals(true, exception.containsKey("100"));
		Assert.assertEquals(false, exception.containsValue("6"));

	}

	/**
	 * Test division of the string parts and adding it to a list.
	 */
	@Test
	public void testGetMessages() {
		String messagesCombination = "No such parametar*Limit reach";
		String messagesCombinationSmall = "No more pages";
		List<String> expectedMessages = new ArrayList<String>();
		expectedMessages.add("No such parametar");
		expectedMessages.add("Limit reach");

		List<String> expectedMessageSmall = new ArrayList<String>();
		expectedMessageSmall.add("No more pages");

		Assert.assertEquals(expectedMessages,
				ExceptionMessageManager.getMessages(messagesCombination));
		Assert.assertEquals(expectedMessageSmall,
				ExceptionMessageManager.getMessages(messagesCombinationSmall));
	}

}
