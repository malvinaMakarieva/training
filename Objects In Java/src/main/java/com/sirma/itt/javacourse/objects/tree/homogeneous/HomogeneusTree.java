package com.sirma.itt.javacourse.objects.tree.homogeneous;

import java.util.ArrayList;

/**
 * Class describes a homogeneus tree.
 * 
 * @param <T>
 *            type of data in tree.
 * @author Malvina Makarieva
 */
public class HomogeneusTree<T> {
	private Node<T> root;

	/**
	 * Constructor
	 * 
	 * @param rootData
	 *            data about root data of root
	 */
	public HomogeneusTree(T rootData) {
		root = new Node<T>(rootData);
		root.setData(rootData);
		root.setChildren(new ArrayList<Node<T>>());
	}

}
