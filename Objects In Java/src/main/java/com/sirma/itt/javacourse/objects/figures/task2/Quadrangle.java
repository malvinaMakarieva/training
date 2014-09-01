package com.sirma.itt.javacourse.objects.figures.task2;

import com.sirma.itt.javacourse.objects.figures.task1.Point;

/**
 * Class represents the data needed to draw the quadrangle and constructors.
 * 
 * @author Malvina Makarieva
 */
public class Quadrangle extends Point {
	Point a;
	Point b;
	Point c;
	Point d;

	/**
	 * Default constructor.
	 */
	Quadrangle() {

	}

	/**
	 * Constructor of Quadrangle class.
	 * 
	 * @param first
	 *            first point of the figure.
	 * @param second
	 *            second point of the figure.
	 * @param third
	 *            third point of the figure.
	 * @param fourth
	 *            fourth point of the figure.
	 */
	Quadrangle(Point first, Point second, Point third, Point fourth) {
		this.a = first;
		this.b = second;
		this.c = third;
		this.d = fourth;

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
	 * Getter method for b.
	 *
	 * @return the b
	 */
	public Point getB() {
		return b;
	}

	/**
	 * Setter method for b.
	 *
	 * @param b
	 *            the b to set
	 */
	public void setB(Point b) {
		this.b = b;
	}

	/**
	 * Getter method for c.
	 *
	 * @return the c
	 */
	public Point getC() {
		return c;
	}

	/**
	 * Setter method for c.
	 *
	 * @param c
	 *            the c to set
	 */
	public void setC(Point c) {
		this.c = c;
	}

	/**
	 * Getter method for d.
	 *
	 * @return the d
	 */
	public Point getD() {
		return d;
	}

	/**
	 * Setter method for d.
	 *
	 * @param d
	 *            the d to set
	 */
	public void setD(Point d) {
		this.d = d;
	}

	/**
	 * Method that draw quadrangle.
	 */
	public void drow() {
		System.out.println("Point A is " + a);
		System.out.println("Point B is " + b);
		System.out.println("Point C is " + c);
		System.out.println("Point D is " + d);

	}

}
