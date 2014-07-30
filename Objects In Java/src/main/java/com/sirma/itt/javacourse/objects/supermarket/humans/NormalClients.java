package com.sirma.itt.javacourse.objects.supermarket.humans;

import java.math.BigDecimal;

/**
 * Class describing the behavior of a normal client
 * 
 * @author Malvina Makarieva
 */
public class NormalClients extends Humans implements ClientsInterface {

	@Override
	public void buy() {
		System.out.println("Still can buy");
	}

	@Override
	public String complaint(String nameClient, String LastNameClient, String complaint) {
		System.out.println("Important" + complaint + " form " + nameClient + " " + LastNameClient);
		return null;
	}

	@Override
	public String compliment(String nameClient, String LastNameClient, String compliment) {
		System.out.println("Important" + compliment + " form " + nameClient + " " + LastNameClient);
		return null;
	}

	@Override
	public BigDecimal sumByAllTime() {
		return null;
	}

	@Override
	public float calculateDiscounts() {
		System.out.println("Discount for you is 2%");
		return 0.02f;
	}

}
