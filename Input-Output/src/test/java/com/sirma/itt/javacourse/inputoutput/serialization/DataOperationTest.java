package com.sirma.itt.javacourse.inputoutput.serialization;

import java.io.IOException;

import org.junit.Assert;
import org.junit.Test;

/**
 * Class that test DataOperation class.
 * 
 * @author Malvina Makarieva
 */
public class DataOperationTest {
	DataOperation operation = new DataOperation();
	UserDefinedObject userObject = new UserDefinedObject();

	/**
	 * Test getObject() from class DataOperation.
	 * 
	 * @throws IOException
	 * @throws ClassNotFoundException
	 */
	@Test
	public void testGetObject() throws IOException, ClassNotFoundException {
		userObject.setUserName("Ivan");
		userObject.setEmail("ivan.ivanov@gmail.com");
		userObject.setPhoneNumber((long) 12582121);
		userObject.setPassword("987654");

		String path = "src\\test\\resources\\dataTest.ser";
		UserDefinedObject expected = userObject;
		operation.saveObject(path, userObject);
		UserDefinedObject actual = operation.getObject(path);

		Assert.assertEquals(expected.getEmail(), actual.getEmail());
		Assert.assertEquals(null, actual.getPassword());
		Assert.assertEquals(expected.getUserName(), actual.getUserName());
		Assert.assertEquals(null, actual.getPhoneNumber());
	}

}
