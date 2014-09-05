package com.sirma.itt.javacourse.objects.supermarket.humans;

/**
 * Class describing the behavior of a cleaners
 * 
 * @author Malvina Makarieva
 */
public class Cleaners extends Humans implements PersonnelManagment {
	/**
	 * Days and working time {@inheritDoc}
	 */
	@Override
	public void work() {
		System.out.println("8h/day, 5 days/week");
	}

	/**
	 * Calculate payroll
	 * 
	 * @return salary of the employee {@inheritDoc}
	 */
	@Override
	public float takeSalary() {
		return 400;
	}

	/**
	 * Periods of rest the employee {@inheritDoc}
	 */
	@Override
	public void getHoliday() {
		System.out.println("holiday are 30 days");

	}

}
