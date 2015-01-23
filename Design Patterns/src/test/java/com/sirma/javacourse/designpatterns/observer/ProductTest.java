package com.sirma.javacourse.designpatterns.observer;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Assert;
import org.junit.Test;

/**
 * Class test Product class.
 * 
 * @author mmakarieva
 */
public class ProductTest {
	Product testProduct = new Product();

	/**
	 * Test add new products and add to list.
	 */
	@Test
	public void testAddProduct() {
		AddProductObserver added = new AddProductObserver(testProduct);
		testProduct.attachObserver("AddProductObserver", added);

		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream ps = new PrintStream(baos);
		System.setOut(ps);
		testProduct.addProduct("banana");
		testProduct.addProduct("banana");
		System.out.flush();

		Assert.assertEquals("Add product, list - [banana]" + System.lineSeparator()
				+ "Add product, list - [banana, banana]" + System.lineSeparator(), baos.toString());
	}

	/**
	 * Test sell product list.
	 */
	@Test
	public void testSoldProduct() {
		SoldProductObserver sold = new SoldProductObserver(testProduct);
		testProduct.attachObserver("SoldProductObserver", sold);

		AddProductObserver added = new AddProductObserver(testProduct);
		testProduct.attachObserver("AddProductObserver", added);

		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream ps = new PrintStream(baos);
		System.setOut(ps);
		testProduct.addProduct("banana");
		testProduct.soldProduct("banana");
		System.out.flush();

		Assert.assertEquals("Add product, list - [banana]" + System.lineSeparator()
				+ "Product sold, list - []" + System.lineSeparator(), baos.toString());
	}
}
