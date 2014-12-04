package com.sirma.itt.javacourse.collection.exmessagemenager;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;

/**
 * Class that manages error messages
 * 
 * @author Malvina Makarieva
 */
public class ExceptionMessageManager {
	private Map<String, String> exception = new HashMap<String, String>();

	/**
	 * Getter method for exception.
	 *
	 * @return the exception
	 */
	public Map<String, String> getException() {
		return exception;
	}

	/**
	 * Setter method for exception.
	 *
	 * @param exception
	 *            the exception to set
	 */
	public void setException(String key, String value) {
		this.exception.put(key, value);
	}

	/**
	 * Getter method for separator.
	 *
	 * @return the separator
	 */
	public static String getSeparator() {
		return SEPARATOR;
	}

	private String message;
	private final static String SEPARATOR = "*";

	/**
	 * Default constructor.
	 */
	public ExceptionMessageManager() {

	}

	/**
	 * The method checks that the set messages "exception" there is a message with the same value.
	 * 
	 * @param message
	 *            message that must be added to the combination message.
	 * @return true if the message is added.
	 */
	public boolean addExceptionMessage(String message) {
		if (exception.containsValue(message)) {
			this.message.concat(SEPARATOR);
			this.message.concat(message);
			return true;
		} else
			throw new NoSuchElementException("No such element");
	}

	/**
	 * Method to verify that the "exceptions" set messages have a message such key.
	 * 
	 * @param messageCode
	 *            code of message that must be added to the combination message.
	 * @return true if the code of message is added.
	 */
	public boolean addExceptionMessageUsingCode(String messageCode) {
		if (exception.containsKey(messageCode)) {
			this.message.concat(SEPARATOR);
			this.message.concat(messageCode);
			return true;
		} else
			throw new NoSuchElementException("No such element");
	}

	/**
	 * Getter method for message.
	 *
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * Setter method for message.
	 *
	 * @param message
	 *            the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * Static method shattering parameter messagesCombination of constituent strings.
	 * 
	 * @param messagesCombination
	 *            combination of exceptions messages.
	 * @return broken string returned as a collection of strings.
	 */
	public static Collection<String> getMessages(String messagesCombination) {
		Collection<String> separateMessage = new ArrayList<String>();
		if (messagesCombination.contains(SEPARATOR)) {
			String separator = "[*]";
			String[] messageArray = messagesCombination.split(separator);
			for (int i = 0; i < messageArray.length; i++) {
				separateMessage.add(messageArray[i]);
			}
		} else {
			separateMessage.add(messagesCombination);
		}
		return separateMessage;

	}
}
