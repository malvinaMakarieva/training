package com.sirma.javacourse.designpatterns.abstractfactory;

/**
 * Class generate object of concrete class based on given information abaut animal.
 * 
 * @author Malvina Makarieva
 */
public class AnimalFactory extends AbstractFactory {
	/**
	 * Get animal. {@inheritDoc}
	 */
	@Override
	Animal getAnimal(String kindAnimal) {
		if (kindAnimal == null) {
			return null;
		}
		if (kindAnimal.equalsIgnoreCase("Bear")) {
			return new Bear();
		} else if (kindAnimal.equalsIgnoreCase("Lynx")) {
			return new Lynx();
		} else if (kindAnimal.equalsIgnoreCase("Elephant")) {
			return new Elephant();
		}
		return null;
	}

	/**
	 * Get food. {@inheritDoc}
	 */
	@Override
	Food getFood(String food) {
		return null;
	}

}
