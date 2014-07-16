package com.sirma.itt.javacourse.intro.arraysmedian;

import java.util.Scanner;

/**
 * 
 * @author Malvina Makarieva
 */
public class Run {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int i;
		int element = 0;
		int left = 0;
		int right = 0;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Length of array = ");
		int length = input.nextInt();
		
		int [] array = new int [length];
		
		for(i=0; i<length;i++){
			System.out.print("array[" + i + "] = ");
			element =input.nextInt();
			array[i]=element;
		}
		
		Median center = new Median();
		System.out.println("Median is element with index " + center.findMedian(array));
		
	}

}
