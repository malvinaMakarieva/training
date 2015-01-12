package com.sirma.javacourse.designpatterns.abstractfactory;

/**
 * Class describe plants as a food.
 * 
 * @author Malvina Makarieva
 */
public class Plants implements Food {
	/**
	 * Method animalsEatFood for all herbivorous animals. {@inheritDoc}
	 */
	public void animalsEatFood() {
		System.out.println("Eat grasses, roots, fruit and bark.:: animalsEatFood() method");

	}

}
