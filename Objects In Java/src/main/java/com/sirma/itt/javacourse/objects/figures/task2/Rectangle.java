package com.sirma.itt.javacourse.objects.figures.task2;

import com.sirma.itt.javacourse.objects.figures.task1.Point;

/**
 * Class represents the data needed to draw the rectangle and constructors.
 * 
 * @author Malvina Makarieva.
 */
public class Rectangle extends Square {
	Point a;
	float width;
	float height;

	/**
	 * Default constructor.
	 */
	Rectangle() {

	}

	/**
	 * Constructor of Rectangle class.
	 * 
	 * @param point
	 *            object from class Point represent point of x and y from coordinate system.
	 * @param currentWidthRectangle
	 *            width of rectangle.
	 * @param currentHeighthRectangle
	 *            height of rectangle.
	 */
	Rectangle(Point point, float currentWidthRectangle, float currentHeighthRectangle) {
		this.a = point;
		this.width = currentWidthRectangle;
		this.height = currentHeighthRectangle;
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
	 * Getter method for height.
	 *
	 * @return the height
	 */
	public float getHeight() {
		return height;
	}

	/**
	 * Setter method for height.
	 *
	 * @param height
	 *            the height to set
	 */
	public void setHeight(float height) {
		this.height = height;
	}

	/**
	 * Method that draw rectangle.
	 */
	public void drow() {
		System.out.println("Point of rectangle is " + a);
		System.out.println("Wight of rectangle is " + width);
		System.out.println("Height of rectangle is " + height);

	}

}
