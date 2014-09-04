package com.sirma.itt.javacourse.objects.supermarket.product;


/**
 * Interface describing the behavior of products
 * 
 * @author Malvina Makarieva
 */
public interface ProductManagment {
	/**
	 * Method describes the receipt of new quantities of product.
	 * 
	 * @return quantity supplied
	 */
	Double delivered();

	/**
	 * Method describes the amount of goods sold.
	 * 
	 * @return how many of this product was sold
	 */
	Double sold();

	/**
	 * Method calculates the discarded goods.
	 * 
	 * @return amount of discarded products
	 */
	Double scrappedProducts();

	/**
	 * Method describes the gain or loss on sales of the product
	 * 
	 * @return gain or loss on sales
	 */
	Double incomeOrwaste();

}
