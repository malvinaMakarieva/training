package com.sirma.itt.javacourse.objects.figures.task3;

import com.sirma.itt.javacourse.objects.figures.Figure;

/**
 * Class represents the data needed to draw the point and constructors.
 * 
 * @author Malvina Makarieva.
 */
public class Point extends Figure {
	private float x;
	private float y;

	/**
	 * Default constructor.
	 */
	public Point() {

	}

	/**
	 * Constructor of Point class.
	 * 
	 * @param x
	 *            point coordinate of X.
	 * @param y
	 *            point coordinate of Y.
	 */
	public Point(float x, float y) {
		this.x = x;
		this.y = y;
	}

	/**
	 * Getter method for x.
	 *
	 * @return the x
	 */
	public float getX() {
		return x;
	}

	/**
	 * Setter method for x.
	 *
	 * @param x
	 *            the x to set
	 */
	public void setX(float x) {
		this.x = x;
	}

	/**
	 * Getter method for y.
	 *
	 * @return the y
	 */
	public float getY() {
		return y;
	}

	/**
	 * Setter method for y.
	 *
	 * @param y
	 *            the y to set
	 */
	public void setY(float y) {
		this.y = y;
	}

	/**
	 * Method that draw point.
	 */
	@Override
	public void draw() {
		System.out.println("x axes=" + x);
		System.out.println("y axes=" + y);
	}
}
