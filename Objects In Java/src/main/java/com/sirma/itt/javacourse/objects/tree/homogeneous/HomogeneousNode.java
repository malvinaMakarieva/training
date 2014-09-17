package com.sirma.itt.javacourse.objects.tree.homogeneous;

import java.util.ArrayList;

/**
 * Class describes a node of the tree
 * 
 * @param <T>
 *            type of structure defined later
 * @author Malvina Makarieva
 */
public class HomogeneousNode<T> {
	private T data;
	private HomogeneousNode<T> parent;
	private ArrayList<HomogeneousNode<T>> children;

	/**
	 * Default constructor.
	 */
	public HomogeneousNode() {

	}

	/**
	 * The constructor of the node.
	 * 
	 * @param data
	 *            value of a node.
	 */
	public HomogeneousNode(T data) {
		this.data = data;
		this.setChildren(new ArrayList<HomogeneousNode<T>>());
	}

	/**
	 * A method providing easier access to the add function of the list of children of the node.
	 * 
	 * @param child
	 *            the child node to be added
	 */
	public void add(HomogeneousNode<T> child) {
		if (child.getParent() != null) {
			throw new IllegalArgumentException();
		}
		children.add(child);
		child.setParent(this);
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
	public HomogeneousNode<T> getParent() {
		return parent;
	}

	/**
	 * Setter method for parent.
	 *
	 * @param parent
	 *            the parent to set
	 */
	public void setParent(HomogeneousNode<T> parent) {
		this.parent = parent;
	}

	/**
	 * Getter method for children.
	 *
	 * @return the children
	 */

	/**
	 * Getter method for children.
	 * 
	 * @param index
	 *            of element from the list.
	 * @return element from the list.
	 */
	public HomogeneousNode<T> getChildren(int index) {
		return children.get(index);
	}

	/**
	 * Setter method for children.
	 *
	 * @param children
	 *            the children to set
	 */
	public void setChildren(ArrayList<HomogeneousNode<T>> children) {
		this.children = children;
	}
}
