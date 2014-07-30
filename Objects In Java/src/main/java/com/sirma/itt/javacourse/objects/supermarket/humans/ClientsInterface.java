package com.sirma.itt.javacourse.objects.supermarket.humans;

import java.math.BigDecimal;

public interface ClientsInterface {

	void buy();

	/**
	 * Method that signs of poor service
	 * 
	 * @param nameClient
	 *            first name of client
	 * @param LastNameClient
	 *            last name of client
	 * @param complaint
	 *            this is complaint from client
	 * @return text of complaint
	 */
	String complaint(String nameClient, String LastNameClient, String complaint);

	/**
	 * @param nameClient
	 *            first name of client
	 * @param LastNameClient
	 *            last name of client
	 * @param compliment
	 *            this is compliment from client
	 * @return text of compliment
	 */
	String compliment(String nameClient, String LastNameClient, String compliment);

	/**
	 * Method that sum value of all purchases made ​​by the customer
	 * 
	 * @return amount of supplied goods
	 */
	BigDecimal sumByAllTime();

	/**
	 * Method which calculates the discount
	 * 
	 * @return percentage value
	 */
	float calculateDiscounts();
}
