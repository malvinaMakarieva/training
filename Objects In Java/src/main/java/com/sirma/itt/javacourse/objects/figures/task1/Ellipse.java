package com.sirma.itt.javacourse.objects.figures.task1;

/**
 * Class represents the data needed to draw the ellipse and constructors.
 * 
 * @author Mlvina Makarieva.
 */
public class Ellipse extends Circle {
	Point a;
	float radius1;
	float radius2;

	/**
	 * Default constructor.
	 */
	Ellipse() {
	}

	/**
	 * Constructor of class Ellpse.
	 * 
	 * @param point
	 *            object from class Point represent point of x and y from coordinate system.
	 * @param firstRadius
	 *            length of the radius in the length.
	 * @param secondRadius
	 *            length of the radius in the width.
	 */
	Ellipse(Point point, float firstRadius, float secondRadius) {
		this.a = point;
		this.radius1 = firstRadius;
		this.radius2 = secondRadius;
	}

	public Point getA() {
		return a;
	}

	public void setA(Point a) {
		this.a = a;
	}

	public float getRadius1() {
		return radius1;
	}

	public void setRadius1(float radius1) {
		this.radius1 = radius1;
	}

	public float getRadius2() {
		return radius2;
	}

	public void setRadius2(float radius2) {
		this.radius2 = radius2;
	}

	/**
	 * Method that drow ellipse.
	 */
	private void drow() {
		System.out.println("Ellipse point is " + a);
		System.out.println("Ellipse first radius is " + radius1);
		System.out.println("Ellipse second radius is " + radius2);

	}
}
