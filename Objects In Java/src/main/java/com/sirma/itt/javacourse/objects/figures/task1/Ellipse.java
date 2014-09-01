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
	 * Getter method for firstRadius.
	 *
	 * @return the firstRadius
	 */
	public float getFirstRadius() {
		return firstRadius;
	}

	/**
	 * Setter method for firstRadius.
	 *
	 * @param firstRadius
	 *            the firstRadius to set
	 */
	public void setFirstRadius(float firstRadius) {
		this.firstRadius = firstRadius;
	}

	/**
	 * Getter method for secondRadius.
	 *
	 * @return the secondRadius
	 */
	public float getSecondRadius() {
		return secondRadius;
	}

	/**
	 * Setter method for secondRadius.
	 *
	 * @param secondRadius
	 *            the secondRadius to set
	 */
	public void setSecondRadius(float secondRadius) {
		this.secondRadius = secondRadius;
	}

	/**
	 * Method that draw ellipse.
	 */
	public void drow() {
		System.out.println("Ellipse point is " + a);
		System.out.println("Ellipse first radius is " + firstRadius);
		System.out.println("Ellipse second radius is " + secondRadius);

	}
}
