package com.sirma.itt.javacourse.objects.supermarket.humans;

public class Manager extends Humans implements PersonnelManagment {

	@Override
	public void work() {
		System.out.println("8h/day, 5 days/week");

	}

	@Override
	public float takeSalary() {
		return 650.05f;
	}

	@Override
	public void getHoliday() {
		System.out.println(" 30 days");

	}

}
