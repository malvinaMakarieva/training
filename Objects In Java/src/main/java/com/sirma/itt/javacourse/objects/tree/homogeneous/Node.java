package com.sirma.itt.javacourse.objects.tree.homogeneous;

import java.util.ArrayList;

/**
 * Class describes a node of the tree
 * 
 * @param <T>
 *            type of structure defined later
 * @author Malvina Makarieva
 */

public class Node<T> {
	private T data;
	private ArrayList<Node<T>> children;

	/**
	 * Default constructor.
	 */
	public Node() {

	}

	/**
	 * Constructor of node.
	 * 
	 * @param data
	 *            data of element in Tree
	 */
	public Node(T data) {
		this.data = data;
		this.setChildren(new ArrayList<Node<T>>());
	}

	/**
	 * Getter method for data.
	 *
	 * @return the data
	 */
	public T getData() {
		return data;
	}

	/**
	 * Setter method for data.
	 *
	 * @param data
	 *            the data to set
	 */
	public void setData(T data) {
		this.data = data;
	}

	/**
	 * Getter method for children.
	 *
	 * @return the children
	 */
	public ArrayList<Node<T>> getChildren() {
		return children;
	}

	/**
	 * Setter method for children.
	 *
	 * @param children
	 *            the children to set
	 */
	public void setChildren(ArrayList<Node<T>> children) {
		this.children = children;
	}

	/**
	 * Add node in tree
	 * 
	 * @param child
	 *            every node in tree without root
	 */
	public void addNode(Node<T> child) {
		children.add(child);
	}
}
