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
	Class<SomeClass> testClassInstnce = SomeClass.class;

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
		expectedList.add("public com.sirma.itt.javacourse.refannotregex.classinfo.SomeClass()");
		expectedList
				.add("public com.sirma.itt.javacourse.refannotregex.classinfo.SomeClass(java.lang.String,java.lang.String)");
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
				.add("public void com.sirma.itt.javacourse.refannotregex.classinfo.SomeClass.setSomeInt(int)");
		expectedList
				.add("public int com.sirma.itt.javacourse.refannotregex.classinfo.SomeClass.getSomeInt()");
		expectedList
				.add("public void com.sirma.itt.javacourse.refannotregex.classinfo.SomeClass.setSomeString(java.lang.String)");
		expectedList
				.add("public java.lang.String com.sirma.itt.javacourse.refannotregex.classinfo.SomeClass.getSomeString()");
		expectedList
				.add("private boolean com.sirma.itt.javacourse.refannotregex.classinfo.SomeClass.someBooleanMethod()");
		expectedList
				.add("public void com.sirma.itt.javacourse.refannotregex.classinfo.SomeClass.setPrivateString(java.lang.String)");
		expectedList
				.add("public java.lang.String com.sirma.itt.javacourse.refannotregex.classinfo.SomeClass.getPrivateString()");

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
		expectedList.add("someString = juno");
		expectedList.add("someChar = a");
		expectedList.add("privateString = luna");
		expectedList.add("someInt = 0");
		List<String> actualList = reflection.fieldValue(testClassInstnce);
		Assert.assertEquals(expectedList, actualList);
	}

}
