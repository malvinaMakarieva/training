package com.sirma.itt.javacourse.objects.supermarket.humans;

/**
 * Class describing the behavior of a sellers
 * 
 * @author Malvina Makarieva
 */
public class Seller extends Humans implements PersonnelManagment {
	/**
	 * Days and working time {@inheritDoc}
	 */
	@Override
	public void work() {
		System.out.println("4h/6days");
	}

	/**
	 * Calculate payroll
	 * 
	 * @return salary of the employee {@inheritDoc}
	 */
	@Override
	public float takeSalary() {
		return 500f;
	}

	/**
	 * Periods of rest the employee {@inheritDoc}
	 */
	@Override
	public void getHoliday() {
		System.out.println("30 days");
	}

}
