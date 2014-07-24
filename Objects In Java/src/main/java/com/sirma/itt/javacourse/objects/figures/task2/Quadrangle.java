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

	public Point getA() {
		return a;
	}

	public void setA(Point a) {
		this.a = a;
	}

	public Point getB() {
		return b;
	}

	public void setB(Point b) {
		this.b = b;
	}

	public Point getC() {
		return c;
	}

	public void setC(Point c) {
		this.c = c;
	}

	public Point getD() {
		return d;
	}

	public void setD(Point d) {
		this.d = d;
	}

	/**
	 * Method that drow quadrangle.
	 */
	private void drow() {
		System.out.println("Point A is " + a);
		System.out.println("Point B is " + b);
		System.out.println("Point C is " + c);
		System.out.println("Point D is " + d);

	}

}
