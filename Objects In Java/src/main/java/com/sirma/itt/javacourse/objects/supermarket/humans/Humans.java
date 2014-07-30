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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getComplaint() {
		return complaint;
	}

	public void setComplaint(String complaint) {
		this.complaint = complaint;
	}

	public String getCompliment() {
		return compliment;
	}

	public void setCompliment(String compliment) {
		this.compliment = compliment;
	}

}
