package com.sirma.itt.javacourse.objects.supermarket.humans;

/**
 * Class describing the behavior of a sellers
 * 
 * @author Malvina Makarieva
 */
public class Seller extends Humans implements PersonnelInterface {

	@Override
	public void work() {
		System.out.println("4h/6days");

	}

	@Override
	public float takeSalary() {
		return 500;
	}

	@Override
	public void getHoliday() {
		System.out.println("30 days");
	}

}
