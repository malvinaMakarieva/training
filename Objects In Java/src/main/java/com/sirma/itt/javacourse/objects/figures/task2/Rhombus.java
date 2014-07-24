package com.sirma.itt.javacourse.objects.figures.task2;

/**
 * Class represents the data needed to draw the rhombus and constructors.
 * 
 * @author Malvina Makarieva
 */
public class Rhombus extends Square {
	Square a;
	float lenght;
	float firstAngle;
	float secondAngle;

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
		this.lenght = width;
		this.firstAngle = currentFirstAngle;
		this.secondAngle = currentSecondAngle;
	}

	public Square getA() {
		return a;
	}

	public void setA(Square a) {
		this.a = a;
	}

	public float getFirstAngle() {
		return firstAngle;
	}

	public void setFirstAngle(float firstAngle) {
		this.firstAngle = firstAngle;
	}

	public float getSecondAngle() {
		return secondAngle;
	}

	public void setSecondAngle(float secondAngle) {
		this.secondAngle = secondAngle;
	}

	/**
	 * Method that drow rhombus.
	 */
	private void drow() {
		System.out.println("Point and saids are" + a);
		System.out.println("Length of the thigh " + lenght);
		System.out.println("First angle is " + firstAngle);
		System.out.println("Second angle is " + secondAngle);

	}
}
