package com.sirma.itt.javacourse.collection.lrucache;

import java.util.concurrent.ConcurrentLinkedQueue;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test class for methods from class LeastRecentlyUsedCache.
 * 
 * @author Malvina Makarieva
 */
public class LRUMyTest {
	public LeastRecentlyUsedCache lru = new LeastRecentlyUsedCache(3);

	/**
	 * Test adding in queue.
	 */
	@Test
	public void testAddCache() {
		ConcurrentLinkedQueue<Object> queueExpected = new ConcurrentLinkedQueue<Object>();

		lru.addCache("1");
		lru.addCache("2");
		lru.addCache("3");
		lru.addCache("4");
		lru.addCache("5");

		queueExpected.add(3);
		queueExpected.add(4);
		queueExpected.add(5);
		Assert.assertEquals(queueExpected.toString(), lru.getQueue().toString());
	}
}
