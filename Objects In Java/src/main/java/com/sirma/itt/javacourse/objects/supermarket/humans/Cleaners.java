package com.sirma.itt.javacourse.objects.supermarket.humans;

/**
 * Class describing the behavior of a cleaners
 * 
 * @author Malvina Makarieva
 */
public class Cleaners extends Humans implements PersonnelManagment {

	@Override
	public void work() {
		System.out.println("8h/day, 5 days/week");

	}

	@Override
	public float takeSalary() {
		return 400;
	}

	@Override
	public void getHoliday() {
		System.out.println("holiday are 30 days");

	}

}
