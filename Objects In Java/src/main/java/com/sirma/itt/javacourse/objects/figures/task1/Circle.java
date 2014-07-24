package com.sirma.itt.javacourse.objects.figures.task1;

/**
 * Class represents the data needed to draw the circle and constructors .
 * 
 * @author Malvina Makarieva
 */
public class Circle extends Curve {
	Point a;
	float radius;

	/**
	 * Default constructor of Circle class.
	 */
	Circle() {

	}

	/**
	 * Constructor of Circle class.
	 * 
	 * @param point
	 *            object from class Point represent point of x and y from coordinate system.
	 * @param radius
	 *            length of radius.
	 */
	Circle(Point point, float radius) {
		this.a = point;
		this.radius = radius;
	}

	public Point getA() {
		return a;
	}

	public void setA(Point a) {
		this.a = a;
	}

	public float getRadius() {
		return radius;
	}

	public void setRadius(float radius) {
		this.radius = radius;
	}

	/**
	 * Method that drow circle.
	 */
	private void drow() {
		System.out.println("Circule point is " + a);
		System.out.println("Circule radius is " + radius);

	}
}
