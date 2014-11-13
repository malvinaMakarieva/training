package com.sirma.itt.javacourse.inputoutput.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * In class implement methods for serialization class
 * 
 * @author Malvina Makarieva
 */
public class DataOperation {
	private String filename = "serlizationObject.ser";

	/**
	 * Save serialization object.
	 * 
	 * @param path
	 *            file in format .ser. It contains serialization object.
	 * @param userObject
	 *            field form UserDefinedObject type.
	 * @throws IOException
	 *             io exception.
	 */
	public void saveObject(String path, UserDefinedObject userObject) throws IOException {
		FileOutputStream fileOfStream = new FileOutputStream(filename);
		ObjectOutputStream obejctOutputStream = new ObjectOutputStream(fileOfStream);

		obejctOutputStream.writeObject(userObject);
		obejctOutputStream.close();
		fileOfStream.close();

	}

	/**
	 * Reading of instructions by file path UserDefinedObject instance of the class and returns it
	 * as a result.
	 * 
	 * @param path
	 *            file in format .ser. It contains serialization object.
	 * @return deserialize object from file ....ser.
	 * @throws IOException
	 *             io exception.
	 * @throws ClassNotFoundException
	 *             class not found exception.
	 */
	public UserDefinedObject getObject(String path) throws ClassNotFoundException, IOException {
		FileInputStream fileInputStream = new FileInputStream(filename);
		ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

		UserDefinedObject userObjectNew = (UserDefinedObject) objectInputStream.readObject();
		objectInputStream.close();
		fileInputStream.close();
		return userObjectNew;

	}
}
