package com.sirma.itt.javacourse.objects.figures.task3;


/**
 * Class represents the data needed to draw the polyline and constructors.
 * 
 * @author Malvina Makarieva
 */

public class PolyLine extends Point {
	private int pointsNumber;
	private Point[] allPoints;

	/**
	 * Default constructor.
	 */
	public PolyLine() {
		allPoints = new Point[pointsNumber];
	}

	/**
	 * Constructor of class PolyLine.
	 * 
	 * @param currentPointInFiigure
	 *            number of all sections or corners of the figure.
	 * @param currentpoints
	 *            array with the coordinates of all points.
	 */
	public PolyLine(int currentPointInFiigure, Point[] currentpoints) {
		this.pointsNumber = currentPointInFiigure;
		this.allPoints = currentpoints;
	}

	/**
	 * Getter method for pointsNumber.
	 *
	 * @return the pointsNumber
	 */
	public int getPointsNumber() {
		return pointsNumber;
	}

	/**
	 * Setter method for pointsNumber.
	 *
	 * @param pointsNumber
	 *            the pointsNumber to set
	 */
	public void setPointsNumber(int pointsNumber) {
		this.pointsNumber = pointsNumber;
	}

	/**
	 * Getter method for allPoints.
	 *
	 * @return the allPoints
	 */
	public Point[] getAllPoints() {
		return allPoints;
	}

	/**
	 * Setter method for allPoints.
	 *
	 * @param allPoints
	 *            the allPoints to set
	 */
	public void setAllPoints(Point[] allPoints) {
		this.allPoints = allPoints;
	}

	/**
	 * A public string method that prints the array's elements to screen.
	 * 
	 * @param array
	 *            array entered by the user, which will search for items.
	 * @return array element in format "[1, 2, 4, 5]".
	 */
	public String print(Point array[]) {
		String result = "[";
		for (int i = 0; i < array.length; i++) {
			result += array[i] + " ";
		}
		return (result += "]");
	}

	/**
	 * Method that draw polyLine.
	 */
	public void drow() {
		System.out.println("Number of all point in fugure is " + pointsNumber);
		System.out.println("Array ot points is" + print(allPoints));

	}
}
