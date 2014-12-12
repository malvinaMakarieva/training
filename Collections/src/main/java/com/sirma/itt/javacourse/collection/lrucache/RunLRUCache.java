package com.sirma.itt.javacourse.collection.lrucache;

/**
 * Class that run LeastRecentlyUsedCache method.
 * 
 * @author Malvina Makarieva
 */
public class RunLRUCache {
	/**
	 * Main method.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		LeastRecentlyUsedCache cache = new LeastRecentlyUsedCache(3);

		cache.addCache("a");
		cache.addCache("b");
		cache.addCache("c");
		System.out.println(cache.getQueue());
		cache.addCache("d");
		System.out.println(cache.getQueue());
		cache.addCache("g");
		System.out.println(cache.getQueue());
	}
}
