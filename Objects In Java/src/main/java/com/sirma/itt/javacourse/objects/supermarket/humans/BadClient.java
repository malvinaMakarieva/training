package com.sirma.itt.javacourse.objects.supermarket.humans;

import java.math.BigDecimal;

/**
 * Class describing the behavior of a bad client
 * 
 * @author Malvina Makarieva
 */
public class BadClient extends Humans implements ClientsInterface {

	@Override
	public void buy() {
		System.out.println("Still can buy");
	}

	@Override
	public String complaint(String nameClient, String LastNameClient, String complaint) {
		System.out.println("Ignores" + complaint + " from " + nameClient + " " + LastNameClient);
		System.out.println("Ignores" + complaint);
		return null;
	}

	@Override
	public String compliment(String nameClient, String LastNameClient, String compliment) {
		System.out.println("Ignores" + compliment + " from " + nameClient + " " + LastNameClient);
		return null;
	}

	@Override
	public BigDecimal sumByAllTime() {
		return null;
	}

	@Override
	public float calculateDiscounts() {
		System.out.println("Discount for you is 0%");
		return 0.0f;
	}

}
