package com.sirma.itt.javacourse.objects.tree.heterogeneous;

import java.util.ArrayList;

/**
 * Class describes a node of the tree
 * 
 * @author Malvina Makarieva
 */

public class HeterogeneousNode {
	private Object data;
	private HeterogeneousNode parent;
	private ArrayList<HeterogeneousNode> children;

	/**
	 * @param data
	 *            data of element in Tree
	 */
	public HeterogeneousNode(Object data) {
		this.data = data;
	}

	/**
	 * Getter method for data.
	 *
	 * @return the data
	 */
	public Object getData() {
		return data;
	}

	/**
	 * Setter method for data.
	 *
	 * @param data
	 *            the data to set
	 */
	public void setData(Object data) {
		this.data = data;
	}

	/**
	 * Getter method for parent.
	 *
	 * @return the parent
	 */
	public HeterogeneousNode getParent() {
		return parent;
	}

	/**
	 * Setter method for parent.
	 *
	 * @param parent
	 *            the parent to set
	 */
	public void setParent(HeterogeneousNode parent) {
		this.parent = parent;
	}

	/**
	 * Getter method for children.
	 *
	 * @return the children
	 */
	public ArrayList<HeterogeneousNode> getChildren() {
		return children;
	}

	/**
	 * Setter method for children.
	 *
	 * @param children
	 *            the children to set
	 */
	public void setChildren(ArrayList<HeterogeneousNode> children) {
		this.children = children;
	}

	/**
	 * Add node in tree
	 * 
	 * @param child
	 *            every node in tree without root
	 */
	public void addNode(HeterogeneousNode child) {
		children.add(child);
		child.setParent(this);
	}

}
