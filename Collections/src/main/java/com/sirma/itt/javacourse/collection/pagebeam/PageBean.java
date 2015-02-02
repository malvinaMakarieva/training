package com.sirma.itt.javacourse.collection.pagebeam;

import java.util.ArrayList;
import java.util.List;

/**
 * Class for page bean.
 * 
 * @param <E>
 *            element type.
 * @author Malvina Makarieva
 */
public class PageBean<E> {

	private List<E> listPages = new ArrayList<E>();
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
	public PageBean(List<E> listPages, int pageSize) {
		this.listPages = listPages;
		this.PAGE_SIZE = pageSize;
	}

	/**
	 * Gets the items.
	 * 
	 * @return list of items.
	 */
	public List<E> getItems() {
		int start = (currentPage - 1) * PAGE_SIZE;
		int end;
		if (currentPage * PAGE_SIZE > listPages.size()) {
			end = start + (listPages.size() % PAGE_SIZE);
		} else {
			end = start + PAGE_SIZE;
		}
		List<E> listItems = new ArrayList<E>();
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
	public List<E> next() {
		if (!hasNext()) {
			throw new IndexOutOfBoundsException("No more pages");
		}
		currentPage++;
		return getItems();
	}

	/**
	 * Previous page from list.
	 * 
	 * @return previous page.
	 */
	public List<E> previous() {
		if (!hasPrevious()) {
			throw new IndexOutOfBoundsException("No more previous pages");
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
	public List<E> firstPage() {
		currentPage = 1;
		return getItems();
	}

	/**
	 * Last page.
	 * 
	 * @return List of last page elements.
	 */
	public List<E> lastPage() {
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
