package com.sirma.itt.javacourse.collection.pagebeam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Run class for PageBean.
 * 
 * @author Malvina Makarieva
 */
public class RunPageBean {

	/**
	 * The main method.
	 * 
	 * @param args
	 *            the arguments
	 */
	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("element 1");
		list.add("element 2");
		list.add("element 3");

		list.add("element 4");
		list.add("element 5");
		list.add("element 6");

		list.add("element 7");

		PageBean<String> paging = new PageBean<String>(list, 3);
		Commands command = new Commands();

		List<String> subListPaging = new ArrayList<String>();
		subListPaging = command.firstPage(paging, 3);
		System.out.println(subListPaging);
		// for (int i = 0; i < subListPaging.size(); i++) {
		// System.out.println(subListPaging.get(i));
		// }
		Scanner scan = new Scanner(System.in);
		String input = scan.next();
		while (!"close".equals(input)) {
			if ("n".equals(input)) {
				subListPaging = paging.next();
				for (int i = 0; i < subListPaging.size(); i++) {
					System.out.println(subListPaging.get(i));
				}
			}
			if ("p".equals(input)) {
				subListPaging = paging.previous();
				for (int i = 0; i < subListPaging.size(); i++) {
					System.out.println(subListPaging.get(i));
				}
			}
			if ("first".equals(input)) {
				subListPaging = paging.firstPage();
				for (int i = 0; i < subListPaging.size(); i++) {
					System.out.println(subListPaging.get(i));
				}
			}
			if ("last".equals(input)) {
				subListPaging = paging.lastPage();
				for (int i = 0; i < subListPaging.size(); i++) {
					System.out.println(subListPaging.get(i));
				}
			}
			input = scan.next();
		}
		scan.close();
	}
}
