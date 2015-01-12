package com.sirma.javacourse.designpatterns.abstractfactory;

/**
 * Class generate object of concrete class based on given information abaut food.
 * 
 * @author Malvina Makarieva
 */
public class FoodFactory extends AbstractFactory {
	/**
	 * Get animal. {@inheritDoc}
	 */
	@Override
	Animal getAnimal(String animal) {
		return null;
	}

	/**
	 * Get food. {@inheritDoc}
	 */
	@Override
	Food getFood(String foodType) {
		if (foodType == null) {
			return null;
		}
		if (foodType.equalsIgnoreCase("Meat")) {
			return new Meat();
		} else if (foodType.equalsIgnoreCase("Plants")) {
			return new Plants();
		} else if (foodType.equalsIgnoreCase("All")) {
			return new PlantsAndMeat();
		}
		return null;
	}

}
