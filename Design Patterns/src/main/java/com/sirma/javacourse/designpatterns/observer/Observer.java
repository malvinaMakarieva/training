package com.sirma.javacourse.designpatterns.observer;

import java.util.List;

/**
 * Abstract class Observer.
 * 
 * @author mmakarieva
 */
public abstract class Observer {

	protected Product product;

	/**
	 * Method update list of add/sold product.
	 * 
	 * @param product
	 *            list of product.
	 */
	public abstract void update(List<String> product);

}
