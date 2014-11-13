package com.sirma.itt.javacourse.inputoutput.serialization;

import java.io.Serializable;

/**
 * Class intended for serialization of data for users.
 * 
 * @author Malvina Makarieva
 */
public class UserDefinedObject implements Serializable {
	/**
	 * Comment for serialVersionUID.
	 */
	private static final long serialVersionUID = -4362129500020688930L;
	private String userName;
	private String email;
	private transient String password;
	private transient Long phoneNumber;

	/**
	 * Default constructor.
	 */
	public UserDefinedObject() {

	}

	/**
	 * Getter method for userName.
	 *
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * Setter method for userName.
	 *
	 * @param userName
	 *            the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * Getter method for email.
	 *
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * Setter method for email.
	 *
	 * @param email
	 *            the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * Getter method for password.
	 *
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * Setter method for password.
	 *
	 * @param password
	 *            the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * Getter method for phoneNumber.
	 *
	 * @return the phoneNumber
	 */
	public Long getPhoneNumber() {
		return phoneNumber;
	}

	/**
	 * Setter method for phoneNumber.
	 *
	 * @param phoneNumber
	 *            the phoneNumber to set
	 */
	public void setPhoneNumber(Long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	/**
	 * The toString method for class Object returns a string consisting of the name of the class of
	 * which the object is an instance. {@inheritDoc}
	 */
	@Override
	public String toString() {
		return "Username " + userName + ", email: " + email + ", telephone number " + phoneNumber
				+ ", password:" + password;

	}

}
