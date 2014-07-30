package com.sirma.itt.javacourse.objects.figures.task1;

/**
 * Class represents the data needed to draw the ellipse and constructors.
 * 
 * @author Mlvina Makarieva.
 */
public class Ellipse extends Circle {
	Point a;
	float firstRadius;
	float secondRadius;

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
		this.firstRadius = firstRadius;
		this.secondRadius = secondRadius;
	}

	public Point getA() {
		return a;
	}

	public void setA(Point a) {
		this.a = a;
	}

	public float getRadius1() {
		return firstRadius;
	}

	public void setRadius1(float radius1) {
		this.firstRadius = radius1;
	}

	public float getRadius2() {
		return secondRadius;
	}

	public void setRadius2(float radius2) {
		this.secondRadius = radius2;
	}

	/**
	 * Method that drow ellipse.
	 */
	private void drow() {
		System.out.println("Ellipse point is " + a);
		System.out.println("Ellipse first radius is " + firstRadius);
		System.out.println("Ellipse second radius is " + secondRadius);

	}
}
