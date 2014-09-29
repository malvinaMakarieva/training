package com.sirma.itt.javacourse.refannotregex.annotation;

/**
 * Class is parent of Sub classes.
 * 
 * @author Malvina Makarieva
 */
public class SuperClass implements Comparable<SuperClass> {
	/**
	 * {@inheritDoc}
	 */
	public int compareTo(SuperClass o) {
		int compareQuantity = ((SuperClass) o).getClass().getAnnotation(SerialNumber.class).value();

		return this.getClass().getAnnotation(SerialNumber.class).value() - compareQuantity;
	}

}
