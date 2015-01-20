package com.sirma.javacourse.designpatterns.objectpool;

/**
 * Class to run ObjectPool class.
 * 
 * @author mmakarieva
 */
public class RunBbjectPool {
	/**
	 * Main method.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		ObjectPool pool = new ObjectPool(3);

		System.out.println(pool.acquire());
		System.out.println(pool.acquire());
		System.out.println(pool.acquire());

		System.out.println(pool.release());

		System.out.println(pool.release());
		System.out.println(pool.release());

		System.out.println(pool.acquire());
		System.out.println(pool.acquire());
		System.out.println(pool.acquire());
		System.out.println(pool.release());

	}

}
