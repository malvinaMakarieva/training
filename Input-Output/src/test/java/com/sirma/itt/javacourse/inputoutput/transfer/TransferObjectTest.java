package com.sirma.itt.javacourse.inputoutput.transfer;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.IOException;

import org.junit.Test;

/**
 * Class that test TransferObject class.
 * 
 * @author Malvina Makarieva
 */
public class TransferObjectTest {

	ByteArrayInputStream in = new ByteArrayInputStream("string".getBytes());
	ByteArrayOutputStream out = new ByteArrayOutputStream();
	TransferObject transfer = new TransferObject(in, out);

	/**
	 * Test transfer() method from TransferObject.
	 * 
	 * @throws IOException
	 */
	@Test
	public void testTransfer() throws IOException {

		assertEquals(3, transfer.transfer(3, 1));
		assertEquals(1, transfer.transfer(1, 1));
	}

	/**
	 * Method that test exception.
	 * 
	 * @throws IOException
	 */
	@Test(expected = EOFException.class)
	public void ExceptionTest() throws IOException {
		transfer.transfer(1, 9);
	}
}
