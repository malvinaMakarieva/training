package com.sirma.javacourse.designpatterns.observer;

import java.util.List;

/**
 * Observer to add product into statistic.
 * 
 * @author mmakarieva
 */
public class AddProductObserver extends Observer {

	public AddProductObserver(Product product) {
		this.product = product;
	}

	@Override
	public void update(List<String> product) {
		System.out.println("Add product, list - " + product);

	}

}
