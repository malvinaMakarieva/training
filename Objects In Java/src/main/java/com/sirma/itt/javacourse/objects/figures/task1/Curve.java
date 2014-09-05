package com.sirma.itt.javacourse.objects.figures.task1;

/**
 * Class represents the data needed to draw the curve and constructors .
 * 
 * @author Malvina Makarieva
 */
public class Curve extends Point {
	private Point a;
	private int angle;
	private float length;

	/**
	 * Default constructor.
	 */
	public Curve() {

	}

	/**
	 * Constructor of Curve class
	 * 
	 * @param point
	 *            object from class Point represent point of x and y from coordinate system.
	 * @param currentAngle
	 *            Angle below which should be bent in the curve drawing.
	 * @param currentLenght
	 *            The length of the curve.
	 */
	public Curve(Point point, int currentAngle, float currentLenght) {
		this.a = point;
		this.angle = currentAngle;
		this.length = currentLenght;
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
	 * Getter method for angle.
	 *
	 * @return the angle
	 */
	public int getAngle() {
		return angle;
	}

	/**
	 * Setter method for angle.
	 *
	 * @param angle
	 *            the angle to set
	 */
	public void setAngle(int angle) {
		this.angle = angle;
	}

	/**
	 * Getter method for length.
	 *
	 * @return the length
	 */
	public float getLenght() {
		return length;
	}

	/**
	 * Setter method for length.
	 *
	 * @param lenght
	 *            the length to set
	 */
	public void setLenght(float lenght) {
		this.length = lenght;
	}

	/**
	 * Method that draw curve.
	 */
	public void drow() {
		System.out.println("Point of curve is " + a);
		System.out.println("Angle of curve is " + angle);
		System.out.println("Lenght of curve is " + length);
	}

}
