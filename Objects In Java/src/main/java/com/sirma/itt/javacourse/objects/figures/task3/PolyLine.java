package com.sirma.itt.javacourse.objects.figures.task3;

import com.sirma.itt.javacourse.objects.figures.task1.Point;

/**
 * Class represents the data needed to draw the polyline and constructors.
 * 
 * @author Malvina Makarieva
 */

public class PolyLine extends Point {
	int pointsNumber;
	Point[] allPoints = new Point[pointsNumber];

	/**
	 * Default constructor.
	 */
	public PolyLine() {

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

	public int getPointsNumber() {
		return pointsNumber;
	}

	public void setPointsNumber(int pointsNumber) {
		this.pointsNumber = pointsNumber;
	}

	public Point[] getAllPoints() {
		return allPoints;
	}

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
		for (int i = 0; i < array.length - 1; i++) {
			result += array[i] + ", ";
		}
		return (result += array[array.length - 1] + "]");
	}

	/**
	 * Method that drow polyLine.
	 */
	private void drow() {
		System.out.println("Number of all point in fugure is " + pointsNumber);
		System.out.println("Array ot points is" + print(allPoints));

	}
}
