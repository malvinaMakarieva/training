package com.sirma.itt.javacourse.refannotregex.instanceclass;

import java.math.BigInteger;

/**
 * Class describes all mandatory fields for products.
 * 
 * @author Malvina Makarieva
 */
public class Products {

	private String nameOfProduct;
	private float quantity;
	private BigInteger barcode;
	private double price;

	/**
	 * Default constructor.
	 */
	public Products() {
	}

	/**
	 * Constructor of class Product.
	 * 
	 * @param currentNameProduc
	 *            name of product.
	 * @param currentQuantity
	 *            quantity of product.
	 * @param currentBarcode
	 *            number of barcode on product.
	 * @param currentPrice
	 *            price of one of product.
	 */
	public Products(String currentNameProduc, float currentQuantity, BigInteger currentBarcode,
			double currentPrice) {
		this.nameOfProduct = currentNameProduc;
		this.quantity = currentQuantity;
		this.barcode = currentBarcode;
		this.price = currentPrice;
	}

	/**
	 * Getter method for nameOfProduct.
	 *
	 * @return the nameOfProduct
	 */
	public String getNameOfProduct() {
		return nameOfProduct;
	}

	/**
	 * Setter method for nameOfProduct.
	 *
	 * @param nameOfProduct
	 *            the nameOfProduct to set
	 */
	public void setNameOfProduct(String nameOfProduct) {
		this.nameOfProduct = nameOfProduct;
	}

	/**
	 * Getter method for quantity.
	 *
	 * @return the quantity
	 */
	public float getQuantity() {
		return quantity;
	}

	/**
	 * Setter method for quantity.
	 *
	 * @param quantity
	 *            the quantity to set
	 */
	public void setQuantity(float quantity) {
		this.quantity = quantity;
	}

	/**
	 * Getter method for barcode.
	 *
	 * @return the barcode
	 */
	public BigInteger getBarcode() {
		return barcode;
	}

	/**
	 * Setter method for barcode.
	 *
	 * @param barcode
	 *            the barcode to set
	 */
	public void setBarcode(BigInteger barcode) {
		this.barcode = barcode;
	}

	/**
	 * Getter method for price.
	 *
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * Setter method for price.
	 *
	 * @param price
	 *            the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}

}