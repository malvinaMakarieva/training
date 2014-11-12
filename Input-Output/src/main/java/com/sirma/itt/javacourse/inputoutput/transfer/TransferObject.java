package com.sirma.itt.javacourse.inputoutput.transfer;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * Class carries out the transmission of objects
 * 
 * @author Malvina Makarieva
 */
public class TransferObject {
	private InputStream inStream;
	private OutputStream outStream;

	/**
	 * Constructor of TransferObject.
	 *
	 * @param in
	 *            input stream
	 * @param out
	 *            output stream.
	 */
	public TransferObject(InputStream in, OutputStream out) {
		this.inStream = in;
		this.outStream = out;
	}

	/**
	 * Getter method for inStream.
	 *
	 * @return the inStream
	 */
	@SuppressWarnings("unused")
	private InputStream getInStream() {
		return inStream;
	}

	/**
	 * Setter method for inStream.
	 *
	 * @param inStream
	 *            the inStream to set
	 */
	@SuppressWarnings("unused")
	private void setInStream(InputStream inStream) {
		this.inStream = inStream;
	}

	/**
	 * Getter method for outStream.
	 *
	 * @return the outStream
	 */
	@SuppressWarnings("unused")
	private OutputStream getOutStream() {
		return outStream;
	}

	/**
	 * Setter method for outStream.
	 *
	 * @param outStream
	 *            the outStream to set
	 */
	@SuppressWarnings("unused")
	private void setOutStream(OutputStream outStream) {
		this.outStream = outStream;
	}

	/**
	 * Method transfers bytes
	 * 
	 * @param numberOfBytes
	 *            Number of bytes to be read.
	 * @param offset
	 *            Number of bytes from the beginning of the stream, which will be missed.
	 * @return number of transfer bytes.
	 * @throws IOException
	 */
	protected long transfer(int numberOfBytes, int offset) throws IOException {
		byte[] allBytes = new byte[numberOfBytes];
		long transferBytes = 0;
		inStream.skip(offset);
		transferBytes = inStream.read(allBytes, 0, numberOfBytes);
		outStream.write(allBytes);
		return transferBytes;

	}
}