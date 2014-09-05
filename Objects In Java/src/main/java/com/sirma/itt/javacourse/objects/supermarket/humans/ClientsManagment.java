package com.sirma.itt.javacourse.objects.supermarket.humans;

import com.sirma.itt.javacourse.objects.supermarket.product.Products;

public interface ClientsManagment {
	/**
	 * Method that which contains information about purchases made.
	 * 
	 * @param products
	 *            array from buy products.
	 * @return
	 */
	Double buy(Products[] products);

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
	Double sumByAllTime();

	/**
	 * Method which calculates the discount
	 * 
	 * @return percentage value
	 */
	float calculateDiscounts();

}
