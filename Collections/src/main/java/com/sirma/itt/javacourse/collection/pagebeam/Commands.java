package com.sirma.itt.javacourse.collection.pagebeam;

import java.util.ArrayList;
import java.util.List;

/**
 * Class manages commands.
 * 
 * @author Djitooo
 *
 */
public class Commands {

	final String COMMAND_NEXT = "n";
	final String COMMAND_PREVIOUS = "p";
	final String COMMAND_FIRST = "first";
	final String COMMAND_LAST = "last";
	final String COMMAND_CLOSE = "close";

	private PageBean<String> paging;

	/**
	 * Constructor.
	 * 
	 * @param paging
	 *            list of all pages.
	 */
	public Commands(PageBean<String> paging) {
		this.paging = paging;
	}

	/**
	 * Method executes commands from the user to the pages.
	 * 
	 * @param input
	 *            command from user.
	 */
	public void pageControl(String input) {
		List<String> subListPaging = new ArrayList<String>();
		if (COMMAND_NEXT.equals(input)) {
			subListPaging = paging.next();
			System.out.println(subListPaging);
		}
		if (COMMAND_PREVIOUS.equals(input)) {
			subListPaging = paging.previous();
			System.out.println(subListPaging);
		}
		if (COMMAND_FIRST.equals(input)) {
			subListPaging = paging.firstPage();
			System.out.println(subListPaging);
		}
		if (COMMAND_LAST.equals(input)) {
			subListPaging = paging.lastPage();
			System.out.println(subListPaging);
		}
	}
}
