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
	 * Method that drow rectangle.
	 */
	private void drow() {
		System.out.println("Point of rectangle is " + a);
		System.out.println("Wight of rectangle is " + width);
		System.out.println("Height of rectangle is " + height);

	}

}
