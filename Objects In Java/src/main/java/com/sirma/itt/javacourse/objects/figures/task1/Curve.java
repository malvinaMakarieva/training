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

	public Point getA() {
		return a;
	}

	public void setA(Point a) {
		this.a = a;
	}

	public int getAngle() {
		return angle;
	}

	public void setAngle(int angle) {
		this.angle = angle;
	}

	public float getLenght() {
		return lenght;
	}

	public void setLenght(float lenght) {
		this.lenght = lenght;
	}

	/**
	 * Method that drow curve.
	 */
	private void drow() {
		System.out.println("Point of curve is " + a);
		System.out.println("Angle of curve is " + angle);
		System.out.println("Lenght of curve is " + lenght);
	}

}
