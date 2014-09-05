package com.sirma.itt.javacourse.objects.figures.task2;

import com.sirma.itt.javacourse.objects.figures.task1.Point;

/**
 * Class represents the data needed to draw the square and constructors.
 * 
 * @author Malvina Makarieva
 */
public class Square extends Point {

	private Point a;
	private float width;

	/**
	 * Default constructor
	 */
	Square() {

	}

	/**
	 * Constructor of Square class
	 * 
	 * @param point
	 *            object from class Point represent point of x and y from coordinate system.
	 * @param width
	 *            the side length of the square
	 */
	Square(Point point, float width) {
		this.a = point;
		this.width = width;
	}

	/**
	 * Getter method for a.
	 *
	 * @return the a
	 */
	public Point getA() {
		return a;
	}

	/**
	 * Setter method for a.
	 *
	 * @param a
	 *            the a to set
	 */
	public void setA(Point a) {
		this.a = a;
	}

	/**
	 * Getter method for width.
	 *
	 * @return the width
	 */
	public float getWidth() {
		return width;
	}

	/**
	 * Setter method for width.
	 *
	 * @param width
	 *            the width to set
	 */
	public void setWidth(float width) {
		this.width = width;
	}

	/**
	 * Method that draw square.
	 */
	public void drow() {
		System.out.println("Point of square is " + a);
		System.out.println("Width of square is " + width);
	}
}
