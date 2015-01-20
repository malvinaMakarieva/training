package com.sirma.javacourse.designpatterns.objectpool;

import org.junit.Assert;
import org.junit.Test;

/**
 * Class test ObjectPool class.
 * 
 * @author mmakarieva
 */
public class ObjectPoolTest {
	ObjectPool poolTest = new ObjectPool(3);

	/**
	 * Method test work of pool.
	 */
	@Test
	public void testPool() {
		ObjectPool poolTest = new ObjectPool(3);
		Assert.assertEquals("All resource are in pool", poolTest.release());
		Assert.assertEquals("2", poolTest.acquire());
		Assert.assertEquals("1", poolTest.acquire());
		Assert.assertEquals("Resource 1 is available", poolTest.release());
		Assert.assertEquals("Resource 2 is available", poolTest.release());
		Assert.assertEquals("2", poolTest.acquire());
		Assert.assertEquals("1", poolTest.acquire());
		Assert.assertEquals("0", poolTest.acquire());
		Assert.assertEquals("Resource 0 is available", poolTest.release());
		Assert.assertEquals("Resource 1 is available", poolTest.release());
		Assert.assertEquals("Resource 2 is available", poolTest.release());

	}

	/**
	 * Method test exception.
	 * 
	 * @throws IndexOutOfBoundsException
	 */
	@Test(expected = IndexOutOfBoundsException.class)
	public void testObjectPoolExceptionAcquire() throws IndexOutOfBoundsException {
		ObjectPool poolTest = new ObjectPool(1);
		poolTest.acquire();
		poolTest.acquire();
	}
}
