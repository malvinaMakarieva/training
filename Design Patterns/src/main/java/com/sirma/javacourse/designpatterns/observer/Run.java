package com.sirma.javacourse.designpatterns.observer;

/**
 * Class run Product and Observer.
 * 
 * @author mmakarieva
 */
public class Run {
	/**
	 * Main method.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Product product = new Product();

		AddProductObserver added = new AddProductObserver(product);
		SoldProductObserver sell = new SoldProductObserver(product);

		product.attachObserver("AddProductObserver", added);
		product.attachObserver("SoldProductObserver", sell);

		product.addProduct("banana");
		product.addProduct("tomato");
		product.soldProduct("banana");

	}
}
