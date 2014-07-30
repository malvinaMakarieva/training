package com.sirma.itt.javacourse.objects.supermarket.humans;

/**
 * Class describing the behavior of a securety
 * 
 * @author Malvina Makarieva
 */
public class Securety extends Humans implements PersonnelInterface {

	@Override
	public void work() {
		System.out.println("10h/4 days");

	}

	@Override
	public float takeSalary() {
		return 500.30f;
	}

	@Override
	public void getHoliday() {
		System.out.println("30 days");

	}

}
