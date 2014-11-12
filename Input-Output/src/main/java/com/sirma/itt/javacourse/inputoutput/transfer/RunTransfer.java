package com.sirma.itt.javacourse.inputoutput.transfer;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/**
 * Class that run methods from class TransferObject.
 * 
 * @author Malvina Makarieva
 */
public final class RunTransfer {
	/**
	 * Instantiates a new run transfer object.
	 */
	private RunTransfer() {

	}

	/**
	 * The main method.
	 * 
	 * @param args
	 *            the arguments
	 * @throws IOException
	 *             io exception
	 */
	public static void main(String[] args) throws IOException {
		ByteArrayInputStream in = new ByteArrayInputStream("string".getBytes());
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		TransferObject transfer = new TransferObject(in, out);

		System.out.println(transfer.transfer(5, 0));
	}
}
