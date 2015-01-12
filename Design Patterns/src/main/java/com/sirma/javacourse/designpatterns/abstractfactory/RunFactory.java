package com.sirma.javacourse.designpatterns.abstractfactory;

/**
 * Class that run factory.
 * 
 * @author Malvina Makarieva
 */
public class RunFactory {
	/**
	 * Main method.
	 * 
	 * @param args
	 *            the args.
	 */
	public static void main(String[] args) {
		AbstractFactory animalFactory = FactoryProducer.getFactory("Animal");
		AbstractFactory foodFactory = FactoryProducer.getFactory("Food");

		Animal firstAnimal = animalFactory.getAnimal("Lynx");
		firstAnimal.live();
		Food thirdFood = foodFactory.getFood("Meat");
		thirdFood.animalsEatFood();

		Animal secondAnimal = animalFactory.getAnimal("Bear");
		secondAnimal.live();
		Food secondFood = foodFactory.getFood("All");
		secondFood.animalsEatFood();

		Animal thirdAnimal = animalFactory.getAnimal("Elephant");
		thirdAnimal.live();
		Food firstFood = foodFactory.getFood("Plants");
		firstFood.animalsEatFood();

	}

}
