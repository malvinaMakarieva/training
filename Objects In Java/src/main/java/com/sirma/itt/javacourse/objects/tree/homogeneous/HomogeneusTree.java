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
	 * Default constructor.
	 */
	public HomogeneusTree() {

	}

	/**
	 * Constructor of homogeneus tree.
	 * 
	 * @param rootData
	 *            data about root data of root
	 */
	public HomogeneusTree(T rootData) {
		root = new Node<T>(rootData);
		root.setChildren(new ArrayList<Node<T>>());
	}

	/**
	 * Getter method for root.
	 *
	 * @return the root
	 */
	public Node<T> getRoot() {
		return root;
	}

	/**
	 * Setter method for root.
	 *
	 * @param root
	 *            the root to set
	 */
	public void setRoot(Node<T> root) {
		this.root = root;
	}

	/**
	 * Print the tree and show the parent nodes and there children if any.
	 * 
	 * @param root
	 *            root of the tree
	 * @param symbol
	 *            string for visual representing the tree and the nodes children
	 */
	public void print(Node<T> root, String symbol) {
		if (this.root == null) {
			return;
		}
		System.out.println(symbol + root.getData());
		Node<T> child = null;
		for (int i = 0; i < root.getChildren().size(); i++) {
			child = root.getChildren().get(i);
			print(child, symbol + symbol);
		}
	}
}
