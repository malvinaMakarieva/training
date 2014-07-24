package com.sirma.itt.javacourse.objects.figures.task1;

import com.sirma.itt.javacourse.objects.figures.Figure;

/**
 * Class represents the data needed to draw the point and constructors.
 * 
 * @author Malvina Makarieva.
 */
public class Point extends Figure {
	float x;
	float y;

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

	public float getX() {
		return x;
	}

	public void setX(float x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
	}

	/**
	 * Method that drow point.
	 */
	@Override
	public void draw() {
		System.out.println("x axes=" + x);
		System.out.println("y axes=" + y);
	}
}
