package com.sirma.itt.javacourse.collection.pagebeam;

import java.util.ArrayList;

/**
 * Class for page bean.
 * 
 * @param <E>
 *            element type.
 * @author Malvina Makarieva
 */
public class PageBean<E> {

	private ArrayList<E> listPages = new ArrayList<E>();
	private final int PAGE_SIZE;
	private int currentPage = 0;

	/**
	 * Constructor.
	 * 
	 * @param listPages
	 *            list of all pages.
	 * @param pageSize
	 *            the page size
	 */
	public PageBean(ArrayList<E> listPages, int pageSize) {
		this.listPages = listPages;
		this.PAGE_SIZE = pageSize;
	}

	/**
	 * Gets the items.
	 * 
	 * @return list of items.
	 */
	public ArrayList<E> getItems() {
		int start = (currentPage - 1) * PAGE_SIZE;
		int end;
		if (currentPage * PAGE_SIZE > listPages.size()) {
			end = start + (listPages.size() % PAGE_SIZE);
		} else {
			end = start + PAGE_SIZE;
		}
		ArrayList<E> listItems = new ArrayList<E>();
		for (int i = start; i < end; i++) {
			listItems.add(listPages.get(i));
		}
		return listItems;
	}

	/**
	 * Next page from list of pages.
	 * 
	 * @return next page.
	 */
	public ArrayList<E> next() {
		if (!hasNext()) {
			System.out.println("No more pages");
			throw new IndexOutOfBoundsException();
		}
		currentPage++;
		return getItems();
	}

	/**
	 * Previous page from list.
	 * 
	 * @return previous page.
	 */
	public ArrayList<E> previous() {
		if (!hasPrevious()) {
			throw new IndexOutOfBoundsException();
		} else
			currentPage--;
		return getItems();
	}

	/**
	 * Checks for next page.
	 * 
	 * @return true if have next page.
	 */
	public boolean hasNext() {
		return (currentPage * PAGE_SIZE < listPages.size());
	}

	/**
	 * Checks for previous.
	 * 
	 * @return true if have previous page.
	 */
	public boolean hasPrevious() {
		return (currentPage != 0);
	}

	/**
	 * First page.
	 * 
	 * @return List of first page elements.
	 */
	public ArrayList<E> firstPage() {
		currentPage = 1;
		return getItems();
	}

	/**
	 * Last page.
	 * 
	 * @return List of last page elements.
	 */
	public ArrayList<E> lastPage() {
		if (listPages.size() % PAGE_SIZE > 0) {
			currentPage = (listPages.size() / PAGE_SIZE) + 1;
		} else {
			currentPage = listPages.size() / PAGE_SIZE;
		}
		return getItems();
	}

	/**
	 * Gets the current page number.
	 * 
	 * @return the current page number
	 */
	public int getCurrentPageNumber() {
		return currentPage;
	}

}
