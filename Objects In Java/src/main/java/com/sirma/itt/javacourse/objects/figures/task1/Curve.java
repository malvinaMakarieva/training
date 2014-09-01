package com.sirma.itt.javacourse.objects.figures.task1;

/**
 * Class represents the data needed to draw the curve and constructors .
 * 
 * @author Malvina Makarieva
 */
public class Curve extends Point {
	Point a;
	int angle;
	float lenght;

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
		this.lenght = currentLenght;
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
	 * Getter method for lenght.
	 *
	 * @return the lenght
	 */
	public float getLenght() {
		return lenght;
	}

	/**
	 * Setter method for lenght.
	 *
	 * @param lenght
	 *            the lenght to set
	 */
	public void setLenght(float lenght) {
		this.lenght = lenght;
	}

	/**
	 * Method that draw curve.
	 */
	public void drow() {
		System.out.println("Point of curve is " + a);
		System.out.println("Angle of curve is " + angle);
		System.out.println("Lenght of curve is " + lenght);
	}

}
