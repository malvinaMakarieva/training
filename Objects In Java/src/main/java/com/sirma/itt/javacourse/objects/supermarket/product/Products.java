package com.sirma.itt.javacourse.objects.supermarket.product;

import java.math.BigInteger;

/**
 * Class describes all mandatory fields for products.
 * 
 * @author Malvina Makarieva
 */
public class Products {

	String nameOfProduct;
	float quantity;
	BigInteger barcode;
	double price;

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

	public String getNameOfProduct() {
		return nameOfProduct;
	}

	public void setNameOfProduct(String nameOfProduct) {
		this.nameOfProduct = nameOfProduct;
	}

	public float getQuantity() {
		return quantity;
	}

	public void setQuantity(float quantity) {
		this.quantity = quantity;
	}

	public BigInteger getBarcode() {
		return barcode;
	}

	public void setBarcode(BigInteger barcode) {
		this.barcode = barcode;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
}
