package com.sirma.itt.javacourse.objects.supermarket.humans;

/**
 * Class describing the behavior of a securety
 * 
 * @author Malvina Makarieva
 */
public class Securety extends Humans implements PersonnelManagment {
	/**
	 * Days and working time {@inheritDoc}
	 */
	@Override
	public void work() {
		System.out.println("10h/4 days");
	}

	/**
	 * Calculate payroll
	 * 
	 * @return salary of the employee {@inheritDoc}
	 */
	@Override
	public float takeSalary() {
		return 500.30f;
	}

	/**
	 * Periods of rest the employee {@inheritDoc}
	 */
	@Override
	public void getHoliday() {
		System.out.println("30 days");

	}

}
