package com.sirma.itt.javacourse.collection.lrucache;

import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class LRU<K, V> {
	// Maximum capacity for the LRU cache.
	private final int capacity;
	// Queue to store the recently used keys.
	private Queue<K> queue;
	// Key-Value store to maintain the actual object.
	private Map<K, V> map;

	/**
	 * Initial capacity for the LRU Cache.
	 * 
	 * @param capacity
	 */
	public LRU(final int capacity) {
		this.capacity = capacity;
		this.queue = new LinkedBlockingQueue<K>();
		this.map = new HashMap<K, V>(capacity);
	}

	/**
	 * Check whether the items exists in the cache. Returns null if key doesn't exists in the cache.
	 * 
	 * @param key
	 * @return
	 */
	public V get(final K key) {
		return map.get(key);
	}

	/**
	 * Add new value to the LRU Cache. If the key already exists, the key will be promoted to the
	 * front of the cache. Neither the key nor the value can be null.
	 * 
	 * @param key
	 * @param value
	 * @throws NullPointerException
	 */
	public void put(final K key, final V value) { // synchronized
		if (key == null || value == null) {
			throw new NullPointerException();
		}
		if (map.containsKey(key)) {
			queue.remove(key);
		}
		while (queue.size() >= capacity) {
			K expiredKey = queue.poll();
			if (expiredKey != null) {
				map.remove(expiredKey);
			}
		}
		queue.add(key);
		map.put(key, value);
	}
}