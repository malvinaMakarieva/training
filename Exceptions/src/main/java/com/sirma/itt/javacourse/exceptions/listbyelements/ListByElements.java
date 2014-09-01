package com.sirma.itt.javacourse.exceptions.listbyelements;

/**
 * The class contains methods for processing the list of elements.
 */
public class ListByElements {

	Object arrayList[] = new Object[5];
	int lastFilledIndex = 0;
	Object obj;

	/**
	 * Default constructor.
	 */
	public ListByElements() {

	}

	/**
	 * Method for adding an item to the list
	 * 
	 * @param obj
	 *            element of the type of object that is added to the list.
	 * @throws ArrayIndexOutOfBoundsException
	 *             exception is thrown when the list is full.
	 */
	public void add(Object obj) throws ArrayIndexOutOfBoundsException {
		if (lastFilledIndex == 0) {
			arrayList[lastFilledIndex] = obj;
			lastFilledIndex++;
		} else {
			if (lastFilledIndex > arrayList.length) {
				lastFilledIndex--;
				throw new ArrayIndexOutOfBoundsException("List is full!");
			}
			arrayList[lastFilledIndex] = obj;
			lastFilledIndex++;
		}
	}

	/**
	 * Remove the last item in the list.
	 * 
	 * @throws NullPointerException
	 *             exception is thrown when the list is empty.
	 */
	public void remove() throws NullPointerException {
		if (lastFilledIndex == 0) {
			throw new NullPointerException("List is empty!");
		}
		lastFilledIndex--;
		arrayList[lastFilledIndex] = null;
	}

	/**
	 * Prints the all elements.
	 *
	 * @return the string of all elements in [].
	 */
	public String printAllElements() {
		String list = "[ ";
		for (int i = 0; i < arrayList.length; i++) {
			list += arrayList[i] + " ";
		}
		list += "]";
		return list;
	}
}
