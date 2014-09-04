package com.sirma.itt.javacourse.objects.supermarket.humans;

/**
 * Interface defining the main activities of the employees of the supermarket
 * 
 * @author Malvina Makarieva
 */
public interface PersonnelManagment {
	/**
	 * Days and working time
	 */
	void work();

	/**
	 * Calculate payroll
	 * 
	 * @return salary of the employee
	 */
	float takeSalary();

	/**
	 * Periods of rest the employee
	 */
	void getHoliday();

}
