package com.sirma.javacourse.designpatterns.abstractfactory;

/**
 * Factory producer class to get factories by passing an information such as animal or food.
 * 
 * @author Malvina Makarieva
 */
public class FactoryProducer {
	/**
	 * Method call AnimalFactory or FoodFactory classes.
	 * 
	 * @param choice
	 *            animal or food.
	 * @return abstract factory.
	 */
	public static AbstractFactory getFactory(String choice) {
		if (choice.equalsIgnoreCase("Animal")) {
			return new AnimalFactory();
		} else if (choice.equalsIgnoreCase("Food")) {
			return new FoodFactory();
		}
		return null;
	}
}
