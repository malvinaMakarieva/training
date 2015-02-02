package com.sirma.itt.javacourse.collection.lrucache;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Implementation of LRU Cache.
 * 
 * @author Malvina Makarieva
 */
public class LeastRecentlyUsedCache {
	private final int CAPASITY;
	private Queue<Object> queue = new LinkedList<Object>();

	/**
	 * Constructor.
	 * 
	 * @param capasity
	 *            of cache.
	 */
	public LeastRecentlyUsedCache(int capasity) {
		this.CAPASITY = capasity;
	}

	/**
	 * Getter method for queue.
	 *
	 * @return the queue
	 */
	public Queue<Object> getQueue() {
		return queue;
	}

	/**
	 * Setter method for queue.
	 *
	 * @param queue
	 *            the queue to set
	 */
	public void setQueue(Queue<Object> queue) {
		this.queue = queue;
	}

	/**
	 * Getter method for CAPASITY.
	 *
	 * @return the CAPASITY
	 */
	public int getCAPASITY() {
		return CAPASITY;
	}

	/**
	 * Insert object to cache.
	 * 
	 * @param data
	 *            that will be added to the cache.
	 */
	public void insertCache(Object data) {
		if (queue.size() >= CAPASITY) {
			queue.poll();
		}
		queue.add(data);
	}

	/**
	 * Adding data to cache. If data alredy in queue then remove and adiing in front. If not in
	 * queue then just adding.
	 * 
	 * @param data
	 *            that will be added to the cache.
	 * @return adding data.
	 */
	public Object addCache(Object data) {
		if (queue.contains(data)) {
			queue.remove(data);
		}
		insertCache(data);
		return data;
	}
}
