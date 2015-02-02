package com.sirma.itt.javacourse.collection.pagebeam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Commands {
	final String COMMAND_CLOSE = "close";
	final String COMMAND_PREVIOUS = "p";

	final String COMMAND_FIRST = "firs";
	final String COMMAND_LAST = "last";

	public void tt(PageBean<String> paging) {
		System.out.println(firstPage(paging, 3));
		List<String> subListPaging = new ArrayList<String>(3);
		subListPaging = firstPage(paging, 3);

		Scanner scan = new Scanner(System.in);
		String input = scan.next();

		while (!COMMAND_CLOSE.equals(input)) {
			if ("n".equals(input)) {
				subListPaging = paging.next();
				for (int i = 0; i < subListPaging.size(); i++) {
					System.out.println(subListPaging.get(i));
				}
			}
			if (COMMAND_PREVIOUS.equals(input)) {
				subListPaging = paging.previous();
				for (int i = 0; i < subListPaging.size(); i++) {
					System.out.println(subListPaging.get(i));
				}
			}
			if (COMMAND_FIRST.equals(input)) {
				subListPaging = paging.firstPage();
				for (int i = 0; i < subListPaging.size(); i++) {
					System.out.println(subListPaging.get(i));
				}
			}
			if (COMMAND_LAST.equals(input)) {
				subListPaging = paging.lastPage();
				for (int i = 0; i < subListPaging.size(); i++) {
					System.out.println(subListPaging.get(i));
				}
			}
		}
		scan.close();
	}

	public List<String> firstPage(PageBean<String> paging, int pageSize) {
		List<String> subListPaging = paging.next();
		List<String> result = new ArrayList<String>(pageSize);
		for (int i = 0; i < pageSize; i++) {
			result.add(subListPaging.get(i));
		}
		return subListPaging;
	}
}
