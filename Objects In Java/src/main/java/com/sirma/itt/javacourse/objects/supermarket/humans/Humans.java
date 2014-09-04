package com.sirma.itt.javacourse.objects.supermarket.humans;

/**
 * Class that characterizes all the common characteristics of people.
 * 
 * @author Malvina Makarieva
 */
public class Humans {
	String name;
	String lastName;
	String complaint;
	String compliment;

	/**
	 * Default constructor.
	 */
	public Humans() {
	}

	/**
	 * Constructor for class Humans.
	 * 
	 * @param humanFirstName
	 *            first name of human.
	 * @param humanLastName
	 *            last name of human.
	 * @param humanComplaint
	 *            some complaint from human.
	 * @param humanCompliment
	 *            some compliment from human.
	 */
	public Humans(String humanFirstName, String humanLastName, String humanComplaint,
			String humanCompliment) {
		this.name = humanFirstName;
		this.lastName = humanLastName;
		this.complaint = humanComplaint;
		this.compliment = humanCompliment;
	}

	/**
	 * Getter method for name.
	 *
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Setter method for name.
	 *
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Getter method for lastName.
	 *
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * Setter method for lastName.
	 *
	 * @param lastName
	 *            the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * Getter method for complaint.
	 *
	 * @return the complaint
	 */
	public String getComplaint() {
		return complaint;
	}

	/**
	 * Setter method for complaint.
	 *
	 * @param complaint
	 *            the complaint to set
	 */
	public void setComplaint(String complaint) {
		this.complaint = complaint;
	}

	/**
	 * Getter method for compliment.
	 *
	 * @return the compliment
	 */
	public String getCompliment() {
		return compliment;
	}

	/**
	 * Setter method for compliment.
	 *
	 * @param compliment
	 *            the compliment to set
	 */
	public void setCompliment(String compliment) {
		this.compliment = compliment;
	}

}
