package com.sirma.javacourse.designpatterns.objectpool;

import java.util.Stack;

/**
 * Class contains methods for extraction of resources from the pool and return him back.
 * 
 * @author mmakarieva
 */
public class ObjectPool {
	private int maxNumberInstance;
	private final Stack<Object> pool;
	private final Stack<Object> outPool;

	/**
	 * Constructor of ObjectPool class where create instances of class in object pool.
	 * 
	 * @param maxInsctance
	 *            max number of all instance in pool.
	 */
	public ObjectPool(int maxInsctance) {
		this.maxNumberInstance = maxInsctance;
		pool = new Stack<Object>();
		for (Integer i = 0; i < maxInsctance; i++) {
			pool.push(new String(i.toString()));
		}
		outPool = new Stack<Object>();
	}

	/**
	 * Get resource from the pool.
	 * 
	 * @return resource.
	 * @throws IndexOutOfBoundsException
	 */
	public Object acquire() throws IndexOutOfBoundsException {
		if (!pool.isEmpty()) {
			Object instance = pool.pop();
			outPool.push(instance);
			return instance;
		} else {
			throw new IndexOutOfBoundsException("The pool is empty. No more instance.");
		}
	}

	/**
	 * Frees resources and return them to the pool.
	 * 
	 * @return message with state of the pool.
	 */
	public String release() {
		Object instance = null;
		if (!outPool.isEmpty()) {
			if (pool.size() < maxNumberInstance) {
				instance = outPool.pop();
				pool.push(instance);
			}
			return "Resource " + instance.toString() + " is available";
		} else {
			return "All resource are in pool";
		}

	}

	/**
	 * Getter method for maxNumberInstance.
	 *
	 * @return the maxNumberInstance
	 */
	public int getMaxNumberInstance() {
		return maxNumberInstance;
	}

	/**
	 * Setter method for maxNumberInstance.
	 *
	 * @param maxNumberInstance
	 *            the maxNumberInstance to set
	 */
	public void setMaxNumberInstance(int maxNumberInstance) {
		this.maxNumberInstance = maxNumberInstance;
	}
}
