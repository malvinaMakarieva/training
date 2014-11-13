package com.sirma.itt.javacourse.inputoutput.serialization;

import java.io.IOException;

/**
 * This class run methods from DataOperation class.
 * 
 * @author Malvina Makarieva
 */
public class RunDataOperation {
	/**
	 * @param args
	 *            the arguments.
	 * @throws IOException
	 *             io exception.
	 * @throws ClassNotFoundException
	 *             class not found exception.
	 */
	public static void main(String[] args) throws ClassNotFoundException, IOException {
		String fileName = "data.ser";
		UserDefinedObject user = new UserDefinedObject();
		DataOperation operation = new DataOperation();

		user.setUserName("_malvina_");
		user.setEmail("malvina.v.m@gmail.com");
		user.setPassword("123456");
		user.setPhoneNumber((long) 826589525);

		operation.saveObject(fileName, user);
		System.out.println("serialization Object:" + user);

		UserDefinedObject userNew = null;
		userNew = operation.getObject(fileName);
		System.out.println("deserialization Object:" + userNew);

	}
}
