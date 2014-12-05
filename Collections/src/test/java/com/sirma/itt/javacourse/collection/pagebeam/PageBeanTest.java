package com.sirma.itt.javacourse.collection.pagebeam;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Test class for PageBean.
 * 
 * @author Malvina Makarieva
 */
public class PageBeanTest {
	private ArrayList<Integer> content = new ArrayList<Integer>();
	private PageBean<Integer> paging;

	/**
	 * Before every test this method will run to create list of elemet for pages.
	 */
	@Before
	public void setUpBeforeClass() {
		content.add(1);
		content.add(2);
		content.add(3);
		content.add(4);
		content.add(5);
		content.add(6);
		paging = new PageBean<Integer>(content, 3);

	}

	/**
	 * Method test method for checking the available next page.
	 */
	@Test
	public void testHasNext() {
		Assert.assertEquals(true, paging.hasNext());
		paging.next();
		paging.next();
		Assert.assertEquals(false, paging.hasNext());
	}

	/**
	 * Method test method for checking the available previous page.
	 */
	@Test
	public void testHasPrevious() {
		Assert.assertEquals(false, paging.hasPrevious());
		paging.next();
		Assert.assertEquals(true, paging.hasPrevious());
	}

	/**
	 * Method test method for positioning the front page.
	 */
	@Test
	public void testFirstPage() {
		paging.next();
		paging.firstPage();
		Assert.assertEquals(1, paging.getCurrentPageNumber());
	}

	/**
	 * Method test method for positioning the last page.
	 */
	@Test
	public void testLastPage() {
		paging.lastPage();
		Assert.assertEquals(2, paging.getCurrentPageNumber());
	}

	/**
	 * Test throwing exception in next() method.
	 */
	@Test(expected = IndexOutOfBoundsException.class)
	public void exceptionNext() {
		paging.next();
		paging.next();
		paging.next();

	}

	/**
	 * Test throwing exception in privious() method.
	 */
	@Test(expected = IndexOutOfBoundsException.class)
	public void exceptionPrivious() {
		paging.previous();
	}
}
