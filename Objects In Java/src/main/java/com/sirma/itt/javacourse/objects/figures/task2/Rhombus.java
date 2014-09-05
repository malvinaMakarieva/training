package com.sirma.itt.javacourse.objects.figures.task2;

/**
 * Class represents the data needed to draw the rhombus and constructors.
 * 
 * @author Malvina Makarieva
 */
public class Rhombus extends Square {
	private Square a;
	private float length;
	private float firstAngle;
	private float secondAngle;

	/**
	 * Default constructor.
	 */
	Rhombus() {

	}

	/**
	 * Constructor of class Rhombus.
	 * 
	 * @param basisSquare
	 *            data which coincide with those for square
	 * @param currentFirstAngle
	 *            bottom left corner.
	 * @param width
	 *            length of the thigh.
	 * @param currentSecondAngle
	 *            top right corner.
	 */
	Rhombus(Square basisSquare, float width, float currentFirstAngle, float currentSecondAngle) {
		this.a = basisSquare;
		this.length = width;
		this.firstAngle = currentFirstAngle;
		this.secondAngle = currentSecondAngle;
	}

	/**
	 * Getter method for a.
	 *
	 * @return the a
	 */
	public Square getA() {
		return a;
	}

	/**
	 * Setter method for a.
	 *
	 * @param a
	 *            the a to set
	 */
	public void setA(Square a) {
		this.a = a;
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
	 * Method that draw rhombus.
	 */
	public void drow() {
		System.out.println("Point and saids are" + a);
		System.out.println("Length of the thigh " + length);
		System.out.println("First angle is " + firstAngle);
		System.out.println("Second angle is " + secondAngle);

	}
}
