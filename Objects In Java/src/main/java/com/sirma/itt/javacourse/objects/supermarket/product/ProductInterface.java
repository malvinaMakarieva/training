package com.sirma.itt.javacourse.objects.supermarket.product;

import java.math.BigDecimal;

/**
 * Interface describing the behavior of products
 * 
 * @author Malvina Makarieva
 */
public interface ProductInterface {
	/**
	 * Method describes the receipt of new quantities of product.
	 * 
	 * @return quantity supplied
	 */
	BigDecimal delivered();

	/**
	 * Method describes the amount of goods sold.
	 * 
	 * @return how many of this product was sold
	 */
	BigDecimal sold();

	/**
	 * Method calculates the discarded goods.
	 * 
	 * @return amount of discarded products
	 */
	BigDecimal scrappedProducts();

	/**
	 * Method describes the gain or loss on sales of the product
	 * 
	 * @return gain or loss on sales
	 */
	BigDecimal incomeOrwaste();

}
