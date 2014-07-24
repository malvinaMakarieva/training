package com.sirma.itt.javacourse.objects.figures.task2;

/**
 * Class represents the data needed to draw the parallelgram and constructors.
 * 
 * @author Malvina Makarieva
 */
public class Parallelgram extends Rectangle {
	Rectangle a;
	float firstAngle;
	float secondAngle;

	/**
	 * Default constructor
	 */
	Parallelgram() {

	}

	/**
	 * Constructor of Parallelgram class
	 * 
	 * @param basisRect
	 *            data which coincide with those for rectangle
	 * @param currentFirstAngle
	 *            bottom left corner
	 * @param currentSecondAngle
	 *            top right corner.
	 */
	Parallelgram(Rectangle basisRect, float currentFirstAngle, float currentSecondAngle) {
		this.a = basisRect;
		this.firstAngle = currentFirstAngle;
		this.secondAngle = currentSecondAngle;
	}

	public Rectangle getA() {
		return a;
	}

	public void setA(Rectangle a) {
		this.a = a;
	}

	public float getAngle1() {
		return firstAngle;
	}

	public void setAngle1(float angle1) {
		this.firstAngle = angle1;
	}

	public float getAngle2() {
		return secondAngle;
	}

	public void setAngle2(float angle2) {
		this.secondAngle = angle2;
	}

	/**
	 * Method that drow square.
	 */
	private void drow() {
		System.out.println("Info about basis rectangle" + a);
		System.out.println("Fisrt angle" + firstAngle);
		System.out.println("Secont angle" + secondAngle);

	}
}
