package com.sirma.itt.javacourse.objects.figures.task2;

/**
 * Class represents the data needed to draw the parallelgram and constructors.
 * 
 * @author Malvina Makarieva
 */
public class Parallelgram extends Rectangle {
	private Rectangle a;
	private float firstAngle;
	private float secondAngle;

	/**
	 * Default constructor
	 */
	public Parallelgram() {

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
	public Parallelgram(Rectangle basisRect, float currentFirstAngle, float currentSecondAngle) {
		this.a = basisRect;
		this.firstAngle = currentFirstAngle;
		this.secondAngle = currentSecondAngle;
	}

	/**
	 * Getter method for a.
	 *
	 * @return the a
	 */
	public Rectangle getA() {
		return a;
	}

	/**
	 * Setter method for a.
	 *
	 * @param a
	 *            the a to set
	 */
	public void setA(Rectangle a) {
		this.a = a;
	}

	/**
	 * Getter method for firstAngle.
	 *
	 * @return the firstAngle
	 */
	public float getFirstAngle() {
		return firstAngle;
	}

	/**
	 * Setter method for firstAngle.
	 *
	 * @param firstAngle
	 *            the firstAngle to set
	 */
	public void setFirstAngle(float firstAngle) {
		this.firstAngle = firstAngle;
	}

	/**
	 * Getter method for secondAngle.
	 *
	 * @return the secondAngle
	 */
	public float getSecondAngle() {
		return secondAngle;
	}

	/**
	 * Setter method for secondAngle.
	 *
	 * @param secondAngle
	 *            the secondAngle to set
	 */
	public void setSecondAngle(float secondAngle) {
		this.secondAngle = secondAngle;
	}

	/**
	 * Method that draw square.
	 */
	public void drow() {
		System.out.println("Info about basis rectangle" + a);
		System.out.println("Fisrt angle" + firstAngle);
		System.out.println("Secont angle" + secondAngle);

	}
}
