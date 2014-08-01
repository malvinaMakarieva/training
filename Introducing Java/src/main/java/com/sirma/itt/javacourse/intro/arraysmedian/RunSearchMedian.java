package com.sirma.itt.javacourse.intro.arraysmedian;

import com.sirma.itt.javacourse.intro.array.Array;

/**
 * This class read from console and running method findMedian(int[] array)
 * 
 * @author Malvina Makarieva
 */
public class RunSearchMedian {

	/**
	 * Main method that run findMedian(int[] array)
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		Array ar = new Array();
		int array[];
		array = ar.readArrayFromConsol();

		Median center = new Median();
		int idexOfArrayMedian = center.findMedian(array);
		System.out.println("Median is element " + array[idexOfArrayMedian] + " (with index "
				+ idexOfArrayMedian + ")");
	}

}
