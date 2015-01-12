package com.sirma.javacourse.designpatterns.abstractfactory;

/**
 * Class describe plants and animals as food of other animals.
 * 
 * @author Malvina Makarieva
 */
public class PlantsAndMeat implements Food {
	/**
	 * Method animalsEatFood for all food /meat and plants. {@inheritDoc}
	 */
	public void animalsEatFood() {
		System.out.println("Eat plants and animals.:: animalsEatFood() method");

	}

}
