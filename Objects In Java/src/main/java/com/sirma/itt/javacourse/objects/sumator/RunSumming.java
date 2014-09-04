package com.sirma.itt.javacourse.objects.sumator;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * Class to carry out the methods of the class Sumator
 * 
 * @author Malvina Makarieva
 */
public class RunSumming {
	/**
	 * Method that runs all methods form class Sumator
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		Sumator sumator = new Sumator();
		int sumIn = sumator.sum(5, 10);
		System.out.println("Sum in integer is " + sumIn);

		float sumFloat = sumator.sum(1.3f, 2.6f);
		System.out.printf("Sum in floating-points is " + "%.2f", sumFloat);
		System.out.println();

		double sumDouble = sumator.sum(458.23568d, 598.32657584d);
		System.out.printf("Sum in floating-points is " + "%.4f", sumDouble);
		System.out.println();

		String sumString = sumator.sum("7589", "8131");
		System.out.println("Sum in strings is " + sumString);

		BigInteger a = new BigInteger("9900");
		BigInteger b = new BigInteger("20165421");
		BigInteger sumBigInt = sumator.sum(a, b);
		System.out.println("Sum in BigInteger is " + sumBigInt);

		BigDecimal a1 = new BigDecimal("9900.089");
		BigDecimal b2 = new BigDecimal("20165421.786");
		BigDecimal sumBigDecimal = sumator.sum(a1, b2);
		System.out.printf("Sum in BigDecimal is " + "%.5f", sumBigDecimal);
	}
}
