package com.sirma.itt.javacourse.objects.supermarket.product;

/**
 * Class associated with the operation of meat.
 * 
 * @author Malvina Makarieva
 */
public class Meat extends Foodstuffs implements ProductManagment {
	/**
	 * Method describes the receipt of new quantities of product.
	 * 
	 * @return quantity supplied {@inheritDoc}
	 */
	@Override
	public Double delivered() {
		return null;
	}

	/**
	 * Method describes the amount of goods sold.
	 * 
	 * @return how many of this product was sold {@inheritDoc}
	 */
	@Override
	public Double sold() {
		return null;
	}

	/**
	 * Method calculates the discarded goods.
	 * 
	 * @return amount of discarded products {@inheritDoc}
	 */
	@Override
	public Double scrappedProducts() {
		return null;
	}

	/**
	 * Method describes the gain or loss on sales of the product
	 * 
	 * @return gain or loss on sales {@inheritDoc}
	 */
	@Override
	public Double incomeOrwaste() {
		return null;
	}

}
