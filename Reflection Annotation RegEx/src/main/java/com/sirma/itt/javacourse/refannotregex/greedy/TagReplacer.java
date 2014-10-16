package com.sirma.itt.javacourse.refannotregex.greedy;

import java.util.regex.PatternSyntaxException;

/**
 * Class contains a method to remove the tag from code.
 * 
 * @author Malvina Makarieva
 */
public class TagReplacer {
	/**
	 * Method replaces tag <x>...</x> with </x>.
	 * 
	 * @param code
	 *            string of some code.
	 * @return code without tag - <x>...</x>
	 * @throws PatternSyntaxException
	 */
	public String replaceTag(String code) throws PatternSyntaxException {
		String pattern = "<x[^<]*[^>]/x>";
		String newCode = code.replaceAll(pattern, "<x/>");
		return newCode;
	}
}
