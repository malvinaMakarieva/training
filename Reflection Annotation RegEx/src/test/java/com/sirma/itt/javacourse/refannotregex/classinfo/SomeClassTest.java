package com.sirma.itt.javacourse.refannotregex.classinfo;

import org.junit.Assert;
import org.junit.Test;

/**
 * Class that test reflection on SomeClass.
 * 
 * @author Malvina Makarieva
 */
public class SomeClassTest {
	SomeClass someClasTestInstance = new SomeClass();
	Class<SomeClass> instanceOfSomeClass = SomeClass.class;

	/**
	 * Test getSomeClassPakege() method from SomeClass.
	 */
	@Test
	public void getSomeClassPakegeTest() {
		String packageInfo = someClasTestInstance.getSomeClassPakege(instanceOfSomeClass);
		Assert.assertEquals("package com.sirma.itt.javacourse.refannotregex.classinfo", packageInfo);

	}
}
