package com.sirma.javacourse.designpatterns.observer;

import java.util.List;

public class SoldProductObserver extends Observer {
	public SoldProductObserver(Product product) {
		this.product = product;
	}

	@Override
	public void update(List<String> product) {
		System.out.println("Product sold, list - " + product);

	}
}
