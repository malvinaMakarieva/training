package com.sirma.itt.javacourse.objects.sumator;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * Class that has various functions for summing.
 * 
 * @author Malvina Makarieva
 */
public class Sumator {

	/**
	 * Method collects two numbers of type int.
	 * 
	 * @param a
	 *            integer entered by the user
	 * @param b
	 *            integer entered by the user
	 * @return the sum of a and b in integer format
	 */
	public int sum(int a, int b) {
		int sum = 0;
		sum = a + b;
		return sum;
	}

	/**
	 * Method collects two numbers of type float.
	 * 
	 * @param a
	 *            float entered by the user
	 * @param b
	 *            float entered by the user
	 * @return the sum of a and b in float format
	 */
	public float sum(float a, float b) {
		float sum = 0;
		sum = a + b;
		return sum;
	}

	/**
	 * Method collects two numbers of type double.
	 * 
	 * @param a
	 *            double entered by the user
	 * @param b
	 *            double entered by the user
	 * @return the sum of a and b in double format
	 */
	public double sum(double a, double b) {
		double sum = 0.0;
		sum = a + b;
		return sum;
	}

	/**
	 * Method collects two numbers of type String.
	 * 
	 * @param a
	 *            String entered by the user
	 * @param b
	 *            String entered by the user
	 * @return the sum of a and b in String format
	 */
	public String sum(String a, String b) {
		String result = "";
		int length;
		int transfer;
		int digit;

		if (a.length() < b.length()) {
			while (a.length() != b.length()) {
				a = "0" + a;
			}
		} else if (a.length() > b.length()) {
			while (a.length() != b.length()) {
				b = "0" + b;
			}
		}

		transfer = 0;
		length = a.length();
		for (int i = length - 1; i > -1; i--) {
			digit = (a.charAt(i) - '0') + (b.charAt(i) - '0') + transfer;
			if (digit > 9) {
				transfer = digit / 10;
				digit = digit % 10;
			} else {
				transfer = 0;
			}
			result = String.valueOf(digit) + result;
		}
		if (transfer > 0) {
			result = String.valueOf(transfer) + result;
		}
		return result;
	}

	/**
	 * Method collects two numbers of type BigInteger.
	 * 
	 * @param a
	 *            BigInteger entered by the user
	 * @param b
	 *            BigInteger entered by the user
	 * @return the sum of a and b in BigInteger format
	 */
	public BigInteger sum(BigInteger a, BigInteger b) {
		BigInteger sum = BigInteger.ZERO;
		sum = sum.add(a);
		sum = sum.add(b);
		return sum;
	}

	/**
	 * Method collects two numbers of type BigDecimal.
	 * 
	 * @param a
	 *            BigDecemal entered by the user
	 * @param b
	 *            BigDecemal entered by the user
	 * @return the sum of a and b in BigDecimal format
	 */
	public BigDecimal sum(BigDecimal a, BigDecimal b) {
		BigDecimal sum = BigDecimal.ZERO;
		sum = sum.add(a);
		sum = sum.add(b);
		return sum;

	}

}
