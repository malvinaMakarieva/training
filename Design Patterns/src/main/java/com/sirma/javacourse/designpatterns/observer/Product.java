package com.sirma.javacourse.designpatterns.observer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Class contains methods for selling products and their delivery.
 * 
 * @author mmakarieva
 */
public class Product {

	private Map<String, Observer> observers = new HashMap<String, Observer>();
	private List<String> product = new ArrayList<String>();

	/**
	 * Default constructor.
	 */
	public Product() {

	}

	/**
	 * Add an observer to monitor.
	 * 
	 * @param nameObserver
	 *            name of observer.
	 * @param observer
	 *            observer object.
	 */
	public void attachObserver(String nameObserver, Observer observer) {
		observers.put(nameObserver, observer);
	}

	/**
	 * Notifycation for AddProductObserver.
	 * 
	 * @param porduct
	 *            to be add.
	 */
	public void notifyAddObserver(String porduct) {
		Observer addProduct = observers.get("AddProductObserver");
		addProduct.update(product);
	}

	/**
	 * Notifycation for SoldProductObserver.
	 * 
	 * @param porduct
	 *            sold oproduct.
	 */
	public void notifySoldProductObserver(String porduct) {
		Observer soldProduct = observers.get("SoldProductObserver");
		soldProduct.update(product);
	}

	/**
	 * Add product to store.
	 * 
	 * @param newProduct
	 *            new product to add.
	 */
	public void addProduct(String newProduct) {
		product.add(newProduct);
		notifyAddObserver(newProduct);
	}

	/**
	 * Remove sold product from list of products.
	 * 
	 * @param sellProduct
	 *            product was sold
	 */
	public void soldProduct(String sellProduct) {
		product.remove(sellProduct);
		notifySoldProductObserver(sellProduct);
	}

	/**
	 * Getter method for observers.
	 *
	 * @return the observers
	 */
	public Map<String, Observer> getObservers() {
		return observers;
	}

	/**
	 * Setter method for observers.
	 *
	 * @param observers
	 *            the observers to set
	 */
	public void setObservers(Map<String, Observer> observers) {
		this.observers = observers;
	}

	/**
	 * Getter method for product.
	 *
	 * @return the product
	 */
	public List<String> getProduct() {
		return product;
	}

	/**
	 * Setter method for product.
	 *
	 * @param product
	 *            the product to set
	 */
	public void setProduct(List<String> product) {
		this.product = product;
	}

}
