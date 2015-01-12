package com.sirma.javacourse.designpatterns.abstractfactory;

/**
 * Class to get factories for Animals and Food Objects.
 * 
 * @author Malvina Makarieva
 */
public abstract class AbstractFactory {
	/**
	 * Astract method to get factory for Animals.
	 * 
	 * @param animal
	 *            concrete animal.
	 * @return animal
	 */
	abstract Animal getAnimal(String animal);

	/**
	 * Astract method to get factory for Food.
	 * 
	 * @param food
	 *            concrete food.
	 * @return animal.
	 */
	abstract Food getFood(String food);
}
