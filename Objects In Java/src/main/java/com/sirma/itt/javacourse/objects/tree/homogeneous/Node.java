package com.sirma.itt.javacourse.objects.tree.homogeneous;

import java.util.ArrayList;
import java.util.List;

/**
 * Class describes a node of the tree
 * 
 * @param <T>
 *            type of structure defined later
 * @author Malvina Makarieva
 */

public class Node<T> {
	private T data;
	private Node<T> parent;
	private List<Node<T>> children;

	/**
	 * Constructor of class Node.
	 * 
	 * @param dataType
	 *            type of data in tree.
	 */
	public Node(T dataType) {
		this.data = dataType;
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
	 * Getter method for parent.
	 *
	 * @return the parent
	 */
	public Node<T> getParent() {
		return parent;
	}

	/**
	 * Setter method for parent.
	 *
	 * @param parent
	 *            the parent to set
	 */
	public void setParent(Node<T> parent) {
		this.parent = parent;
	}

	/**
	 * Getter method for children.
	 *
	 * @return the children
	 */
	public List<Node<T>> getChildren() {
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
	 * Add child in tree
	 * 
	 * @param child
	 *            new child in tree
	 */
	public void add(Node<T> child) {
		children.add(child);
		child.setParent(this);
	}

}
