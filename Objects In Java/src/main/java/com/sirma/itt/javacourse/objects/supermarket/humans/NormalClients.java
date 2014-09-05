package com.sirma.itt.javacourse.objects.supermarket.humans;

import com.sirma.itt.javacourse.objects.supermarket.product.Products;

/**
 * Class describing the behavior of a normal client
 * 
 * @author Malvina Makarieva
 */
public class NormalClients extends Humans implements ClientsManagment {
	/**
	 * Method that signs of poor service
	 * 
	 * @param nameClient
	 *            first name of client
	 * @param LastNameClient
	 *            last name of client
	 * @param complaint
	 *            this is complaint from client
	 * @return text of complaint {@inheritDoc}
	 */
	@Override
	public String complaint(String nameClient, String LastNameClient, String complaint) {
		System.out.println("Important" + complaint + " form " + nameClient + " " + LastNameClient);
		return null;
	}

	/**
	 * @param nameClient
	 *            first name of client
	 * @param LastNameClient
	 *            last name of client
	 * @param compliment
	 *            this is compliment from client
	 * @return text of compliment {@inheritDoc}
	 */
	@Override
	public String compliment(String nameClient, String LastNameClient, String compliment) {
		System.out.println("Important" + compliment + " form " + nameClient + " " + LastNameClient);
		return null;
	}

	/**
	 * Method that sum value of all purchases made ​​by the customer
	 * 
	 * @return amount of supplied goods {@inheritDoc}
	 */
	@Override
	public Double sumByAllTime() {
		return null;
	}

	/**
	 * Method which calculates the discount
	 * 
	 * @return percentage value {@inheritDoc}
	 */
	@Override
	public float calculateDiscounts() {
		System.out.println("Discount for you is 2%");
		return 0.02f;
	}

	/**
	 * /** Method that which contains information about purchases made.
	 * 
	 * @param products
	 *            array from buy products. {@inheritDoc}
	 */

	@Override
	public Double buy(Products[] products) {
		double currentSum = 0;
		System.out.println("Sum of product is " + currentSum);
		return currentSum;

	}
}
