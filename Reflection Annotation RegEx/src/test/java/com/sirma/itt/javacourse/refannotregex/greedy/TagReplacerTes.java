package com.sirma.itt.javacourse.refannotregex.greedy;

import org.junit.Assert;
import org.junit.Test;

/**
 * Class test method class TagReplacer.
 * 
 * @author Malvina Makarieva
 */
public class TagReplacerTes {
	TagReplacer replacer = new TagReplacer();

	/**
	 * Test method replaceTag().
	 */
	@Test
	public void replaceTagTest() {
		String testString = "<x><b></b><x>Hello world</x>" + "<b>sdfsdf</b><x>Good"
				+ "morning</x><x>69</x><x>sdfsdfsdf</x>" + "</x>";
		String expectedResult = "<x><b></b><x/>" + "<b>sdfsdf</b><x/><x/><x/>" + "</x>";
		String testResult = replacer.replaceTag(testString);

		Assert.assertEquals(expectedResult, testResult);
	}
}
