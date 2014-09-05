package com.sirma.itt.javacourse.objects.supermarket.humans;

public class Manager extends Humans implements PersonnelManagment {
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
	 * @return salary of the employee
	 */
	@Override
	public float takeSalary() {
		return 650.05f;
	}

	/**
	 * Periods of rest the employee {@inheritDoc}
	 */
	@Override
	public void getHoliday() {
		System.out.println(" 30 days");

	}

}
