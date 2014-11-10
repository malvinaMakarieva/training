package com.sirma.itt.javacourse.refannotregex.classinfo;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

/**
 * Class that test reflection on SomeClass.
 * 
 * @author Malvina Makarieva
 */
public class ReflectionFuncrionsTest {
	ReflectionFunction reflection = new ReflectionFunction();
	Class<SomeClass> instanceOfSomeClass = SomeClass.class;
	Class<TestClass> testClassInstnce = TestClass.class;

	/**
	 * Test getSomeClassPakege() method from ReflectionFunction.
	 */
	@Test
	public void testGetSomeClassPakege() {
		String packageInfo = reflection.getSomeClassPakege(testClassInstnce);
		Assert.assertEquals("package com.sirma.itt.javacourse.refannotregex.classinfo", packageInfo);

	}

	/**
	 * Test getClassConstructor() method from ReflectionFunction
	 */
	@Test
	public void testGetClassConstructor() {
		List<String> expectedList = new ArrayList<String>();
		expectedList.add("public com.sirma.itt.javacourse.refannotregex.classinfo.TestClass()");
		List<String> actualList = reflection.getClassConstructor(testClassInstnce);
		Assert.assertEquals(expectedList, actualList);

	}

	/**
	 * Test getMethodInfo() method from class ReflectionFunction
	 */
	@Test
	public void testGetMethodInfo() {
		List<String> expectedList = new ArrayList<String>();
		expectedList
				.add("public final void java.lang.Object.wait(long,int) throws java.lang.InterruptedException");
		expectedList
				.add("public final native void java.lang.Object.wait(long) throws java.lang.InterruptedException");
		expectedList
				.add("public final void java.lang.Object.wait() throws java.lang.InterruptedException");
		expectedList.add("public boolean java.lang.Object.equals(java.lang.Object)");
		expectedList.add("public java.lang.String java.lang.Object.toString()");
		expectedList.add("public native int java.lang.Object.hashCode()");
		expectedList.add("public final native java.lang.Class java.lang.Object.getClass()");
		expectedList.add("public final native void java.lang.Object.notify()");
		expectedList.add("public final native void java.lang.Object.notifyAll()");

		List<String> actualList = reflection.getMethodInfo(testClassInstnce);
		Assert.assertEquals(expectedList, actualList);
	}

	/**
	 * Test fieldValue() method from class ReflectionFunction
	 * 
	 * @throws NoSuchFieldException
	 * @throws IllegalArgumentException
	 * @throws IllegalAccessException
	 */
	@Test
	public void testFieldValue() throws NoSuchFieldException, IllegalArgumentException,
			IllegalAccessException {
		List<String> expectedList = new ArrayList<String>();
		expectedList
				.add("public java.lang.String com.sirma.itt.javacourse.refannotregex.classinfo.TestClass.someString = jumo");
		expectedList
				.add("private int com.sirma.itt.javacourse.refannotregex.classinfo.TestClass.someInt = 10");
		List<String> actualList = reflection.fieldValue(testClassInstnce);
		Assert.assertEquals(expectedList, actualList);
	}

}
