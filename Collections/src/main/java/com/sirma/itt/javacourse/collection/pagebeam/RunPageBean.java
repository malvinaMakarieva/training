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
		Commands command = new Commands(paging);

		Scanner scan = new Scanner(System.in);
		String input = "n";

		while (!"close".equals(input)) {
			command.pageControl(input);
			input = scan.next();
		}
		scan.close();
	}
}
